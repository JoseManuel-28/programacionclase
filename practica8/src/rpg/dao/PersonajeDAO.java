package rpg.dao;

import rpg.model.Ciudad;
import rpg.model.Personaje;
import rpg.utils.ConexionBD;
import rpg.utils.log;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonajeDAO {
    ConexionBD conexionBD;
    log log;

    public PersonajeDAO() {
        this.conexionBD = new ConexionBD();
        this.log = new log();
    }

    public List<Personaje> listarPersonajes() {
        List<Personaje>PersonajeList =new ArrayList<>();
        String sql = "SELECT * FROM Personajes";

        try(Connection con = conexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //int id, String nombre, int nivel, int oro, int vida_actual, int id_raza, int id_clase, int id_ciudad_actual
                Personaje personaje = new Personaje(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("nivel"),
                        rs.getInt("oro"),
                        rs.getInt("vida_actual"),
                        rs.getInt("id_raza"),
                        rs.getInt("id_clase"),
                        rs.getInt("id_ciudad_actual")
                );
                log.escribirLog("INFO","PERSONAJE AÑADIDO");
                PersonajeList.add(personaje);
            }



        } catch (Exception e) {
            log.escribirLog("ERROR","EL METODO LISTAR PERSONAJES HA FALLADO " + e.getMessage());
            throw new RuntimeException("EL METODO LISTAR PERSONAJES HA FALLADO " + e.getMessage());
        }
        return PersonajeList;
    }
}
