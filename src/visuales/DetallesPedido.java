package visuales;

import bd.Pedidos;
import javax.swing.ImageIcon;
import clases.RoundedPanel;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

public class DetallesPedido extends javax.swing.JFrame {

    private int x, y;
    private Principal ObjPadre;
    private Pedidos ObjPedidos;
    
    public DetallesPedido(Principal framePadre, String idPedido) {
        initComponents();
        
        ObjPadre = framePadre;
        ObjPedidos = new Pedidos();
        
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 15, 15);
        AWTUtilities.setWindowShape(this, forma);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logoGrande.png")).getImage());
        
        inicializarFrame(idPedido);
    }
    
    private void inicializarFrame(String id){
        Object[] elementos = ObjPedidos.obtenerDetallesPedido(id, t_detallesPedido);
        lb_cliente.setText(elementos[1].toString());
        lb_fecha.setText(convertirFechas(elementos[3].toString()));
        lb_direccion.setText(elementos[2].toString());
        lb_repartidor.setText(elementos[0].toString());
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
        btn_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_cliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_direccion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_fecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_detallesPedido = new javax.swing.JTable();
        lb_repartidor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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
        lb_titulo.setText("DETALLES DE PEDIDO");

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
                .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
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
        lb_datos.setText("DATOS DE CLIENTE Y ENTREGA");

        btn_cancelar.setText("CERRAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("NOMBRE DEL CLIENTE:");

        jSeparator1.setForeground(new java.awt.Color(255, 103, 27));

        lb_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("DIRECCIÓN:");

        lb_direccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("FECHA:");

        lb_fecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        t_detallesPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "PIZZA", "CANTIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_detallesPedido.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_detallesPedido);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("REPARTIDOR:");

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p_principalLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                            .addGroup(p_principalLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(lb_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_repartidor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addComponent(p_toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lb_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_repartidor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(p_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_principalMousePressed

    private void p_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_p_principalMouseDragged

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        ObjPadre.setVisible(true);
        ObjPadre.actualizarApartadoPizza();
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void lb_minimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseReleased
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarEntered.png")));
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lb_minimizarMouseReleased

    private void lb_minimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMousePressed
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarPressed.png")));
    }//GEN-LAST:event_lb_minimizarMousePressed

    private void lb_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseExited
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarNormal.png")));
    }//GEN-LAST:event_lb_minimizarMouseExited

    private void lb_minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseEntered
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarEntered.png")));
    }//GEN-LAST:event_lb_minimizarMouseEntered

    private void lb_volverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_volverMouseReleased
        lb_volver.setIcon(new ImageIcon(getClass().getResource("/imagenes/regresarEntered.png")));
    }//GEN-LAST:event_lb_volverMouseReleased

    private void lb_volverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_volverMousePressed
        lb_volver.setIcon(new ImageIcon(getClass().getResource("/imagenes/regresarPressed.png")));
    }//GEN-LAST:event_lb_volverMousePressed

    private void lb_volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_volverMouseExited
        lb_volver.setIcon(new ImageIcon(getClass().getResource("/imagenes/regresar.png")));
    }//GEN-LAST:event_lb_volverMouseExited

    private void lb_volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_volverMouseEntered
        lb_volver.setIcon(new ImageIcon(getClass().getResource("/imagenes/regresarEntered.png")));
    }//GEN-LAST:event_lb_volverMouseEntered

    private void lb_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_volverMouseClicked
        ObjPadre.setVisible(true);
        ObjPadre.actualizarApartadoPizza();
        this.dispose();
    }//GEN-LAST:event_lb_volverMouseClicked

    public String convertirFechas(String fechaEntrada) {
        String fecha = "";
        String[] dma = fechaEntrada.split("-");
        fecha = dma[2] + " de ";
        switch (dma[1]) {
            case "01":
                fecha += "Enero ";
                break;
            case "02":
                fecha += "Febrero ";
                break;
            case "03":
                fecha += "Marzo ";
                break;
            case "04":
                fecha += "Abril ";
                break;
            case "05":
                fecha += "Mayo ";
                break;
            case "06":
                fecha += "Junio ";
                break;
            case "07":
                fecha += "Julio ";
                break;
            case "08":
                fecha += "Agosto ";
                break;
            case "09":
                fecha += "Septiembre ";
                break;
            case "10":
                fecha += "Octubre ";
                break;
            case "11":
                fecha += "Noviembre ";
                break;
            case "12":
                fecha += "Diciembre ";
                break;
        }

        fecha += "del " + dma[0];
        return fecha;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetallesPedido(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_datos;
    private javax.swing.JLabel lb_direccion;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_repartidor;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_volver;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JTable t_detallesPedido;
    // End of variables declaration//GEN-END:variables
}
