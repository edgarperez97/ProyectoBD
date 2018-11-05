package DAO;

import Conexion.Conexion;
import Interfaces.MetodosCRUD;
import ModelosDTO.Laboratorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edgar
 */
public class LaboratorioDAO implements MetodosCRUD<Laboratorio> {

    private final String SQL_CREAR = "INSERT INTO Laboratorio(IDLABORATORIO,NOMBRE) VALUES (?,?)";
    private final String SQL_ELIMINAR = "DELETE FROM Laboratorio WHERE IDLABORATORIO = ?";
    private final String SQL_ACTUALIZAR = "";
    private final String SQL_LEERPORARGUMENTO = "";
    private final String SQL_LEERTODO = "";

    private static final Conexion con = Conexion.getInstance();

    @Override
    public boolean crear(Laboratorio c) {
        PreparedStatement ps = null;

        try {
            ps = con.getConexion().prepareStatement(SQL_CREAR);
            ps.setInt(1, c.getIdLaboratorio());
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
            ps = con.getConexion().prepareStatement(SQL_ELIMINAR);
            ps.setInt(1, key.hashCode());

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
    public boolean actualizar(Laboratorio c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Laboratorio leer(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Laboratorio> leerTodo() {
        PreparedStatement ps = null;
        ArrayList<Laboratorio> laboratorios = new ArrayList();
        ResultSet res = null;

        try {
            ps = con.getConexion().prepareStatement(SQL_LEERTODO);
            res = ps.executeQuery();

            while (res.next()) {
                laboratorios.add(new Laboratorio(res.getInt(1), res.getString(2)));
            }

        } catch (SQLException e) {
            e.getMessage();
        } finally {
            con.cerrarConexion();
            try {
                if (ps != null) {
                    ps.close();
                }
                if (res != null) {
                    res.close();
                }
            } catch (SQLException e) {
                e.getMessage();
                e.getSQLState();
            }
        }

        return laboratorios;
    }

}
