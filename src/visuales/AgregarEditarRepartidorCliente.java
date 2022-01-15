package visuales;

import bd.Clientes;
import bd.Repartidores;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import clases.RoundedPanel;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

public class AgregarEditarRepartidorCliente extends javax.swing.JFrame {

    private int x, y, apartado, modo;
    private Principal ObjPadre;
    private Repartidores ObjRepartidores;
    private Clientes ObjClientes;

    public AgregarEditarRepartidorCliente(Principal framePadre, int apartado, int modo, String id) {
        initComponents();

        this.ObjPadre = framePadre;
        this.ObjRepartidores = new Repartidores();
        this.ObjClientes = new Clientes();

        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 15, 15);
        AWTUtilities.setWindowShape(this, forma);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logoGrande.png")).getImage());

        this.apartado = apartado;
        this.modo = modo;
        p_clientes.setVisible(false);
        p_repartidores.setVisible(false);
        inicializarFrame(apartado, modo, id);
    }

    private void inicializarFrame(int apartado, int modo, String id) {
        Object[] datos;
        String mensaje;
        if (modo == 1) {
            mensaje = "AGREGAR ";
        } else {
            mensaje = "EDITAR ";
            if (apartado == 1) {
                tf_idC.setEnabled(false);
                datos = ObjClientes.obtenerCliente(id);
                tf_idC.setText(datos[0].toString());
                tf_nombresC.setText(datos[1].toString());
                tf_direccionC.setText(datos[2].toString());
            } else {
                tf_idR.setEnabled(false);
                datos = ObjRepartidores.obtenerRepartidor(id);
                tf_idR.setText(datos[0].toString());
                tf_nombresR.setText(datos[1].toString());
                tf_direccionR.setText(datos[2].toString());
            }
        }
        if (apartado == 1) {
            lb_titulo.setText(mensaje + "CLIENTE");
            lb_datos.setText("DATOS DEL CLIENTE");
            btn_agregarModificar.setText(mensaje + "CLIENTE");
            p_clientes.setVisible(true);
        } else {
            lb_titulo.setText(mensaje + "REPARTIDOR");
            lb_datos.setText("DATOS DEL REPARTIDOR");
            btn_agregarModificar.setText(mensaje + "REPARTIDOR");
            p_repartidores.setVisible(true);
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
        p_contenedor = new javax.swing.JPanel();
        p_clientes = new javax.swing.JPanel();
        tf_idC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombresC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_direccionC = new javax.swing.JTextField();
        p_repartidores = new javax.swing.JPanel();
        tf_idR = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nombresR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_direccionR = new javax.swing.JTextField();
        btn_agregarModificar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

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
        lb_titulo.setText("AGREGAR REPARTIDOR");

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
        lb_datos.setText("DATOS DEL REPARTIDOR");

        p_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        p_contenedor.setLayout(new java.awt.CardLayout());

        p_clientes.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("ID:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("NOMBRES:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("DIRECCION:");

        javax.swing.GroupLayout p_clientesLayout = new javax.swing.GroupLayout(p_clientes);
        p_clientes.setLayout(p_clientesLayout);
        p_clientesLayout.setHorizontalGroup(
            p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf_nombresC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(tf_direccionC, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_idC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_clientesLayout.setVerticalGroup(
            p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_idC)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombresC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_direccionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_contenedor.add(p_clientes, "card2");

        p_repartidores.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("NOMBRES:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("DIRECCION:");

        javax.swing.GroupLayout p_repartidoresLayout = new javax.swing.GroupLayout(p_repartidores);
        p_repartidores.setLayout(p_repartidoresLayout);
        p_repartidoresLayout.setHorizontalGroup(
            p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_repartidoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf_nombresR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(tf_direccionR, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_idR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_repartidoresLayout.setVerticalGroup(
            p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_repartidoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_idR)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_nombresR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_repartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_direccionR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_contenedor.add(p_repartidores, "card2");

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

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(p_contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_datos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addComponent(p_toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addComponent(lb_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p_contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_agregarModificar)
                            .addComponent(btn_cancelar)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void p_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_p_principalMouseDragged

    private void p_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_principalMousePressed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        ObjPadre.setVisible(true);
        ObjPadre.actualizarApartadoRepartidor();
        ObjPadre.actualizarApartadoCliente();
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void lb_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_volverMouseClicked
        ObjPadre.setVisible(true);
        ObjPadre.actualizarApartadoRepartidor();
        ObjPadre.actualizarApartadoCliente();
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

    private void btn_agregarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarModificarActionPerformed
        if (apartado == 1) {
            if (modo == 1) {
                agregarCliente();
            } else {
                editarCliente();
            }
        } else {
            if (modo == 1) {
                agregarRepartidor();
            } else {
                editarRepartidor();
            }
        }
    }//GEN-LAST:event_btn_agregarModificarActionPerformed

    private void agregarRepartidor() {
        if (!tf_idR.getText().equals("") && !tf_nombresR.getText().equals("")
                && !tf_direccionR.getText().equals("")) {
            boolean exito = ObjRepartidores.agregarRepartidor(tf_idR.getText(),
                    tf_nombresR.getText(), tf_direccionR.getText());
            if (exito) {
                JOptionPane.showMessageDialog(this, "Se añadió el repartidor", "Exito", 1);
                tf_idR.setText("");
                tf_nombresR.setText("");
                tf_direccionR.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo añadir el repartidor\nEsta ID ya se encuentra en uso", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Error", 0);
        }
    }
    
    private void editarRepartidor() {
        if (!tf_nombresR.getText().equals("") && !tf_direccionR.getText().equals("")) {
            boolean exito = ObjRepartidores.editarRepartidor(tf_idR.getText(),
                    tf_nombresR.getText(), tf_direccionR.getText());
            if (exito) {
                JOptionPane.showMessageDialog(this, "Se editó el repartidor", "Exito", 1);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo editar el repartidor", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Error", 0);
        }
    }
    
    private void agregarCliente() {
        if (!tf_idC.getText().equals("") && !tf_nombresC.getText().equals("")
                && !tf_direccionC.getText().equals("")) {
            boolean exito = ObjClientes.agregarCliente(tf_idC.getText(),
                    tf_nombresC.getText(), tf_direccionC.getText());
            if (exito) {
                JOptionPane.showMessageDialog(this, "Se añadió el cliente", "Exito", 1);
                tf_idC.setText("");
                tf_nombresC.setText("");
                tf_direccionC.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo añadir el cliente\nEsta ID ya se encuentra en uso", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Error", 0);
        }
    }
    
    private void editarCliente() {
        if (!tf_nombresC.getText().equals("") && !tf_direccionC.getText().equals("")) {
            boolean exito = ObjClientes.editarCliente(tf_idC.getText(),
                    tf_nombresC.getText(), tf_direccionC.getText());
            if (exito) {
                JOptionPane.showMessageDialog(this, "Se editó el cliente", "Exito", 1);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo editar el cliente", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Error", 0);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEditarRepartidorCliente(null, 1, 1, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarModificar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_datos;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_volver;
    private javax.swing.JPanel p_clientes;
    private javax.swing.JPanel p_contenedor;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_repartidores;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JTextField tf_direccionC;
    private javax.swing.JTextField tf_direccionR;
    private javax.swing.JTextField tf_idC;
    private javax.swing.JTextField tf_idR;
    private javax.swing.JTextField tf_nombresC;
    private javax.swing.JTextField tf_nombresR;
    // End of variables declaration//GEN-END:variables
}
