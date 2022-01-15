package visuales;

import bd.Clientes;
import bd.Pedidos;
import bd.Pizzas;
import bd.Repartidores;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.Color;
import javax.swing.ImageIcon;
import clases.RoundedPanel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgregarEditarPedido extends javax.swing.JFrame {

    private Principal ObjPadre;
    private Clientes ObjClientes;
    private Repartidores ObjRepartidores;
    private Pedidos ObjPedidos;
    private Pizzas ObPizzas;
    AgregarPizza frame;
    private int x, y;

    public AgregarEditarPedido(Principal framePadre) {
        initComponents();

        ObjPadre = framePadre;
        ObjClientes = new Clientes();
        ObjRepartidores = new Repartidores();
        ObjPedidos = new Pedidos();
        ObPizzas = new Pizzas();

        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 15, 15);
        AWTUtilities.setWindowShape(this, forma);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logoGrande.png")).getImage());

        inicializarFrame();
    }

    private void inicializarFrame() {
        ObjClientes.obtenerNombreClientes(cb_cliente);
        ObjRepartidores.obtenerNombreRepartidores(cb_repartidor);

        lb_direccion.setText(ObjClientes.obtenerDireccionNombreCliente(cb_cliente.getItemAt(0).toString()));
        lb_fecha.setText(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
        lb_total.setText("0.00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new RoundedPanel(15, new Color(255, 255, 255), new Color(255, 103, 27));
        p_toolbar = new javax.swing.JPanel();
        lb_volver = new javax.swing.JLabel();
        lb_titulo = new javax.swing.JLabel();
        lb_minimizar = new javax.swing.JLabel();
        lb_datos = new javax.swing.JLabel();
        btn_agregarModificar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_pedido = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cb_cliente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lb_direccion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_repartidor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lb_fecha = new javax.swing.JLabel();
        btn_agregarPizza = new javax.swing.JButton();
        lb_total = new javax.swing.JLabel();
        btn_quitarPizza = new javax.swing.JButton();

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

        lb_volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        lb_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_volverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_volverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_volverMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_volverMouseReleased(evt);
            }
        });

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("AGREGAR PEDIDO");

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
                .addComponent(lb_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lb_minimizar)
                .addContainerGap())
        );
        p_toolbarLayout.setVerticalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toolbarLayout.createSequentialGroup()
                .addGroup(p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_volver, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_minimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        lb_datos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_datos.setForeground(new java.awt.Color(255, 103, 27));
        lb_datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_datos.setText("DATOS DE ENTREGA");

        btn_agregarModificar.setText("AGREGAR PEDIDO");
        btn_agregarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarModificarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("TOTAL: $");

        jSeparator1.setForeground(new java.awt.Color(255, 103, 27));

        t_pedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID DE PIZZA", "PIZZA", "CANTIDAD", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_pedido.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(t_pedido);
        if (t_pedido.getColumnModel().getColumnCount() > 0) {
            t_pedido.getColumnModel().getColumn(0).setMinWidth(100);
            t_pedido.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("CLIENTE:");

        cb_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_clienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DIRECCION:");

        lb_direccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("REPARTIDOR:");

        cb_repartidor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("FECHA:");

        btn_agregarPizza.setText("AGREGAR PIZZA");
        btn_agregarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPizzaActionPerformed(evt);
            }
        });

        lb_total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn_quitarPizza.setText("QUITAR PIZZA");
        btn_quitarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitarPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_datos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(p_principalLayout.createSequentialGroup()
                                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_cliente, 0, 190, Short.MAX_VALUE)
                                    .addComponent(cb_repartidor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btn_quitarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_agregarPizza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_total, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addComponent(p_toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_repartidor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregarPizza)
                    .addComponent(btn_quitarPizza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(lb_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_agregarModificar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_volverMouseClicked
        ObjPadre.setVisible(true);
        ObjPadre.actualizarApartadoPizza();
        this.dispose();
    }//GEN-LAST:event_lb_volverMouseClicked

    private void lb_volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_volverMouseEntered
        lb_volver.setIcon(new ImageIcon(getClass().getResource("/imagenes/regresarEntered.png")));
    }//GEN-LAST:event_lb_volverMouseEntered

    private void lb_volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_volverMouseExited
        lb_volver.setIcon(new ImageIcon(getClass().getResource("/imagenes/regresar.png")));
    }//GEN-LAST:event_lb_volverMouseExited

    private void lb_volverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_volverMousePressed
        lb_volver.setIcon(new ImageIcon(getClass().getResource("/imagenes/regresarPressed.png")));
    }//GEN-LAST:event_lb_volverMousePressed

    private void lb_volverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_volverMouseReleased
        lb_volver.setIcon(new ImageIcon(getClass().getResource("/imagenes/regresarEntered.png")));
    }//GEN-LAST:event_lb_volverMouseReleased

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

    private void btn_agregarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarModificarActionPerformed
        if (t_pedido.getRowCount() > 0) {
            if (frame.isVisible()) {
                frame.dispose();
            }
            Object[] pedido = new Object[t_pedido.getRowCount()];
            for (int i = 0; i < t_pedido.getRowCount(); i++) {
                String[] detalles = new String[2];
                detalles[0] = t_pedido.getValueAt(i, 0).toString();
                detalles[1] = t_pedido.getValueAt(i, 2).toString();
                pedido[i] = detalles;
            }
            boolean exito = ObjPedidos.agregarPedido(
                    ObjRepartidores.obtenerIdNombreRepartidor(cb_repartidor.getSelectedItem().toString()),
                    ObjClientes.obtenerIdNombreCliente(cb_cliente.getSelectedItem().toString()),
                    lb_fecha.getText(), pedido);
            if (exito) {
                JOptionPane.showMessageDialog(this, "Se agregó el pedido", "Exito", 1);
                ObjPadre.actualizarApartadoPedidos();
                ObjPadre.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo agregar el pedido", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes agregar al menos una pizza", "Error", 0);
        }
    }//GEN-LAST:event_btn_agregarModificarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        ObjPadre.setVisible(true);
        ObjPadre.actualizarApartadoPizza();
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void p_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_p_principalMouseDragged

    private void p_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_principalMousePressed

    private void cb_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_clienteActionPerformed
        if (cb_cliente.hasFocus()) {
            lb_direccion.setText(ObjClientes.obtenerDireccionNombreCliente(cb_cliente.getSelectedItem().toString()));
        }
    }//GEN-LAST:event_cb_clienteActionPerformed

    private void btn_agregarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPizzaActionPerformed
        String[] pizzasIngresadas = null;
        if (t_pedido.getRowCount() > 0) {
            pizzasIngresadas = new String[t_pedido.getRowCount()];
            for (int i = 0; i < t_pedido.getRowCount(); i++) {
                pizzasIngresadas[i] = t_pedido.getValueAt(i, 1).toString();
            }
        }
        btn_agregarPizza.setEnabled(false);
        frame = new AgregarPizza(this, pizzasIngresadas);
        frame.setVisible(true);
    }//GEN-LAST:event_btn_agregarPizzaActionPerformed

    private void btn_quitarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitarPizzaActionPerformed
        try {
            int p = JOptionPane.showConfirmDialog(this, 
                    "¿Estas seguro de remover la pizza '" + t_pedido.getValueAt(t_pedido.getSelectedRow(), 1) + "'?", "Confirmación",
                    JOptionPane.YES_NO_OPTION, 1);
            if (p == 0) {
                DefaultTableModel modelo = (DefaultTableModel) t_pedido.getModel();
                modelo.removeRow(t_pedido.getSelectedRow());
                btn_agregarPizza.setEnabled(true);
                actualizarTotal();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una fila de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_quitarPizzaActionPerformed

    public void agregarPizza(String id, String cantidad) {
        Object[] elementos = ObPizzas.obtenerPizza(id);
        Object[] fila = new Object[4];
        fila[0] = id;
        fila[1] = elementos[1];
        fila[2] = cantidad;
        fila[3] = (Double.parseDouble(elementos[3].toString()) * Integer.parseInt(cantidad));
        DefaultTableModel modelo = (DefaultTableModel) t_pedido.getModel();
        modelo.addRow(fila);

        actualizarTotal();
    }

    private void actualizarTotal() {
        if (t_pedido.getRowCount() > 0) {
            double suma = 0;
            for (int i = 0; i < t_pedido.getRowCount(); i++) {
                suma += Double.parseDouble(t_pedido.getValueAt(i, 3).toString());
            }
            lb_total.setText(suma + "");
        } else {
            lb_total.setText("0.00");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEditarPedido(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarModificar;
    public javax.swing.JButton btn_agregarPizza;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_quitarPizza;
    private javax.swing.JComboBox<String> cb_cliente;
    private javax.swing.JComboBox<String> cb_repartidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_datos;
    private javax.swing.JLabel lb_direccion;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel lb_volver;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JTable t_pedido;
    // End of variables declaration//GEN-END:variables
}
