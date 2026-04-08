package rpg.dao;

import rpg.model.Ciudad;
import rpg.model.Personaje;
import rpg.utils.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonajeDAO {
    ConexionBD conexionBD;

    public PersonajeDAO() {
        this.conexionBD = new ConexionBD();
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
                PersonajeList.add(personaje);
            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return PersonajeList;
    }
}
