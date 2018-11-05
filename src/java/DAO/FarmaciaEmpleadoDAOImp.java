package DAO;

import Conexion.Conexion;
import Interfaces.MetodosCRUD;
import ModelosDTO.FarmaciaEmpleado;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author edgar
 */
public class FarmaciaEmpleadoDAOImp implements MetodosCRUD<FarmaciaEmpleado> {

    private final String SQL_CREAR = "INSERT INTO FarmaciaEmpleado(IDEMPLEADO,IDFARMACIA) VALUES(?,?)";

    private final static Conexion con = Conexion.getInstance();

    @Override
    public boolean crear(FarmaciaEmpleado c) {
        PreparedStatement ps;

        try {
            ps = con.getConexion().prepareStatement(SQL_CREAR);
            ps.setInt(1, c.getIdEmpleado());
            ps.setInt(2, c.getIdFarmacia());

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(FarmaciaEmpleado c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FarmaciaEmpleado leer(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FarmaciaEmpleado> leerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
