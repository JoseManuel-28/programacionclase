package RPG.DAO;

import RPG.Model.Personaje;
import RPG.Utils.Conexion_BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonajeDAO {

    public List<Personaje> obtenerPersonajes(){
        List<Personaje> Lista = new ArrayList<>();
        String sql = "SELECT * FROM Personajes";

        try (Connection connection = Conexion_BD.getConexion();
             PreparedStatement pstmt = connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()){

        }
    }
}
