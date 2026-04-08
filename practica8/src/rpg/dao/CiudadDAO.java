package rpg.dao;

import rpg.model.Ciudad;
import rpg.utils.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CiudadDAO {
    ConexionBD conexionBD;

    public CiudadDAO() {
        this.conexionBD = new ConexionBD();
    }

    public List<Ciudad> listarCiudades() {
        List<Ciudad>ciudadesList =new ArrayList<>();
        String sql = "SELECT * FROM Ciudades";

        try(Connection con = conexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //int id, String nombre, int nivel_minimo_acceso
                Ciudad ciudad = new Ciudad(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("nivel_minimo_acceso")
                );
                ciudadesList.add(ciudad);
            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ciudadesList;
    }

}
