package controlDAO;

import modelo.Snack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SnackDAO {
    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List consultarSnacks(String sede){
        List<Snack> listaSnacks = new ArrayList<>();
        String sql = "SELECT id, nombre, precio FROM Snacks " +
                "JOIN Multiplex_Snacks ON Snacks.id = Multiplex_Snacks.id " +
                "JOIN Multiplex ON Multiplex_Snacks.sede = Multiplex.sede" +
                "WHERE Multiplex.sede = "+ sede;
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Snack snack = new Snack();
                snack.setId(rs.getInt("id"));
                snack.setNombre(rs.getString("nombre"));
                snack.setPrecio(rs.getInt("precio"));
                listaSnacks.add(snack);
            }
            con = conexion.desconectar();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaSnacks;
    }
}
