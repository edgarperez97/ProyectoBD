package DAO;

import Conexion.Conexion;
import Interfaces.MetodosCRUD;
import ModelosDTO.Presentacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edgar
 */
public class PresentacionDAOImp implements MetodosCRUD<Presentacion> {

    private final String SQL_CREAR = "INSERT INTO Presentacion(IDPRESENTACION,NOMBRE) VALUES(?,?)";
    private final String SQL_BORRAR = "DELETE FROM Presentacion WHERE IDPRESENTACION = ?";
    private final String SQL_ACTUALIZAR = "UPDATE Presentacion SET NOMBRE = ? WHERE IDPRESENTACION = ?";
    private final String SQL_LEER = "SELECT * FROM Presentacion WHERE IDPRESENTACION = ?";
    private final String SQL_LEERTODO = "SELECT * FROM Presentacion";

    private static final Conexion con = Conexion.getInstance();

    @Override
    public boolean crear(Presentacion c) {

        PreparedStatement ps = null;

        try {
            ps = con.getConexion().prepareStatement(SQL_CREAR);
            ps.setInt(1, c.getIdPresentacion());
            ps.setString(2, c.getNombre());

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            con.cerrarConexion();
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return false;
    }

    @Override
    public boolean borrar(Object key) {

        PreparedStatement ps = null;

        try {
            ps = con.getConexion().prepareStatement(SQL_BORRAR);
            ps.setInt(1, key.hashCode());

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
        } finally {
            con.cerrarConexion();
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
            }
        }

        return false;
    }

    @Override
    public boolean actualizar(Presentacion c) {
        PreparedStatement ps;

        try {
            ps = con.getConexion().prepareStatement(SQL_ACTUALIZAR);
            ps.setInt(1, c.getIdPresentacion());
            ps.setString(2, c.getNombre());

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
        } finally {
            con.cerrarConexion();
        }
        return false;
    }

    @Override
    public Presentacion leer(Object key) {
        Presentacion p = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        try {
            ps = con.getConexion().prepareStatement(SQL_LEER);
            ps.setInt(1, key.hashCode());  
        } catch (SQLException e) {
        } finally {
            con.cerrarConexion();
        }

        return p;
    }

    @Override
    public List<Presentacion> leerTodo() {

        PreparedStatement ps;
        ArrayList<Presentacion> presentaciones = new ArrayList();
        ResultSet res;

        try {
            ps = con.getConexion().prepareStatement(SQL_LEERTODO);
            res = ps.executeQuery();

            while (res.next()) {
                presentaciones.add(new Presentacion(res.getInt(1), res.getString(2)));
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            con.cerrarConexion();
        }

        return presentaciones;
    }

}
