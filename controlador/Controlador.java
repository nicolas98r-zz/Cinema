package controlador;

import controlDAO.MultiplexDAO;
import modelo.Multiplex;
import vista.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controlador implements ActionListener {

    MultiplexDAO dao = new MultiplexDAO();
    Multiplex multiplex = new Multiplex();
    InicioUI vista;

    public Controlador(InicioUI vista){
        this.vista = vista;
        this.vista.getBtn1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.getBtn1()){
            listarMultiplex();
        }
        if(e.getSource()==vista.getBtn2()){

        }
        if(e.getSource()==vista.getBtn3()){

        }
    }

    //Genera un option pane con la sede
    public void listarMultiplex(){
        JComboBox jcb = new JComboBox();
        List<Multiplex> lista = dao.consultarMultiplex();
        for(int i = 0;i < lista.size(); i++){
            jcb.addItem(lista.get(i).getSede());
        }
        JOptionPane.showMessageDialog(vista,jcb,"Escoger sede",JOptionPane.QUESTION_MESSAGE);
    }
}
