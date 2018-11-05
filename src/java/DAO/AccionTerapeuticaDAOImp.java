package DAO;

import Conexion.Conexion;
import Interfaces.MetodosCRUD;
import ModelosDTO.AccionTerapeutica;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author edgar
 */
public class AccionTerapeuticaDAOImp implements MetodosCRUD<AccionTerapeutica> {

    private final String SQL_CREAR = "INSERT INTO AccionTerapeutica(IDACCIONTERAPEUTICA,NOMBRE) VALUES(?,?)";
    private final String SQL_BORRAR = "DELETE * FROM Accionterapeutica WHERE IDACCIONTERAPEUTICA = ?";

    private final Conexion con = Conexion.getInstance();

    @Override
    public boolean crear(AccionTerapeutica c) {

        PreparedStatement ps;

        try {
            ps = con.getConexion().prepareStatement(SQL_CREAR);
            ps.setInt(1, c.getIdAccionTerapeutica());
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
    public boolean actualizar(AccionTerapeutica c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccionTerapeutica leer(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AccionTerapeutica> leerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
