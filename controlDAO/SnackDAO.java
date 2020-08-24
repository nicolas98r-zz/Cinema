package controlDAO;

import controlador.Conexion;
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

    public List consultarSnacks(){
        List<Snack> listaSnacks = new ArrayList<>();
        String sql = null;
        try {
            con = conexion.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Snack snack = new Snack();
                snack.setId(rs.getInt("id"));
                snack.setNombre(rs.getString("nombre"));
                snack.setPrecio(rs.getInt("precio"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaSnacks;
    }
}
