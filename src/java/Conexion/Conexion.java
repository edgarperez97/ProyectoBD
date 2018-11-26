package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edgar
 */
public class Conexion {

    public static Conexion instance;
    private Connection conexion;
    private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String bd = "FarmaciaPIA";
    private final String URL = "jdbc:sqlserver://LAPTOP-LPCKPEBN:1433;databaseName="+bd+";";
    private final String USER = "usuarioSQL";
    private final String PASS = "toor";

    private Conexion() {
        try {

            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            ex.getMessage();
        }
    }

    public synchronized static Conexion getInstance() {

        if (instance == null) {
            instance = new Conexion();
        }

        return instance;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void cerrarConexion() {
        instance = null;
    }
}
