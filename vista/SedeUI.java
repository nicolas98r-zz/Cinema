package vista;

import controlador.Controlador;

import javax.swing.*;

public class SedeUI extends JDialog {
    private JPanel mainPanel;
    private JPanel infoPanel;
    private JPanel listPanel;
    public JComboBox listaSedes;
    private JPanel buttonPanel;
    private JButton okButton;
    private JButton buttonOK;

    public SedeUI() {
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);   //Revisar
        this.setSize(250,250);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(mainPanel);
    }

    /*public static void main(String[] args) {
        JDialog j1 = new SedeUI();
        Controlador controlador = new Controlador((SedeUI) j1);
        j1.setVisible(true);
    }*/
}
