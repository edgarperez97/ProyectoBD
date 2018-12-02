package Pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edgar
 */
public class PruebaConexion {

    public static void main(String[] args) {

        try {
            String user = "usuarioSQL";
            String pass = "toor";
            Connection con = null;

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String URL = "jdbc:sqlserver://localhost:1433;databaseName=BDD_PIA;user="+user+";password="+pass+";";

            con = DriverManager.getConnection(URL);

            System.out.println("nos conectamos");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PruebaConexion.class.getName()).log(Level.SEVERE, null, ex);
            ex.getMessage();
        }
    }

}
