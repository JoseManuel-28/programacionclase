package rpg.dao;

import rpg.model.ClaseRPG;
import rpg.model.Personaje;
import rpg.utils.ConexionBD;
import rpg.utils.log;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClaseRPGDAO {
    ConexionBD conexionBD;
    log log;

    public ClaseRPGDAO() {
        this.conexionBD = new ConexionBD();
        this.log = new log();
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
                log.escribirLog("INFO"," CLASE AÑADIDA CON EXITO ");
                ClaseList.add(clase);
            }


        } catch (Exception e) {
            log.escribirLog("ERROR","EL METODO LISTAR CLASES HA FALLADO " + e.getMessage());
            throw new RuntimeException(e);
        }
        return ClaseList;
    }
}
