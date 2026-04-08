package rpg.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private String url = "jdbc:postgresql://localhost:5432/XRPG";
    private String user = "xrpg_user";
    private String password = "xrpg_password";

    public ConexionBD() {
    }

    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
}
