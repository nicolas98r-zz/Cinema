package vista;

import javax.swing.*;

public class InicioUI extends JFrame{
    private JPanel mainPanel;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JPanel menuPanel;
    private JPanel infoPanel;
    private JLabel txtTitulo;

    public InicioUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(507,403);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(mainPanel);
    }

    public static void main(String[] args) {
        JFrame f1 = new InicioUI();
        f1.setVisible(true);
    }
}
