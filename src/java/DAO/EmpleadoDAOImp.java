package DAO;

import Conexion.Conexion;
import Interfaces.MetodosCRUD;
import ModelosDTO.Empleado;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author edgar
 */
public class EmpleadoDAOImp implements MetodosCRUD<Empleado> {

    private final String SQL_CREAR = "INSERT INTO Empleado(IDEMPLEADO,IDCARGO,NOMBRE) VALUES(?,?,?)";

    private static final Conexion con = Conexion.getInstance();

    @Override
    public boolean crear(Empleado c) {
        PreparedStatement ps;

        try {
            ps = con.getConexion().prepareStatement(SQL_CREAR);
            ps.setInt(1, c.getIdEmpleado());
            ps.setInt(2, c.getIdCargo());
            ps.setString(3, c.getNombre());

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (Exception e) {
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
    public boolean actualizar(Empleado c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado leer(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> leerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
