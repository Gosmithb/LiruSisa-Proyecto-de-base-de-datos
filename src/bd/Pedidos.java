package bd;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Pedidos extends ConexionBD {

    public void obtenerPedidosActuales(JTable tabla) {
        DefaultTableModel modelo = eliminarFilasTabla(tabla);
        String fecha = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT id_pedido, REPARTIDOR.nombre, CLIENTE.nombre,"
                    + " fecha FROM PEDIDO, REPARTIDOR, CLIENTE WHERE "
                    + "PEDIDO.id_cliente = CLIENTE.id_cliente AND "
                    + "PEDIDO.id_repartidor = REPARTIDOR.id_repartidor AND fecha = '" + fecha + "'");

            Object[] fila = new Object[4];

            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2).toUpperCase();
                fila[2] = rs.getString(3).toUpperCase();
                fila[3] = rs.getDate(4);
                modelo.addRow(fila);
            }

            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al consultar los pedidos");
        }
    }

    public void obtenerPedidos(JTable tabla, String fecha) {
        DefaultTableModel modelo = eliminarFilasTabla(tabla);
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT id_pedido, REPARTIDOR.nombre, CLIENTE.nombre,"
                    + " fecha FROM PEDIDO, REPARTIDOR, CLIENTE WHERE "
                    + "PEDIDO.id_cliente = CLIENTE.id_cliente AND "
                    + "PEDIDO.id_repartidor = REPARTIDOR.id_repartidor AND fecha = '" + fecha + "'");

            Object[] fila = new Object[4];

            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2).toUpperCase();
                fila[2] = rs.getString(3).toUpperCase();
                fila[3] = rs.getDate(4);
                modelo.addRow(fila);
            }

            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al consultar los pedidos: " + e);
        }
    }

    public void obtenerFechas(JComboBox combo) {
        combo.removeAllItems();
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT fecha FROM PEDIDO GROUP BY fecha");

            while (rs.next()) {
                combo.addItem(rs.getDate(1) + "");
            }
        } catch (Exception e) {
            System.err.println("Error al consultar los pedidos");
        }
    }

    public Object[] obtenerDetallesPedido(String id, JTable tabla) {
        DefaultTableModel modelo = eliminarFilasTabla(tabla);
        Object[] objeto = new Object[4];
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT REPARTIDOR.nombre, CLIENTE.nombre, CLIENTE.direccion, "
                    + "fecha FROM PEDIDO, REPARTIDOR, CLIENTE WHERE "
                    + "PEDIDO.id_cliente = CLIENTE.id_cliente AND "
                    + "PEDIDO.id_repartidor = REPARTIDOR.id_repartidor AND id_pedido = " + id);

            while (rs.next()) {
                objeto[0] = rs.getString(1);
                objeto[1] = rs.getString(2);
                objeto[2] = rs.getString(3);
                objeto[3] = rs.getDate(4);
            }

            st = con.createStatement();
            rs = st.executeQuery("SELECT nombre, cantidad FROM DETALLES_PEDIDO, PIZZA "
                    + "WHERE DETALLES_PEDIDO.id_pizza = PIZZA.id_pizza AND id_pedido = " + id);

            Object[] fila = new Object[2];
            while (rs.next()) {
                fila[0] = rs.getString(1);
                fila[1] = rs.getInt(2);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al consultar las pizzas");
        }
        return objeto;
    }

    public void obtenerBusquedaPizza(JTable tabla, String nombre) {
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

    public boolean agregarPedido(String idRepartidor, String idCliente, String fecha, Object[] pedido) {
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT COUNT(id_pedido) FROM PEDIDO");

            rs.next();
            int id = rs.getInt(1) + 953;

            st = con.createStatement();
            st.execute("EXEC Insertar_pedido " + id + ", " + idRepartidor + ", " + idCliente + ", '" + fecha + "'");

            agregarDetallesPedido(id, pedido);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void agregarDetallesPedido(int id, Object[] pedido) {
        try {
            for (int i = 0; i < pedido.length; i++) {
                String[] detalles = (String[]) pedido[i];
                st = con.createStatement();
                st.execute("INSERT INTO DETALLES_PEDIDO VALUES (" 
                        + id + ", " + detalles[0] + ", " + detalles[1] +")");
            }
        } catch (Exception e) {
        }
    }

    public boolean eliminarPedido(String id) {
        try {
            st = con.createStatement();
            st.execute("DELETE FROM DETALLES_PEDIDO WHERE id_pedido = " + id);

            st = con.createStatement();
            st.execute("DELETE FROM PEDIDO WHERE id_pedido = " + id);
            
            st = con.createStatement();
            rs = st.executeQuery("SELECT COUNT(id_pedido) FROM PEDIDO "
                    + "WHERE id_pedido = " + id);

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
}
