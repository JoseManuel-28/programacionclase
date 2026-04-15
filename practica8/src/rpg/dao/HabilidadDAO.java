package rpg.dao;

import rpg.model.ClaseRPG;
import rpg.model.Habilidad;
import rpg.utils.ConexionBD;
import rpg.utils.log;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HabilidadDAO {

    ConexionBD conexionBD;
    log log;

    public HabilidadDAO() {
        this.conexionBD = new ConexionBD();
        this.log = new log();
    }

    public List<Habilidad> listarHabilidades() {
        List<Habilidad> HabilidadList = new ArrayList<>();
        String sql = "SELECT * FROM Habilidades";

        try (Connection con = conexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //int id, String nombre
                Habilidad habilidad = new Habilidad(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("dano_base"),
                        rs.getInt("usos_maximos"),
                        rs.getInt("id_clase")

                );
                log.escribirLog("INFO"," HABILIDAD AÑADIDA CON EXITO ");
                HabilidadList.add(habilidad);
            }


        } catch (Exception e) {
            log.escribirLog("ERROR","EL METODO LISTAR HABILIDADES HA FALLADO " + e.getMessage());
            throw new RuntimeException(e);
        }
        return HabilidadList;
    }

}
