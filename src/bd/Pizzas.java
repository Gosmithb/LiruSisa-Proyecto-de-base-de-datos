package bd;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Pizzas extends ConexionBD {
    
    public void obtenerPizzas (JTable tabla) {
        DefaultTableModel modelo = eliminarFilasTabla(tabla);
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM PIZZA");
            
            Object[] fila = new Object[4];
            
            while (rs.next()) {                
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2).toUpperCase();
                fila[2] = rs.getString(3).toUpperCase();
                fila[3] = rs.getDouble(4);
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al consultar las pizzas");
        }
    }
    
    public void obtenerNombrePizzas (JComboBox combo) {
        combo.removeAllItems();
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT nombre FROM PIZZA");
            
            while (rs.next()) {                
                combo.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            System.err.println("Error al consultar las pizzas");
        }
    }
    
    public String[] obtenerNombrePizzas () {
        String[] pizzas = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT COUNT(id_pizza) FROM PIZZA");
            rs.next();
            pizzas = new String[rs.getInt(1)];
            
            st = con.createStatement();
            rs = st.executeQuery("SELECT nombre FROM PIZZA");
            
            for (int i = 0; i < pizzas.length; i++) {
                rs.next();
                pizzas[i] = rs.getString(1);
            }
        } catch (Exception e) {
            System.err.println("Error al consultar las pizzas");
        }
        return pizzas;
    }
    
    public String obtenerIdNombrePizza (String nombre) {
        String repartidor = "";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT id_pizza FROM PIZZA WHERE nombre = '" + nombre + "'");
            
            rs.next();
            repartidor = rs.getString(1);
        } catch (Exception e) {
            System.err.println("Error al consultar las pizzas");
        }
        return repartidor;
    }
    
    public Object[] obtenerPizza (String id) {
        Object[] objeto = new Object[4];
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM PIZZA WHERE id_pizza = " + id);
            
            while (rs.next()) {                
                objeto[0] = rs.getInt(1);
                objeto[1] = rs.getString(2);
                objeto[2] = rs.getString(3);
                objeto[3] = rs.getDouble(4);
            }
        } catch (Exception e) {
            System.err.println("Error al consultar las pizzas");
        }
        return objeto;
    }
    
    public void obtenerBusquedaPizza (JTable tabla, String nombre) {
        DefaultTableModel modelo = eliminarFilasTabla(tabla);
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM PIZZA WHERE nombre LIKE '%" + nombre + "%'");
                
            Object[] fila = new Object[4];
            
            while (rs.next()) {                
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2).toUpperCase();
                fila[2] = rs.getString(3).toUpperCase();
                fila[3] = rs.getDouble(4);
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al consultar las pizzas: " + e);
        }
    }
    
    public boolean agregarPizza (String idPizza, String nombre, String ingredientes, String precio) {
        try {
            st = con.createStatement();
            st.execute("EXEC Insertar_pizza " + idPizza +
                    ", '" + nombre + "', '" + ingredientes + "', " + precio);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean eliminarPizza (String id) {
        try {
            st = con.createStatement();
            st.execute("DELETE FROM PIZZA WHERE id_pizza = " + id);

            st = con.createStatement();
            rs = st.executeQuery("SELECT COUNT(id_pizza) FROM PIZZA "
                    + "WHERE id_pizza = " + id);
            
            rs.next();
            
            if (rs.getInt(1) == 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error al eliminar la pizza: " + e);
            return false;
        }
    }
    
    public boolean editarPizza (String id, String nombre, String ingredientes, String precio) {
        try {
            st = con.createStatement();
            st.execute("UPDATE PIZZA SET nombre = '" + nombre 
                    + "', ingredientes = '" + ingredientes + "', precio = " 
                    + precio + " WHERE id_pizza = " + id);

            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM PIZZA WHERE id_pizza = " + id);
            
            rs.next();
            
            return rs.getString(2).equals(nombre) && rs.getString(3).equals(ingredientes);
        } catch (Exception e) {
            System.err.println("Error al editar la pizza: " + e);
            return false;
        }
    }
}
