package rpg.dao;

import rpg.model.Ciudad;
import rpg.model.Personaje;
import rpg.model.Raza;
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

    public List<Personaje> listarPersonajes(List<Ciudad> TodasLasCiudades, List<Raza> TodasLasRazas) {
        List<Personaje>PersonajeList =new ArrayList<>();
        String sql = "SELECT * FROM Personajes";
        try(Connection con = conexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idCiudadActual = rs.getInt(" id_ciudad-actual");
                int idRaza = rs.getInt("id_raza");
                Raza razaEncontrada = null;
                for (Raza r : TodasLasRazas){
                    if (r.getId() == idRaza){
                        razaEncontrada = r;
                    break;
                    }
                }


                Ciudad ciudadEncontrada = null;
                for (Ciudad c : TodasLasCiudades){
                    if (c.getId() == idCiudadActual) {
                        ciudadEncontrada = c;
                        break;
                    }
                }


                //int id, String nombre, int nivel, int oro, int vida_actual, int id_raza, int id_clase, int id_ciudad_actual
                Personaje personaje = new Personaje(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("nivel"),
                        rs.getInt("oro"),
                        rs.getInt("vida_actual"),
                        razaEncontrada,
                        rs.getInt("id_clase"),
                        ciudadEncontrada

                        // pasar una id de una ciudad que sea clase
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
