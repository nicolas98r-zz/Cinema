package vista;

import controlador.Controlador;

import javax.swing.*;

public class InicioUI extends JFrame{
    private JPanel mainPanel;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JPanel menuPanel;
    private JPanel infoPanel;
    private JPanel logoPanel;
    private JLabel logo;

    public InicioUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(507,403);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(mainPanel);
        this.setTitle("Cine Distrito - Inicio");
    }

    //Getters para el controlador
    public JButton getBtn1() {
        return btn1;
    }
    public JButton getBtn2() {
        return btn2;
    }
    public JButton getBtn3() {
        return btn3;
    }


    public static void main(String[] args) {
        InicioUI v1 = new InicioUI();
        Controlador con = new Controlador(v1);
        v1.setVisible(true);
    }
}
