package DAO;

import Conexion.Conexion;
import Interfaces.MetodosCRUD;
import ModelosDTO.Laboratorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edgar
 */
public class LaboratorioDAOImp implements MetodosCRUD<Laboratorio> {

    private final String SQL_CREAR = "INSERT INTO Laboratorio(IDLABORATORIO,NOMBRE) VALUES (?,?)";
    private final String SQL_ELIMINAR = "DELETE FROM Laboratorio WHERE IDLABORATORIO = ?";
    private final String SQL_ACTUALIZAR = "UPDATE Laboratorio SET NOMBRE = ? WHERE IDLABORATORIO = ?";
    private final String SQL_LEERPORARGUMENTO = "SELECT * FROM Laboratorio WHERE IDLABORATORIO = ?";
    private final String SQL_LEERTODO = "SELECT * FROM Laboratorio";

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
        PreparedStatement ps = null;
        try {
            ps = con.getConexion().prepareStatement(SQL_ACTUALIZAR);
            ps.setInt(1, c.getIdLaboratorio());
            ps.setString(2, c.getNombre());
            
            if (ps.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.getMessage();
        } finally {
            con.cerrarConexion();
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioDAOImp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return false;
    }

    @Override
    public Laboratorio leer(Object key) {
        Laboratorio lab = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        try {
            ps = con.getConexion().prepareStatement(SQL_LEERPORARGUMENTO);
            ps.setInt(1, key.hashCode());
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            con.cerrarConexion();
            if (ps != null && res != null) {
                try {
                    ps.close();
                    res.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioDAOImp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lab;
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
