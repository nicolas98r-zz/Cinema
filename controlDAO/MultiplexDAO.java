package controlDAO;

import controlador.Conexion;
import modelo.Multiplex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MultiplexDAO {
    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List consultarSnacks(){
        List<Multiplex> listaMultiplex = new ArrayList<>();
        String sql = "SELECT * FROM Multiplex";
        try {
            con = conexion.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Multiplex multiplex = new Multiplex();
                multiplex.setSede(rs.getString("sede"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaMultiplex;
    }
}
