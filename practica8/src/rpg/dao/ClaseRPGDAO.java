package rpg.dao;

import rpg.model.ClaseRPG;
import rpg.model.Personaje;
import rpg.utils.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClaseRPGDAO {
    ConexionBD conexionBD;

    public ClaseRPGDAO() {
        this.conexionBD = new ConexionBD();
    }

    public List<ClaseRPG> listarclases() {
        List<ClaseRPG> ClaseList = new ArrayList<>();
        String sql = "SELECT * FROM Clases_RPG";

        try (Connection con = conexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //int id, String nombre
                ClaseRPG clase = new ClaseRPG(
                        rs.getInt("id"),
                        rs.getString("nombre")
                );
                ClaseList.add(clase);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ClaseList;
    }
}
