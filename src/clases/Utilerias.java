package clases;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Utilerias {
    
    public DefaultTableModel eliminarFilasTabla (JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while (tabla.getRowCount() > 0){
            modelo.removeRow(0);
        }
        return modelo;
    }
}
