package visuales;

import bd.Clientes;
import bd.ConexionBD;
import bd.Pedidos;
import bd.Pizzas;
import bd.Repartidores;
import clases.RoundedPanel;
import clases.TextPrompt;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.PanelUI;

public class Principal extends javax.swing.JFrame {

    private Repartidores ObjRepartidores;
    private Clientes ObjClientes;
    private Pizzas ObjPizzas;
    private Pedidos ObjPedidos;
    private int x, y, pos = 1, panelActual = 1;

    public Principal() {
        initComponents();

        ObjRepartidores = new Repartidores();
        ObjClientes = new Clientes();
        ObjPizzas = new Pizzas();
        ObjPedidos = new Pedidos();

        ObjPedidos.obtenerPedidosActuales(t_pedidosActuales);
        ObjPedidos.obtenerFechas(cb_fechas);
        if (cb_fechas.getItemCount() > 0) {
            ObjPedidos.obtenerPedidos(t_historialPedidos, cb_fechas.getItemAt(0));
        }

        cambiarPanel(pos);

        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 15, 15);
        AWTUtilities.setWindowShape(this, forma);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logoGrande.png")).getImage());
        separadorHistorialPedidos.setVisible(false);
        TextPrompt placeHolder = new TextPrompt("BUSCAR REPARTIDOR", tf_busquedaRepartidor);
        placeHolder = new TextPrompt("BUSCAR CLIENTE", tf_busquedaCliente);
        placeHolder = new TextPrompt("BUSCAR PIZZA", tf_busquedaPizza);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new RoundedPanel(15, new Color(255, 255, 255), new Color(255, 103, 27));
        p_toolbar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_cerrar = new javax.swing.JLabel();
        lb_minimizar = new javax.swing.JLabel();
        p_barraLateral = p_barraLateral = new RoundedPanel(10, new Color(255, 145, 27), new Color(255, 145, 27));
        jLabel3 = new javax.swing.JLabel();
        p_botonPedidos = new javax.swing.JPanel();
        separadorPedidos = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        p_botonPizzas = new javax.swing.JPanel();
        separadorPizzas = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        p_botonClientes = new javax.swing.JPanel();
        separadorClientes = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        p_botonRepartidores = new javax.swing.JPanel();
        separadorRepartidores = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        p_contenedor = new javax.swing.JPanel();
        p_pedidos = new javax.swing.JPanel();
        p_toolbarPedidos = p_toolbarPedidos = new RoundedPanel(10, new Color(255, 145, 27), new Color(255, 145, 27));
        p_cambiarPedidos = new javax.swing.JPanel();
        separadorPedidosActuales = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        p_cambiarHistorialPedidos = new javax.swing.JPanel();
        separadorHistorialPedidos = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        p_contenedorPedidos = new javax.swing.JPanel();
        p_pedidosActuales = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        t_pedidosActuales = new javax.swing.JTable();
        btn_agregarPedido = new javax.swing.JButton();
        btn_eliminarPedido = new javax.swing.JButton();
        btn_detallesPedido = new javax.swing.JButton();
        p_historialPedidos = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        t_historialPedidos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        cb_fechas = new javax.swing.JComboBox<>();
        btn_detallePedidoAnterior = new javax.swing.JButton();
        p_pizzas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_pizzas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        tf_busquedaPizza = new javax.swing.JTextField();
        lb_borrarBusquedaPizza = new javax.swing.JLabel();
        btn_agregarPizza = btn_agregarPizza = new RoundedPanel(50, new Color(255, 103, 27), new Color(255, 103, 27));
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btn_editarPizza = btn_editarPizza = new RoundedPanel(50, new Color(255, 255, 255), new Color(255, 103, 27));
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_eliminarPizza = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        p_clientes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_clientes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        tf_busquedaCliente = new javax.swing.JTextField();
        lb_borrarBusquedaCliente = new javax.swing.JLabel();
        btn_agregarCliente = btn_agregarCliente = new RoundedPanel(50, new Color(255, 103, 27), new Color(255, 103, 27));
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btn_editarCliente = btn_editarCliente = new RoundedPanel(50, new Color(255, 255, 255), new Color(255, 103, 27));
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btn_eliminarCliente = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        p_repartidores = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_repartidores = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        tf_busquedaRepartidor = new javax.swing.JTextField();
        lb_borrarBusquedaRepartidor = new javax.swing.JLabel();
        btn_agregarRepartidor = btn_agregarRepartidor = new RoundedPanel(50, new Color(255, 103, 27), new Color(255, 103, 27));
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btn_editarRepartidor = btn_editarRepartidor = new RoundedPanel(50, new Color(255, 255, 255), new Color(255, 103, 27));
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btn_eliminarRepartidor = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        p_principal.setBackground(new java.awt.Color(255, 255, 255));
        p_principal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p_principalMouseDragged(evt);
            }
        });
        p_principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_principalMousePressed(evt);
            }
        });

        p_toolbar.setBackground(new java.awt.Color(255, 103, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoChico.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LIRU SISA");

        lb_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarNormal.png"))); // NOI18N
        lb_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_cerrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseReleased(evt);
            }
        });

        lb_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizarNormal.png"))); // NOI18N
        lb_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_minimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_minimizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_minimizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_minimizarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p_toolbarLayout = new javax.swing.GroupLayout(p_toolbar);
        p_toolbar.setLayout(p_toolbarLayout);
        p_toolbarLayout.setHorizontalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lb_minimizar)
                .addGap(18, 18, 18)
                .addComponent(lb_cerrar)
                .addContainerGap())
        );
        p_toolbarLayout.setVerticalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lb_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        p_barraLateral.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoMediano.png"))); // NOI18N

        p_botonPedidos.setBackground(new java.awt.Color(255, 145, 27));
        p_botonPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_botonPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_botonPedidosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_botonPedidosMousePressed(evt);
            }
        });

        separadorPedidos.setForeground(new java.awt.Color(255, 255, 255));
        separadorPedidos.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PEDIDOS");

        javax.swing.GroupLayout p_botonPedidosLayout = new javax.swing.GroupLayout(p_botonPedidos);
        p_botonPedidos.setLayout(p_botonPedidosLayout);
        p_botonPedidosLayout.setHorizontalGroup(
            p_botonPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_botonPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separadorPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p_botonPedidosLayout.setVerticalGroup(
            p_botonPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_botonPedidosLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addComponent(separadorPedidos, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        p_botonPizzas.setBackground(new java.awt.Color(255, 145, 27));
        p_botonPizzas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_botonPizzasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_botonPizzasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_botonPizzasMousePressed(evt);
            }
        });

        separadorPizzas.setForeground(new java.awt.Color(255, 255, 255));
        separadorPizzas.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PIZZAS");

        javax.swing.GroupLayout p_botonPizzasLayout = new javax.swing.GroupLayout(p_botonPizzas);
        p_botonPizzas.setLayout(p_botonPizzasLayout);
        p_botonPizzasLayout.setHorizontalGroup(
            p_botonPizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_botonPizzasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separadorPizzas, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p_botonPizzasLayout.setVerticalGroup(
            p_botonPizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_botonPizzasLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addComponent(separadorPizzas, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        p_botonClientes.setBackground(new java.awt.Color(255, 145, 27));
        p_botonClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_botonClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_botonClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_botonClientesMousePressed(evt);
            }
        });

        separadorClientes.setForeground(new java.awt.Color(255, 255, 255));
        separadorClientes.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CLIENTES");

        javax.swing.GroupLayout p_botonClientesLayout = new javax.swing.GroupLayout(p_botonClientes);
        p_botonClientes.setLayout(p_botonClientesLayout);
        p_botonClientesLayout.setHorizontalGroup(
            p_botonClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_botonClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separadorClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p_botonClientesLayout.setVerticalGroup(
            p_botonClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_botonClientesLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addComponent(separadorClientes, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        p_botonRepartidores.setBackground(new java.awt.Color(255, 145, 27));
        p_botonRepartidores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_botonRepartidoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_botonRepartidoresMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p_botonRepartidoresMouseReleased(evt);
            }
        });

        separadorRepartidores.setForeground(new java.awt.Color(255, 255, 255));
        separadorRepartidores.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("REPARTIDORES");

        javax.swing.GroupLayout p_botonRepartidoresLayout = new javax.swing.GroupLayout(p_botonRepartidores);
        p_botonRepartidores.setLayout(p_botonRepartidoresLayout);
        p_botonRepartidoresLayout.setHorizontalGroup(
            p_botonRepartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_botonRepartidoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separadorRepartidores, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p_botonRepartidoresLayout.setVerticalGroup(
            p_botonRepartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_botonRepartidoresLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addComponent(separadorRepartidores, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout p_barraLateralLayout = new javax.swing.GroupLayout(p_barraLateral);
        p_barraLateral.setLayout(p_barraLateralLayout);
        p_barraLateralLayout.setHorizontalGroup(
            p_barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_barraLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_botonPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_botonPizzas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_botonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_botonRepartidores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p_barraLateralLayout.setVerticalGroup(
            p_barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_barraLateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(p_botonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p_botonPizzas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p_botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p_botonRepartidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_contenedor.setLayout(new java.awt.CardLayout());

        p_pedidos.setBackground(new java.awt.Color(255, 255, 255));

        p_toolbarPedidos.setBackground(new java.awt.Color(255, 255, 255));

        p_cambiarPedidos.setBackground(new java.awt.Color(255, 145, 27));
        p_cambiarPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarPedidosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarPedidosMousePressed(evt);
            }
        });

        separadorPedidosActuales.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PEDIDOS");

        javax.swing.GroupLayout p_cambiarPedidosLayout = new javax.swing.GroupLayout(p_cambiarPedidos);
        p_cambiarPedidos.setLayout(p_cambiarPedidosLayout);
        p_cambiarPedidosLayout.setHorizontalGroup(
            p_cambiarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorPedidosActuales)
            .addGroup(p_cambiarPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_cambiarPedidosLayout.setVerticalGroup(
            p_cambiarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarPedidosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorPedidosActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_cambiarHistorialPedidos.setBackground(new java.awt.Color(255, 145, 27));
        p_cambiarHistorialPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_cambiarHistorialPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarHistorialPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarHistorialPedidosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarHistorialPedidosMousePressed(evt);
            }
        });

        separadorHistorialPedidos.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("HISTORIAL DE PEDIDOS");

        javax.swing.GroupLayout p_cambiarHistorialPedidosLayout = new javax.swing.GroupLayout(p_cambiarHistorialPedidos);
        p_cambiarHistorialPedidos.setLayout(p_cambiarHistorialPedidosLayout);
        p_cambiarHistorialPedidosLayout.setHorizontalGroup(
            p_cambiarHistorialPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorHistorialPedidos)
            .addGroup(p_cambiarHistorialPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_cambiarHistorialPedidosLayout.setVerticalGroup(
            p_cambiarHistorialPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarHistorialPedidosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorHistorialPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout p_toolbarPedidosLayout = new javax.swing.GroupLayout(p_toolbarPedidos);
        p_toolbarPedidos.setLayout(p_toolbarPedidosLayout);
        p_toolbarPedidosLayout.setHorizontalGroup(
            p_toolbarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toolbarPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_cambiarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p_cambiarHistorialPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        p_toolbarPedidosLayout.setVerticalGroup(
            p_toolbarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toolbarPedidosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_toolbarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_cambiarPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_cambiarHistorialPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        p_contenedorPedidos.setLayout(new java.awt.CardLayout());

        p_pedidosActuales.setBackground(new java.awt.Color(255, 255, 255));

        t_pedidosActuales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE DEL REPARTIDOR", "NOMBRE DEL CLIENTE", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_pedidosActuales.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(t_pedidosActuales);
        if (t_pedidosActuales.getColumnModel().getColumnCount() > 0) {
            t_pedidosActuales.getColumnModel().getColumn(0).setMinWidth(50);
            t_pedidosActuales.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btn_agregarPedido.setText("AGREGAR PEDIDO");
        btn_agregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPedidoActionPerformed(evt);
            }
        });

        btn_eliminarPedido.setText("ELIMINAR PEDIDO");
        btn_eliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarPedidoActionPerformed(evt);
            }
        });

        btn_detallesPedido.setText("DETALLES DEL PEDIDO");
        btn_detallesPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detallesPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_pedidosActualesLayout = new javax.swing.GroupLayout(p_pedidosActuales);
        p_pedidosActuales.setLayout(p_pedidosActualesLayout);
        p_pedidosActualesLayout.setHorizontalGroup(
            p_pedidosActualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_pedidosActualesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_pedidosActualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addGroup(p_pedidosActualesLayout.createSequentialGroup()
                        .addComponent(btn_agregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(btn_eliminarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_pedidosActualesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_detallesPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p_pedidosActualesLayout.setVerticalGroup(
            p_pedidosActualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_pedidosActualesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_pedidosActualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregarPedido)
                    .addComponent(btn_eliminarPedido))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_detallesPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        p_contenedorPedidos.add(p_pedidosActuales, "card2");

        p_historialPedidos.setBackground(new java.awt.Color(255, 255, 255));

        t_historialPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE DEL REPARTIDOR", "NOMBRE DEL CLIENTE", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_historialPedidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(t_historialPedidos);
        if (t_historialPedidos.getColumnModel().getColumnCount() > 0) {
            t_historialPedidos.getColumnModel().getColumn(0).setMinWidth(50);
            t_historialPedidos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("FECHA:");

        cb_fechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_fechasActionPerformed(evt);
            }
        });

        btn_detallePedidoAnterior.setText("DETALLES DEL PEDIDO");
        btn_detallePedidoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detallePedidoAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_historialPedidosLayout = new javax.swing.GroupLayout(p_historialPedidos);
        p_historialPedidos.setLayout(p_historialPedidosLayout);
        p_historialPedidosLayout.setHorizontalGroup(
            p_historialPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_historialPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_historialPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(p_historialPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_fechas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_detallePedidoAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p_historialPedidosLayout.setVerticalGroup(
            p_historialPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_historialPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_historialPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p_historialPedidosLayout.createSequentialGroup()
                        .addGroup(p_historialPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_fechas)
                            .addComponent(btn_detallePedidoAnterior))
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        p_contenedorPedidos.add(p_historialPedidos, "card3");

        javax.swing.GroupLayout p_pedidosLayout = new javax.swing.GroupLayout(p_pedidos);
        p_pedidos.setLayout(p_pedidosLayout);
        p_pedidosLayout.setHorizontalGroup(
            p_pedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbarPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_pedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_contenedorPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_pedidosLayout.setVerticalGroup(
            p_pedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_pedidosLayout.createSequentialGroup()
                .addComponent(p_toolbarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_contenedorPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        p_contenedor.add(p_pedidos, "card2");

        p_pizzas.setBackground(new java.awt.Color(255, 255, 255));

        t_pizzas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "PIZZA", "INGREDIENTES", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_pizzas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_pizzas);
        if (t_pizzas.getColumnModel().getColumnCount() > 0) {
            t_pizzas.getColumnModel().getColumn(0).setMinWidth(50);
            t_pizzas.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        tf_busquedaPizza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_busquedaPizzaKeyReleased(evt);
            }
        });

        lb_borrarBusquedaPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarNormal.png"))); // NOI18N
        lb_borrarBusquedaPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_borrarBusquedaPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaPizzaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaPizzaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaPizzaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaPizzaMouseReleased(evt);
            }
        });

        btn_agregarPizza.setBackground(new java.awt.Color(255, 255, 255));
        btn_agregarPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregarPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_agregarPizzaMouseReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("AGREGAR PIZZA");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N

        javax.swing.GroupLayout btn_agregarPizzaLayout = new javax.swing.GroupLayout(btn_agregarPizza);
        btn_agregarPizza.setLayout(btn_agregarPizzaLayout);
        btn_agregarPizzaLayout.setHorizontalGroup(
            btn_agregarPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_agregarPizzaLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_agregarPizzaLayout.setVerticalGroup(
            btn_agregarPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_agregarPizzaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_editarPizza.setBackground(new java.awt.Color(255, 255, 255));
        btn_editarPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editarPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_editarPizzaMouseReleased(evt);
            }
        });

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 103, 27));
        jLabel24.setText("EDITAR PIZZA");

        javax.swing.GroupLayout btn_editarPizzaLayout = new javax.swing.GroupLayout(btn_editarPizza);
        btn_editarPizza.setLayout(btn_editarPizzaLayout);
        btn_editarPizzaLayout.setHorizontalGroup(
            btn_editarPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_editarPizzaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_editarPizzaLayout.setVerticalGroup(
            btn_editarPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_editarPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_eliminarPizza.setBackground(new java.awt.Color(255, 255, 255));
        btn_eliminarPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_eliminarPizzaMouseReleased(evt);
            }
        });

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(208, 8, 8));
        jLabel26.setText("ELIMINAR PIZZA");

        javax.swing.GroupLayout btn_eliminarPizzaLayout = new javax.swing.GroupLayout(btn_eliminarPizza);
        btn_eliminarPizza.setLayout(btn_eliminarPizzaLayout);
        btn_eliminarPizzaLayout.setHorizontalGroup(
            btn_eliminarPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_eliminarPizzaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_eliminarPizzaLayout.setVerticalGroup(
            btn_eliminarPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_eliminarPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout p_pizzasLayout = new javax.swing.GroupLayout(p_pizzas);
        p_pizzas.setLayout(p_pizzasLayout);
        p_pizzasLayout.setHorizontalGroup(
            p_pizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_pizzasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_pizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(p_pizzasLayout.createSequentialGroup()
                        .addGroup(p_pizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_pizzasLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_busquedaPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_borrarBusquedaPizza))
                            .addGroup(p_pizzasLayout.createSequentialGroup()
                                .addComponent(btn_agregarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btn_editarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p_pizzasLayout.setVerticalGroup(
            p_pizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_pizzasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(p_pizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(tf_busquedaPizza)
                    .addComponent(lb_borrarBusquedaPizza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_pizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_agregarPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminarPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editarPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        p_contenedor.add(p_pizzas, "card3");

        p_clientes.setBackground(new java.awt.Color(255, 255, 255));

        t_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRE DE CLIENTE", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_clientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(t_clientes);
        if (t_clientes.getColumnModel().getColumnCount() > 0) {
            t_clientes.getColumnModel().getColumn(0).setMinWidth(50);
            t_clientes.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        tf_busquedaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_busquedaClienteKeyReleased(evt);
            }
        });

        lb_borrarBusquedaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarNormal.png"))); // NOI18N
        lb_borrarBusquedaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaClienteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaClienteMouseReleased(evt);
            }
        });

        btn_agregarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btn_agregarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_agregarClienteMouseReleased(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("AGREGAR CLIENTE");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N

        javax.swing.GroupLayout btn_agregarClienteLayout = new javax.swing.GroupLayout(btn_agregarCliente);
        btn_agregarCliente.setLayout(btn_agregarClienteLayout);
        btn_agregarClienteLayout.setHorizontalGroup(
            btn_agregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_agregarClienteLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_agregarClienteLayout.setVerticalGroup(
            btn_agregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_agregarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addContainerGap())
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_editarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btn_editarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_editarClienteMouseReleased(evt);
            }
        });

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 103, 27));
        jLabel31.setText("EDITAR CLIENTE");

        javax.swing.GroupLayout btn_editarClienteLayout = new javax.swing.GroupLayout(btn_editarCliente);
        btn_editarCliente.setLayout(btn_editarClienteLayout);
        btn_editarClienteLayout.setHorizontalGroup(
            btn_editarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_editarClienteLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_editarClienteLayout.setVerticalGroup(
            btn_editarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_editarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_eliminarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btn_eliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_eliminarClienteMouseReleased(evt);
            }
        });

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(208, 8, 8));
        jLabel33.setText("ELIMINAR CLIENTE");

        javax.swing.GroupLayout btn_eliminarClienteLayout = new javax.swing.GroupLayout(btn_eliminarCliente);
        btn_eliminarCliente.setLayout(btn_eliminarClienteLayout);
        btn_eliminarClienteLayout.setHorizontalGroup(
            btn_eliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_eliminarClienteLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_eliminarClienteLayout.setVerticalGroup(
            btn_eliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_eliminarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout p_clientesLayout = new javax.swing.GroupLayout(p_clientes);
        p_clientes.setLayout(p_clientesLayout);
        p_clientesLayout.setHorizontalGroup(
            p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(p_clientesLayout.createSequentialGroup()
                        .addGroup(p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_clientesLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_busquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_borrarBusquedaCliente))
                            .addGroup(p_clientesLayout.createSequentialGroup()
                                .addComponent(btn_agregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btn_editarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p_clientesLayout.setVerticalGroup(
            p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(tf_busquedaCliente)
                    .addComponent(lb_borrarBusquedaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_agregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        p_contenedor.add(p_clientes, "card3");

        p_repartidores.setBackground(new java.awt.Color(255, 255, 255));

        t_repartidores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRE DEL REPARTIDOR", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_repartidores.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(t_repartidores);
        if (t_repartidores.getColumnModel().getColumnCount() > 0) {
            t_repartidores.getColumnModel().getColumn(0).setMinWidth(50);
            t_repartidores.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        tf_busquedaRepartidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_busquedaRepartidorKeyReleased(evt);
            }
        });

        lb_borrarBusquedaRepartidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarNormal.png"))); // NOI18N
        lb_borrarBusquedaRepartidor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_borrarBusquedaRepartidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaRepartidorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaRepartidorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaRepartidorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaRepartidorMouseReleased(evt);
            }
        });

        btn_agregarRepartidor.setBackground(new java.awt.Color(255, 255, 255));
        btn_agregarRepartidor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregarRepartidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_agregarRepartidorMouseReleased(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("AGREGAR REP");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N

        javax.swing.GroupLayout btn_agregarRepartidorLayout = new javax.swing.GroupLayout(btn_agregarRepartidor);
        btn_agregarRepartidor.setLayout(btn_agregarRepartidorLayout);
        btn_agregarRepartidorLayout.setHorizontalGroup(
            btn_agregarRepartidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_agregarRepartidorLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_agregarRepartidorLayout.setVerticalGroup(
            btn_agregarRepartidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_agregarRepartidorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addContainerGap())
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_editarRepartidor.setBackground(new java.awt.Color(255, 255, 255));
        btn_editarRepartidor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editarRepartidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_editarRepartidorMouseReleased(evt);
            }
        });

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 103, 27));
        jLabel38.setText("EDITAR REP");

        javax.swing.GroupLayout btn_editarRepartidorLayout = new javax.swing.GroupLayout(btn_editarRepartidor);
        btn_editarRepartidor.setLayout(btn_editarRepartidorLayout);
        btn_editarRepartidorLayout.setHorizontalGroup(
            btn_editarRepartidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_editarRepartidorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_editarRepartidorLayout.setVerticalGroup(
            btn_editarRepartidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_editarRepartidorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_eliminarRepartidor.setBackground(new java.awt.Color(255, 255, 255));
        btn_eliminarRepartidor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarRepartidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_eliminarRepartidorMouseReleased(evt);
            }
        });

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(208, 8, 8));
        jLabel40.setText("ELIMINAR REP");

        javax.swing.GroupLayout btn_eliminarRepartidorLayout = new javax.swing.GroupLayout(btn_eliminarRepartidor);
        btn_eliminarRepartidor.setLayout(btn_eliminarRepartidorLayout);
        btn_eliminarRepartidorLayout.setHorizontalGroup(
            btn_eliminarRepartidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_eliminarRepartidorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_eliminarRepartidorLayout.setVerticalGroup(
            btn_eliminarRepartidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_eliminarRepartidorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout p_repartidoresLayout = new javax.swing.GroupLayout(p_repartidores);
        p_repartidores.setLayout(p_repartidoresLayout);
        p_repartidoresLayout.setHorizontalGroup(
            p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_repartidoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(p_repartidoresLayout.createSequentialGroup()
                        .addGroup(p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_repartidoresLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_busquedaRepartidor, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_borrarBusquedaRepartidor))
                            .addGroup(p_repartidoresLayout.createSequentialGroup()
                                .addComponent(btn_agregarRepartidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btn_editarRepartidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminarRepartidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p_repartidoresLayout.setVerticalGroup(
            p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_repartidoresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(tf_busquedaRepartidor)
                    .addComponent(lb_borrarBusquedaRepartidor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_agregarRepartidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminarRepartidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editarRepartidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        p_contenedor.add(p_repartidores, "card3");

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_barraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addComponent(p_toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_barraLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseEntered
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarEntered.png")));
    }//GEN-LAST:event_lb_cerrarMouseEntered

    private void lb_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseExited
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarNormal.png")));
    }//GEN-LAST:event_lb_cerrarMouseExited

    private void lb_cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMousePressed
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarPressed.png")));
    }//GEN-LAST:event_lb_cerrarMousePressed

    private void lb_cerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseReleased
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarEntered.png")));
        int p = JOptionPane.showConfirmDialog(this, "¿Estas seguro de cerrar el programa?",
                "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION, 2);
        if (p == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_lb_cerrarMouseReleased

    private void lb_minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseEntered
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarEntered.png")));
    }//GEN-LAST:event_lb_minimizarMouseEntered

    private void lb_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseExited
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarNormal.png")));
    }//GEN-LAST:event_lb_minimizarMouseExited

    private void lb_minimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMousePressed
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarPressed.png")));
    }//GEN-LAST:event_lb_minimizarMousePressed

    private void lb_minimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseReleased
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarEntered.png")));
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lb_minimizarMouseReleased

    private void p_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_principalMousePressed

    private void p_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_p_principalMouseDragged

    private void p_botonPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonPedidosMouseEntered
        if (pos != 1) {
            separadorPedidos.setVisible(true);
        }
    }//GEN-LAST:event_p_botonPedidosMouseEntered

    private void p_botonPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonPedidosMouseExited
        if (pos != 1) {
            separadorPedidos.setVisible(false);
        }
    }//GEN-LAST:event_p_botonPedidosMouseExited

    private void p_botonPedidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonPedidosMousePressed
        if (pos != 1) {
            pos = 1;
            cambiarPanel(1);
        }
    }//GEN-LAST:event_p_botonPedidosMousePressed

    private void p_botonPizzasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonPizzasMouseEntered
        if (pos != 2) {
            separadorPizzas.setVisible(true);
        }
    }//GEN-LAST:event_p_botonPizzasMouseEntered

    private void p_botonPizzasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonPizzasMouseExited
        if (pos != 2) {
            separadorPizzas.setVisible(false);
        }
    }//GEN-LAST:event_p_botonPizzasMouseExited

    private void p_botonPizzasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonPizzasMousePressed
        if (pos != 2) {
            pos = 2;
            cambiarPanel(2);
            ObjPizzas.obtenerPizzas(t_pizzas);
        }
    }//GEN-LAST:event_p_botonPizzasMousePressed

    private void p_botonClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonClientesMouseEntered
        if (pos != 3) {
            separadorClientes.setVisible(true);
        }
    }//GEN-LAST:event_p_botonClientesMouseEntered

    private void p_botonClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonClientesMouseExited
        if (pos != 3) {
            separadorClientes.setVisible(false);
        }
    }//GEN-LAST:event_p_botonClientesMouseExited

    private void p_botonClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonClientesMousePressed
        if (pos != 3) {
            pos = 3;
            cambiarPanel(3);
            actualizarApartadoCliente();
        }
    }//GEN-LAST:event_p_botonClientesMousePressed

    private void p_botonRepartidoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonRepartidoresMouseEntered
        if (pos != 4) {
            separadorRepartidores.setVisible(true);
        }
    }//GEN-LAST:event_p_botonRepartidoresMouseEntered

    private void p_botonRepartidoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonRepartidoresMouseExited
        if (pos != 4) {
            separadorRepartidores.setVisible(false);
        }
    }//GEN-LAST:event_p_botonRepartidoresMouseExited

    private void p_botonRepartidoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_botonRepartidoresMouseReleased
        if (pos != 4) {
            pos = 4;
            ObjRepartidores.obtenerRepartidor(t_repartidores);
            cambiarPanel(4);
        }
    }//GEN-LAST:event_p_botonRepartidoresMouseReleased

    private void btn_agregarPizzaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarPizzaMouseReleased
        AgregarEditarPizza frame = new AgregarEditarPizza(this, 1, null);
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_agregarPizzaMouseReleased

    private void btn_agregarClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarClienteMouseReleased
        AgregarEditarRepartidorCliente frame = new AgregarEditarRepartidorCliente(this, 1, 1, null);
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_agregarClienteMouseReleased

    private void btn_agregarRepartidorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarRepartidorMouseReleased
        AgregarEditarRepartidorCliente frame = new AgregarEditarRepartidorCliente(this, 2, 1, null);
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_agregarRepartidorMouseReleased

    private void p_cambiarPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarPedidosMouseEntered
        if (panelActual != 1) {
            separadorPedidosActuales.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarPedidosMouseEntered

    private void p_cambiarPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarPedidosMouseExited
        if (panelActual != 1) {
            separadorPedidosActuales.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarPedidosMouseExited

    private void p_cambiarPedidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarPedidosMousePressed
        if (panelActual != 1) {
            panelActual = 1;
            p_pedidosActuales.setVisible(true);
            p_historialPedidos.setVisible(false);
            separadorPedidosActuales.setVisible(true);
            p_pedidosActuales.setVisible(true);
            p_cambiarPedidos.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            separadorHistorialPedidos.setVisible(false);
            p_cambiarHistorialPedidos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarPedidosMousePressed

    private void p_cambiarHistorialPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarHistorialPedidosMouseEntered
        if (panelActual != 2) {
            separadorHistorialPedidos.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarHistorialPedidosMouseEntered

    private void p_cambiarHistorialPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarHistorialPedidosMouseExited
        if (panelActual != 2) {
            separadorHistorialPedidos.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarHistorialPedidosMouseExited

    private void p_cambiarHistorialPedidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarHistorialPedidosMousePressed
        if (panelActual != 2) {
            panelActual = 2;
            p_pedidosActuales.setVisible(false);
            p_historialPedidos.setVisible(true);
            separadorHistorialPedidos.setVisible(true);
            p_historialPedidos.setVisible(true);
            p_cambiarPedidos.setCursor(new Cursor(Cursor.HAND_CURSOR));
            separadorPedidosActuales.setVisible(false);
            p_cambiarHistorialPedidos.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarHistorialPedidosMousePressed

    private void btn_eliminarRepartidorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarRepartidorMouseReleased
        try {
            int p = JOptionPane.showConfirmDialog(this, "¿Estas seguro de eliminar este registro?", "Precaución",
                    JOptionPane.OK_CANCEL_OPTION, 2);
            if (p == 0) {
                boolean exito = ObjRepartidores.eliminarRepartidor(
                        t_repartidores.getValueAt(t_repartidores.getSelectedRow(), 0).toString());
                if (exito) {
                    JOptionPane.showMessageDialog(this, "El registro se eliminó con exito", "Exito", 1);
                    actualizarApartadoRepartidor();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro\nEste registro se encuentra en uso", "Error", 0);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un campo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_eliminarRepartidorMouseReleased

    private void btn_editarRepartidorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarRepartidorMouseReleased
        try {
            AgregarEditarRepartidorCliente frame = new AgregarEditarRepartidorCliente(this, 2, 2,
                    t_repartidores.getValueAt(t_repartidores.getSelectedRow(), 0).toString());
            frame.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un campo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_editarRepartidorMouseReleased

    private void tf_busquedaRepartidorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_busquedaRepartidorKeyReleased
        ObjRepartidores.obtenerBusquedaRepartidor(t_repartidores, tf_busquedaRepartidor.getText());
    }//GEN-LAST:event_tf_busquedaRepartidorKeyReleased

    private void lb_borrarBusquedaRepartidorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaRepartidorMouseEntered
        lb_borrarBusquedaRepartidor.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
    }//GEN-LAST:event_lb_borrarBusquedaRepartidorMouseEntered

    private void lb_borrarBusquedaRepartidorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaRepartidorMouseExited
        lb_borrarBusquedaRepartidor.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarNormal.png")));
    }//GEN-LAST:event_lb_borrarBusquedaRepartidorMouseExited

    private void lb_borrarBusquedaRepartidorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaRepartidorMousePressed
        lb_borrarBusquedaRepartidor.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarPressed.png")));
    }//GEN-LAST:event_lb_borrarBusquedaRepartidorMousePressed

    private void lb_borrarBusquedaRepartidorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaRepartidorMouseReleased
        lb_borrarBusquedaRepartidor.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
        tf_busquedaRepartidor.setText("");
        actualizarApartadoRepartidor();
    }//GEN-LAST:event_lb_borrarBusquedaRepartidorMouseReleased

    private void btn_editarClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarClienteMouseReleased
        try {
            AgregarEditarRepartidorCliente frame = new AgregarEditarRepartidorCliente(this, 1, 2,
                    t_clientes.getValueAt(t_clientes.getSelectedRow(), 0).toString());
            frame.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un campo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_editarClienteMouseReleased

    private void btn_eliminarClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarClienteMouseReleased
        try {
            int p = JOptionPane.showConfirmDialog(this, "¿Estas seguro de eliminar este registro?", "Precaución",
                    JOptionPane.OK_CANCEL_OPTION, 2);
            if (p == 0) {
                boolean exito = ObjClientes.eliminarCliente(
                        t_clientes.getValueAt(t_clientes.getSelectedRow(), 0).toString());
                if (exito) {
                    JOptionPane.showMessageDialog(this, "El registro se eliminó con exito", "Exito", 1);
                    actualizarApartadoCliente();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro\nEste registro se encuentra en uso", "Error", 0);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un campo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_eliminarClienteMouseReleased

    private void lb_borrarBusquedaClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaClienteMouseEntered
        lb_borrarBusquedaCliente.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
    }//GEN-LAST:event_lb_borrarBusquedaClienteMouseEntered

    private void lb_borrarBusquedaClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaClienteMouseExited
        lb_borrarBusquedaCliente.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarNormal.png")));
    }//GEN-LAST:event_lb_borrarBusquedaClienteMouseExited

    private void lb_borrarBusquedaClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaClienteMousePressed
        lb_borrarBusquedaCliente.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarPressed.png")));
    }//GEN-LAST:event_lb_borrarBusquedaClienteMousePressed

    private void lb_borrarBusquedaClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaClienteMouseReleased
        lb_borrarBusquedaCliente.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
        tf_busquedaCliente.setText("");
        actualizarApartadoCliente();
    }//GEN-LAST:event_lb_borrarBusquedaClienteMouseReleased

    private void tf_busquedaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_busquedaClienteKeyReleased
        ObjClientes.obtenerBusquedaClientes(t_clientes, tf_busquedaCliente.getText());
    }//GEN-LAST:event_tf_busquedaClienteKeyReleased

    private void btn_editarPizzaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarPizzaMouseReleased
        try {
            AgregarEditarPizza frame = new AgregarEditarPizza(this, 2,
                    t_pizzas.getValueAt(t_pizzas.getSelectedRow(), 0).toString());
            frame.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un campo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_editarPizzaMouseReleased

    private void btn_eliminarPizzaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarPizzaMouseReleased
        try {
            int p = JOptionPane.showConfirmDialog(this, "¿Estas seguro de eliminar este registro?", "Precaución",
                    JOptionPane.OK_CANCEL_OPTION, 2);
            if (p == 0) {
                boolean exito = ObjPizzas.eliminarPizza(
                        t_pizzas.getValueAt(t_pizzas.getSelectedRow(), 0).toString());
                if (exito) {
                    JOptionPane.showMessageDialog(this, "El registro se eliminó con exito", "Exito", 1);
                    actualizarApartadoPizza();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro\nEste registro se encuentra en uso", "Error", 0);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un campo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_eliminarPizzaMouseReleased

    private void lb_borrarBusquedaPizzaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaPizzaMouseEntered
        lb_borrarBusquedaPizza.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
    }//GEN-LAST:event_lb_borrarBusquedaPizzaMouseEntered

    private void lb_borrarBusquedaPizzaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaPizzaMouseExited
        lb_borrarBusquedaPizza.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarNormal.png")));
    }//GEN-LAST:event_lb_borrarBusquedaPizzaMouseExited

    private void lb_borrarBusquedaPizzaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaPizzaMousePressed
        lb_borrarBusquedaPizza.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarPressed.png")));
    }//GEN-LAST:event_lb_borrarBusquedaPizzaMousePressed

    private void lb_borrarBusquedaPizzaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaPizzaMouseReleased
        lb_borrarBusquedaPizza.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
        tf_busquedaPizza.setText("");
        actualizarApartadoPizza();
    }//GEN-LAST:event_lb_borrarBusquedaPizzaMouseReleased

    private void tf_busquedaPizzaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_busquedaPizzaKeyReleased
        ObjPizzas.obtenerBusquedaPizza(t_pizzas, tf_busquedaPizza.getText());
    }//GEN-LAST:event_tf_busquedaPizzaKeyReleased

    private void cb_fechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_fechasActionPerformed
        if (cb_fechas.hasFocus()) {
            ObjPedidos.obtenerPedidos(t_historialPedidos, cb_fechas.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cb_fechasActionPerformed

    private void btn_detallesPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detallesPedidoActionPerformed
        try {
            DetallesPedido frame = new DetallesPedido(this,
                    t_pedidosActuales.getValueAt(t_pedidosActuales.getSelectedRow(), 0).toString());
            frame.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un campo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_detallesPedidoActionPerformed

    private void btn_detallePedidoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detallePedidoAnteriorActionPerformed
        try {
            DetallesPedido frame = new DetallesPedido(this,
                    t_historialPedidos.getValueAt(t_historialPedidos.getSelectedRow(), 0).toString());
            frame.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un campo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_detallePedidoAnteriorActionPerformed

    private void btn_agregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPedidoActionPerformed
        AgregarEditarPedido frame = new AgregarEditarPedido(this);
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_agregarPedidoActionPerformed

    private void btn_eliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarPedidoActionPerformed
        try {
            int p = JOptionPane.showConfirmDialog(this, "¿Estas seguro de eliminar este registro?", "Precaución",
                    JOptionPane.OK_CANCEL_OPTION, 2);
            if (p == 0) {
                boolean exito = ObjPedidos.eliminarPedido(
                        t_pedidosActuales.getValueAt(t_pedidosActuales.getSelectedRow(), 0).toString());
                if (exito) {
                    JOptionPane.showMessageDialog(this, "El registro se eliminó con exito", "Exito", 1);
                    actualizarApartadoPedidos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro\nEste registro se encuentra en uso", "Error", 0);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un campo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_eliminarPedidoActionPerformed

    public void actualizarApartadoRepartidor() {
        ObjRepartidores.obtenerRepartidor(t_repartidores);
    }

    public void actualizarApartadoCliente() {
        ObjClientes.obtenerClientes(t_clientes);
    }

    public void actualizarApartadoPizza() {
        ObjPizzas.obtenerPizzas(t_pizzas);
    }

    public void actualizarApartadoPedidos() {
        ObjPedidos.obtenerPedidosActuales(t_pedidosActuales);
    }

    public void cambiarPanel(int pos) {
        /* Colocar separadores invisibles */
        this.separadorPedidos.setVisible(false);
        this.separadorClientes.setVisible(false);
        this.separadorPizzas.setVisible(false);
        this.separadorRepartidores.setVisible(false);

        /* Colocar panales invisibles */
        this.p_pedidos.setVisible(false);
        this.p_clientes.setVisible(false);
        this.p_pizzas.setVisible(false);
        this.p_repartidores.setVisible(false);

        /* Colocar cursor de mano */
        this.p_botonPedidos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.p_botonClientes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.p_botonPizzas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.p_botonRepartidores.setCursor(new Cursor(Cursor.HAND_CURSOR));

        /* Colocar color default */
        this.p_botonPedidos.setBackground(new Color(255, 145, 27));
        this.p_botonPizzas.setBackground(new Color(255, 145, 27));
        this.p_botonClientes.setBackground(new Color(255, 145, 27));
        this.p_botonRepartidores.setBackground(new Color(255, 145, 27));

        switch (pos) {
            case 1:
                this.separadorPedidos.setVisible(true);
                this.p_pedidos.setVisible(true);
                this.p_botonPedidos.setBackground(new Color(255, 103, 27));
                this.p_botonPedidos.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                break;

            case 2:
                this.separadorPizzas.setVisible(true);
                this.p_pizzas.setVisible(true);
                this.p_botonPizzas.setBackground(new Color(255, 103, 27));
                this.p_botonPizzas.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                break;

            case 3:
                this.separadorClientes.setVisible(true);
                this.p_clientes.setVisible(true);
                this.p_botonClientes.setBackground(new Color(255, 103, 27));
                this.p_botonClientes.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                break;

            case 4:
                this.separadorRepartidores.setVisible(true);
                this.p_repartidores.setVisible(true);
                this.p_botonRepartidores.setBackground(new Color(255, 103, 27));
                this.p_botonRepartidores.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                break;
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_agregarCliente;
    private javax.swing.JButton btn_agregarPedido;
    private javax.swing.JPanel btn_agregarPizza;
    private javax.swing.JPanel btn_agregarRepartidor;
    private javax.swing.JButton btn_detallePedidoAnterior;
    private javax.swing.JButton btn_detallesPedido;
    private javax.swing.JPanel btn_editarCliente;
    private javax.swing.JPanel btn_editarPizza;
    private javax.swing.JPanel btn_editarRepartidor;
    private javax.swing.JPanel btn_eliminarCliente;
    private javax.swing.JButton btn_eliminarPedido;
    private javax.swing.JPanel btn_eliminarPizza;
    private javax.swing.JPanel btn_eliminarRepartidor;
    private javax.swing.JComboBox<String> cb_fechas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lb_borrarBusquedaCliente;
    private javax.swing.JLabel lb_borrarBusquedaPizza;
    private javax.swing.JLabel lb_borrarBusquedaRepartidor;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JPanel p_barraLateral;
    private javax.swing.JPanel p_botonClientes;
    private javax.swing.JPanel p_botonPedidos;
    private javax.swing.JPanel p_botonPizzas;
    private javax.swing.JPanel p_botonRepartidores;
    private javax.swing.JPanel p_cambiarHistorialPedidos;
    private javax.swing.JPanel p_cambiarPedidos;
    private javax.swing.JPanel p_clientes;
    private javax.swing.JPanel p_contenedor;
    private javax.swing.JPanel p_contenedorPedidos;
    private javax.swing.JPanel p_historialPedidos;
    private javax.swing.JPanel p_pedidos;
    private javax.swing.JPanel p_pedidosActuales;
    private javax.swing.JPanel p_pizzas;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_repartidores;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JPanel p_toolbarPedidos;
    private javax.swing.JSeparator separadorClientes;
    private javax.swing.JSeparator separadorHistorialPedidos;
    private javax.swing.JSeparator separadorPedidos;
    private javax.swing.JSeparator separadorPedidosActuales;
    private javax.swing.JSeparator separadorPizzas;
    private javax.swing.JSeparator separadorRepartidores;
    private javax.swing.JTable t_clientes;
    private javax.swing.JTable t_historialPedidos;
    private javax.swing.JTable t_pedidosActuales;
    private javax.swing.JTable t_pizzas;
    private javax.swing.JTable t_repartidores;
    private javax.swing.JTextField tf_busquedaCliente;
    private javax.swing.JTextField tf_busquedaPizza;
    private javax.swing.JTextField tf_busquedaRepartidor;
    // End of variables declaration//GEN-END:variables
}
