package controlador;

import controlDAO.MultiplexDAO;
import modelo.Multiplex;
import vista.SedeUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controlador implements ActionListener {

    MultiplexDAO dao = new MultiplexDAO();
    Multiplex multiplex = new Multiplex();
    SedeUI vista;

    public Controlador(SedeUI vista){
        this.vista = vista;
        this.listar();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    public void listar(){
        List<Multiplex> lista = dao.consultarMultiplex();
        for(int i = 0;i < lista.size(); i++){
            vista.listaSedes.addItem(lista.get(i).getSede());
        }
    }
}
