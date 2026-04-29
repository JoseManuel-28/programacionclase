package RPG.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_BD {


    private static final String  URL ="jdbc:postgresql://localhost:5432/XRPG";
    private static final String  USER ="xrpg_user";
    private static final String  PASSWORD ="xrpg_password";

    public Conexion_BD() {

    }

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
