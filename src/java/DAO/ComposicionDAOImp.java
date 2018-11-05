package DAO;

import Conexion.Conexion;
import Interfaces.MetodosCRUD;
import ModelosDTO.Composicion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author edgar
 */
public class ComposicionDAOImp implements MetodosCRUD<Composicion> {

    private final String SQL_CREAR = "INSERT INTO Composicion(IDCOMPOSICION,NOMBRE) VALUES(?,?)";
    private final String SQL_BORRAR = "DELETE * FROM Composicion WHERE IDCOMPOSICION = ?";
    private static final Conexion con = Conexion.getInstance();

    @Override
    public boolean crear(Composicion c) {

        PreparedStatement ps;

        try {
            ps = con.getConexion().prepareStatement(SQL_CREAR);
            ps.setInt(1, c.getIdComposicion());
            ps.setString(2, c.getNombre());

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            con.cerrarConexion();
        }

        return false;
    }

    @Override
    public boolean borrar(Object key) {

        PreparedStatement ps;

        try {
            ps = con.getConexion().prepareStatement(SQL_BORRAR);
            ps.setInt(1, key.hashCode());
            
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            con.cerrarConexion();
        }

        return false;
    }

    @Override
    public boolean actualizar(Composicion c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Composicion leer(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Composicion> leerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
