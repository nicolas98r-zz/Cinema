package controlDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection con = null;
    private String url = "jdbc:mysql://localhost:3306/cinemaBD";
    private String user = "nicobd";
    private String password = "kmpal123";

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            System.out.println("Error driver: "+e.getMessage());
        } catch (SQLException e){
            System.out.println("Error conexion: "+e.getMessage());
        }
        return con;
    }

    public Connection desconectar(){
        con = null;
        return con;
    }
}
