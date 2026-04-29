package RPG.DAO;

import RPG.Model.Personaje;
import RPG.Utils.Conexion_BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonajeDAO {

    public List<Personaje> obtenerPersonajes() {
        List<Personaje> Lista = new ArrayList<>();
        String sql = "SELECT * FROM Personajes";

        try (Connection connection = Conexion_BD.getConexion();
             PreparedStatement pstmt = connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int id = rs.getInt("id");
                int raza = rs.getInt("id_raza");

                Personaje personaje = new Personaje(nombre, id, raza);

                Lista.add(personaje);
            }
        } catch (SQLException e) {
            System.out.println("Error de base de datos: " + e.getMessage());
        }
        return Lista;
    }

    public void InsertarPersonajes (Personaje personaje){
        String sql2 = "INSERT INTO Personajes (nombre, id, id_raza) VALUES (?, ?";

        try ( Connection connection = Conexion_BD.getConexion();
              PreparedStatement pstmt = connection.prepareStatement(sql2);
        ) {
            pstmt.setString(1, personaje.getNombre());
            pstmt.setInt(2, personaje.getId());
            pstmt.setInt(3, personaje.getId_raza());

            pstmt.executeUpdate();
            System.out.println("--- Héroe guardado con éxito ---");
        } catch (SQLException e) {
            System.out.println("Error al insertar " + e.getMessage());
        }

    }
}
