package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/cinemaBD";
    private String user = "nicobd";
    private String password = "kmpal123";

    public Connection getCon() {
        try {
            con = DriverManager.getConnection(url,user,password);
        } catch (SQLException throwables) {
            System.out.println("No se pudo conectar");
            throwables.printStackTrace();
        }
        return con;
    }
}
