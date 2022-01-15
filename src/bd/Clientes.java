package bd;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Clientes extends ConexionBD {
    
    public void obtenerClientes (JTable tabla) {
        DefaultTableModel modelo = eliminarFilasTabla(tabla);
        try {
            st = con.createStatement();
            rs = st.executeQuery("EXEC OBTENER_CLIENTES");
            
            Object[] fila = new Object[3];
            
            while (rs.next()) {                
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2).toUpperCase();
                fila[2] = rs.getString(3).toUpperCase();
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al consultar los clientes");
        }
    }
    
    public void obtenerNombreClientes (JComboBox combo) {
        combo.removeAllItems();
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT nombre FROM CLIENTE");
            
            while (rs.next()) {                
                combo.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            System.err.println("Error al consultar los clientes");
        }
    }
    
    public String obtenerIdNombreCliente (String nombre) {
        String cliente = "";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT id_cliente FROM CLIENTE WHERE nombre = '" + nombre + "'");
            
            rs.next();
            cliente = rs.getString(1);
        } catch (Exception e) {
            System.err.println("Error al consultar los clientes");
        }
        return cliente;
    }
    
    public String obtenerDireccionNombreCliente (String nombre) {
        String cliente = "";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT direccion FROM CLIENTE WHERE nombre = '" + nombre + "'");
            
            rs.next();
            cliente = rs.getString(1);
        } catch (Exception e) {
            System.err.println("Error al consultar los clientes");
        }
        return cliente;
    }
    
    public Object[] obtenerCliente (String id) {
        Object[] objeto = new Object[3];
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM CLIENTE WHERE id_cliente = " + id);
            
            while (rs.next()) {                
                objeto[0] = rs.getInt(1);
                objeto[1] = rs.getString(2);
                objeto[2] = rs.getString(3);
            }
        } catch (Exception e) {
            System.err.println("Error al consultar los clientes");
        }
        return objeto;
    }
    
    public void obtenerBusquedaClientes (JTable tabla, String nombre) {
        DefaultTableModel modelo = eliminarFilasTabla(tabla);
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM CLIENTE WHERE nombre LIKE '%" + nombre + "%'");
            
            Object[] fila = new Object[3];
            
            while (rs.next()) {                
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2).toUpperCase();
                fila[2] = rs.getString(3).toUpperCase();
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al consultar los clientes: " + e);
        }
    }
    
    public boolean agregarCliente (String idCliente, String nombreCliente, String direccion) {
        try {
            st = con.createStatement();
            st.execute("EXEC Insertar_cliente " + idCliente +
                    ", '" + nombreCliente + "', '" + direccion + "'");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean eliminarCliente (String idCliente) {
        try {
            st = con.createStatement();
            st.execute("DELETE FROM CLIENTE WHERE id_cliente = " + idCliente);

            st = con.createStatement();
            rs = st.executeQuery("SELECT COUNT(id_cliente) FROM CLIENTE "
                    + "WHERE id_cliente = " + idCliente);
            
            rs.next();
            
            if (rs.getInt(1) == 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error al eliminar el cliente: " + e);
            return false;
        }
    }
    
    public boolean editarCliente (String idCliente, String nombre, String direccion) {
        try {
            st = con.createStatement();
            st.execute("UPDATE CLIENTE SET nombre = '" + nombre 
                    + "', direccion = '" + direccion + "' WHERE id_cliente = " + idCliente);

            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM CLIENTE WHERE id_cliente = " + idCliente);
            
            rs.next();
            
            return rs.getString(2).equals(nombre) && rs.getString(3).equals(direccion);
        } catch (Exception e) {
            System.err.println("Error al editar el cliente: " + e);
            return false;
        }
    }
}
