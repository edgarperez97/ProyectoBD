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
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String URL = "jdbc:sqlserver://LAPTOP-LPCKPEBN:1433;databaseName=ProyectoFarmacia;";
            String user = "usuarioSQL";
            String pass = "toor";
            con = DriverManager.getConnection(URL, user, pass);

            System.out.println("nos conectamos");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PruebaConexion.class.getName()).log(Level.SEVERE, null, ex);
            ex.getMessage();
        }
    }

}
