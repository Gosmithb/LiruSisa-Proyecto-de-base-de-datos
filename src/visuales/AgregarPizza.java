package visuales;

import bd.Pizzas;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.Color;
import javax.swing.ImageIcon;
import clases.RoundedPanel;
import javax.swing.JOptionPane;

public class AgregarPizza extends javax.swing.JFrame {

    private int x, y;
    private AgregarEditarPedido ObjPadre;
    private Pizzas ObjPizzas;
    
    public AgregarPizza(AgregarEditarPedido framePadre, String[] pizzasIngresadas) {
        initComponents();
        
        ObjPadre = framePadre;
        ObjPizzas = new Pizzas();
        
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 15, 15);
        AWTUtilities.setWindowShape(this, forma);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logoGrande.png")).getImage());
        
        cb_pizza.removeAllItems();
        if (pizzasIngresadas != null) {
            String[] pizzas = ObjPizzas.obtenerNombrePizzas();
            for (int i = 0; i < pizzas.length; i++) {
                for (int j = 0; j < pizzasIngresadas.length; j++) {
                    if (pizzas[i].equals(pizzasIngresadas[j])) {
                        break;
                    } else if (j == (pizzasIngresadas.length - 1)) {
                        cb_pizza.addItem(pizzas[i]);
                    }
                }
            }
        } else {
            ObjPizzas.obtenerNombrePizzas(cb_pizza);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new RoundedPanel(15, new Color(255, 255, 255), new Color(255, 103, 27));
        p_toolbar = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        btn_agregarPizza = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cb_pizza = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tf_cantidad = new javax.swing.JTextField();

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

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("AGREGAR PIZZA");

        javax.swing.GroupLayout p_toolbarLayout = new javax.swing.GroupLayout(p_toolbar);
        p_toolbar.setLayout(p_toolbarLayout);
        p_toolbarLayout.setHorizontalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_toolbarLayout.setVerticalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toolbarLayout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        btn_agregarPizza.setText("AGREGAR");
        btn_agregarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPizzaActionPerformed(evt);
            }
        });

        btn_cerrar.setText("CERRAR");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("PIZZA:");

        cb_pizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("CANTIDAD:");

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_pizza, 0, 190, Short.MAX_VALUE)
                            .addComponent(tf_cantidad))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addComponent(p_toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar)
                    .addComponent(btn_agregarPizza))
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

    private void p_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_principalMousePressed

    private void p_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_p_principalMouseDragged

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        ObjPadre.btn_agregarPizza.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_agregarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPizzaActionPerformed
        if (!tf_cantidad.getText().equals("")) {
            ObjPadre.agregarPizza(ObjPizzas.obtenerIdNombrePizza(cb_pizza.getSelectedItem().toString()),
                    tf_cantidad.getText());
            cb_pizza.removeItemAt(cb_pizza.getSelectedIndex());
            if (cb_pizza.getItemCount() == 0) {
                JOptionPane.showMessageDialog(this, "Sin pizzas a agregar", "Atención", 2);
                this.dispose();
            }
            tf_cantidad.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Debes ingresar una cantidad", "Error", 0);
        }
    }//GEN-LAST:event_btn_agregarPizzaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPizza(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarPizza;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JComboBox<String> cb_pizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JTextField tf_cantidad;
    // End of variables declaration//GEN-END:variables
}
