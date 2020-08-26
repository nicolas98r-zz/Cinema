package controlador;

import controlDAO.MultiplexDAO;
import modelo.Multiplex;
import vista.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ControlInicio implements ActionListener {

    MultiplexDAO dao = new MultiplexDAO();
    InicioUI vista;

    public ControlInicio(InicioUI vista){
        this.vista = vista;
        this.vista.getBtn1().addActionListener(this);
        this.vista.getBtn2().addActionListener(this);
        this.vista.getBtn3().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String opcion;
        if(e.getSource()==vista.getBtn1()){
            opcion = listarMultiplex();
            SnackUI sedeVista = new SnackUI();
            ControlSnacks controlSnack = new ControlSnacks(sedeVista,opcion);
            sedeVista.setVisible(true);
        }
        if(e.getSource()==vista.getBtn2()){

        }
        if(e.getSource()==vista.getBtn3()){
            System.exit(0);
        }
    }

    //Genera un option pane con la sede y la retorna
    public String listarMultiplex(){
        JComboBox jcb = new JComboBox();
        List<Multiplex> lista = dao.consultarMultiplex();
        for(int i = 0;i < lista.size(); i++){
            jcb.addItem(lista.get(i).getSede());
        }
        JOptionPane.showMessageDialog(vista,jcb,"Escoger sede",JOptionPane.QUESTION_MESSAGE);
        return (String)jcb.getSelectedItem();
    }
}
