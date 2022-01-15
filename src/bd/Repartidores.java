package bd;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Repartidores extends ConexionBD {
    
    public void obtenerRepartidor (JTable tabla) {
        DefaultTableModel modelo = eliminarFilasTabla(tabla);
        try {
            st = con.createStatement();
            rs = st.executeQuery("EXEC OBTENER_REPARTIDORES");
            
            Object[] fila = new Object[3];
            
            while (rs.next()) {                
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2).toUpperCase();
                fila[2] = rs.getString(3).toUpperCase();
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al consultar los repartidores");
        }
    }
    
     public void obtenerNombreRepartidores (JComboBox combo) {
        combo.removeAllItems();
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT nombre FROM REPARTIDOR");
            
            while (rs.next()) {                
                combo.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            System.err.println("Error al consultar los repartidores");
        }
    }
    
    public String obtenerIdNombreRepartidor (String nombre) {
        String repartidor = "";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT id_repartidor FROM REPARTIDOR WHERE nombre = '" + nombre + "'");
            
            rs.next();
            repartidor = rs.getString(1);
        } catch (Exception e) {
            System.err.println("Error al consultar los repartidores");
        }
        return repartidor;
    }
    
    public Object[] obtenerRepartidor (String id) {
        Object[] objeto = new Object[3];
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM REPARTIDOR WHERE id_repartidor = " + id);
            
            while (rs.next()) {                
                objeto[0] = rs.getInt(1);
                objeto[1] = rs.getString(2);
                objeto[2] = rs.getString(3);
            }
        } catch (Exception e) {
            System.err.println("Error al consultar los repartidores");
        }
        return objeto;
    }
    
    public void obtenerBusquedaRepartidor (JTable tabla, String nombre) {
        DefaultTableModel modelo = eliminarFilasTabla(tabla);
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM REPARTIDOR WHERE nombre LIKE '%" + nombre + "%'");
            
            Object[] fila = new Object[3];
            
            while (rs.next()) {                
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2).toUpperCase();
                fila[2] = rs.getString(3).toUpperCase();
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al consultar los repartidores: " + e);
        }
    }
    
    public boolean agregarRepartidor (String idRepartidor, String nombreRepartidor, String direccion) {
        try {
            st = con.createStatement();
            st.execute("EXEC Insertar_Repartidor " + idRepartidor +
                    ", '" + nombreRepartidor + "', '" + direccion + "'");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean eliminarRepartidor (String idRepartidor) {
        try {
            st = con.createStatement();
            st.execute("DELETE FROM REPARTIDOR WHERE id_repartidor = " + idRepartidor);

            st = con.createStatement();
            rs = st.executeQuery("SELECT COUNT(id_repartidor) FROM REPARTIDOR "
                    + "WHERE id_repartidor = " + idRepartidor);
            
            rs.next();
            
            if (rs.getInt(1) == 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error al eliminar repartidor: " + e);
            return false;
        }
    }
    
    public boolean editarRepartidor (String idRepartidor, String nombre, String direccion) {
        try {
            st = con.createStatement();
            st.execute("UPDATE REPARTIDOR SET nombre = '" + nombre 
                    + "', direccion = '" + direccion + "' WHERE id_repartidor = " + idRepartidor);

            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM REPARTIDOR WHERE id_repartidor = " + idRepartidor);
            
            rs.next();
            
            return rs.getString(2).equals(nombre) && rs.getString(3).equals(direccion);
        } catch (Exception e) {
            System.err.println("Error al eliminar repartidor: " + e);
            return false;
        }
    }
}
