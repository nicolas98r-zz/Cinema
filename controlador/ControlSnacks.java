package controlador;

import controlDAO.SnackDAO;;
import modelo.Snack;
import vista.SnackUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;


public class ControlSnacks{
    SnackDAO dao = new SnackDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    SnackUI vista;
    String sede;

    public ControlSnacks(SnackUI vista, String sede){
        this.vista = vista;
        this.sede = sede;
    }

    //Genera una tabla con los snacks de una sede
    public void listarSnacks(JTable tabla){
        modelo = (DefaultTableModel) tabla.getModel();
        List<Snack> lista = dao.consultarSnacks(sede);
        Object[] objeto =new Object[3];
        for(int i = 0;i < lista.size(); i++){
            objeto[0] = lista.get(i).getId();
            objeto[1] = lista.get(i).getNombre();
            objeto[2] = lista.get(i).getPrecio();
            modelo.addRow(objeto);
        }
        vista.getTable().setModel(modelo);
    }
}
