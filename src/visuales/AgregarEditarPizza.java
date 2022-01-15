package visuales;

import bd.Pizzas;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.Color;
import javax.swing.ImageIcon;
import clases.RoundedPanel;
import javax.swing.JOptionPane;

public class AgregarEditarPizza extends javax.swing.JFrame {

    private Principal ObjPadre;
    private Pizzas ObjPizzas;
    private int x, y, modo;

    public AgregarEditarPizza(Principal framePadre, int modo, String idPizza) {
        initComponents();

        ObjPadre = framePadre;
        this.ObjPizzas = new Pizzas();

        this.modo = modo;

        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 15, 15);
        AWTUtilities.setWindowShape(this, forma);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logoGrande.png")).getImage());

        inicializarFrame(modo, idPizza);
    }

    private void inicializarFrame(int modo, String idPizza) {
        if (modo == 1) {
            lb_titulo.setText("AGREGAR PIZZA");
            btn_agregarModificar.setText("AGREGAR PIZZA");
        } else {
            tf_id.setEnabled(false);
            lb_titulo.setText("EDITAR PIZZA");
            btn_agregarModificar.setText("MODIFICAR PIZZA");
            Object[] datos = ObjPizzas.obtenerPizza(idPizza);
            tf_id.setText(datos[0].toString());
            tf_nombrePizza.setText(datos[1].toString());
            desglosarIngredientes(datos[2].toString());
            tf_precio.setText(datos[3].toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new RoundedPanel(15, new Color(255, 255, 255), new Color(255, 103, 27));
        p_toolbar = new javax.swing.JPanel();
        lb_volver = new javax.swing.JLabel();
        lb_titulo = new javax.swing.JLabel();
        lb_minimizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_datos = new javax.swing.JLabel();
        btn_agregarModificar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_nombrePizza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_ingredientes = new javax.swing.JTextArea();
        tf_precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

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
        lb_titulo.setText("AGREGAR PIZZA");

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

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        lb_datos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_datos.setForeground(new java.awt.Color(255, 103, 27));
        lb_datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_datos.setText("DATOS DE LA PIZZA");

        btn_agregarModificar.setText("AGREGAR REPARTIDOR");
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("ID:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("NOMBRE DE LA PIZZA:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("INGREDIENTES:");

        ta_ingredientes.setColumns(20);
        ta_ingredientes.setRows(5);
        jScrollPane1.setViewportView(ta_ingredientes);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("$");

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_principalLayout.createSequentialGroup()
                                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lb_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(p_principalLayout.createSequentialGroup()
                                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_id)
                                            .addComponent(tf_nombrePizza, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_agregarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addComponent(p_toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addComponent(lb_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombrePizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cancelar)
                            .addComponent(btn_agregarModificar)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if (modo == 1) {
            agregarPizza();
        } else {
            editarPizza();
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

    private void agregarPizza() {
        if (!tf_id.getText().equals("") && !tf_nombrePizza.getText().equals("")
                && !ta_ingredientes.getText().equals("") && !tf_precio.getText().equals("")) {
            boolean exito = ObjPizzas.agregarPizza(tf_id.getText(),
                    tf_nombrePizza.getText(), englosarIngredientes(), tf_precio.getText());
            if (exito) {
                JOptionPane.showMessageDialog(this, "Se añadió la pizza", "Exito", 1);
                tf_id.setText("");
                tf_nombrePizza.setText("");
                ta_ingredientes.setText("");
                tf_precio.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo añadir la pizza\nEsta ID ya se encuentra en uso", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Error", 0);
        }
    }

    private void editarPizza() {
        if (!tf_nombrePizza.getText().equals("") && !ta_ingredientes.getText().equals("")
                && !tf_precio.getText().equals("")) {
            boolean exito = ObjPizzas.editarPizza(tf_id.getText(),
                    tf_nombrePizza.getText(), englosarIngredientes(), tf_precio.getText());
            if (exito) {
                JOptionPane.showMessageDialog(this, "Se editó la pizza", "Exito", 1);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo editar la pizza", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Error", 0);
        }
    }

    private String englosarIngredientes() {
        String ingredientes = "";
        String[] lineas = ta_ingredientes.getText().split("\n");
        for (int i = 0; i < lineas.length; i++) {
            ingredientes += lineas[i];
            if (lineas.length - 1 != i) {
                ingredientes += ", ";
            }
        }
        return ingredientes;
    }
    
    private void desglosarIngredientes(String ingredientes) {
        String[] lineas = ingredientes.split(", ");
        for (int i = 0; i < lineas.length; i++) {
            if (i == 0) {
                ta_ingredientes.setText(lineas[i]);
            } else {
                ta_ingredientes.setText(ta_ingredientes.getText() + "\n" + lineas[i]);
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEditarPizza(null, 1, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarModificar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_datos;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_volver;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JTextArea ta_ingredientes;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombrePizza;
    private javax.swing.JTextField tf_precio;
    // End of variables declaration//GEN-END:variables
}
