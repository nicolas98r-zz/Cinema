package vista;

import javax.swing.*;

public class SnackUI extends JDialog {
    private JPanel mainPanel;
    private JPanel tablePanel;
    private JTable table;

    public SnackUI() {
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        this.setSize(507,403);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(mainPanel);
        this.setTitle("Cine Distrito - Comprar Snack");
        this.setModal(true);
        //Insertar sede
    }

    public JTable getTable() {
        return table;
    }
}
