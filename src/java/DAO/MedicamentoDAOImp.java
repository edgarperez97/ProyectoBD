package DAO;

import Conexion.Conexion;
import Interfaces.MetodosCRUD;
import ModelosDTO.Medicamento;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author edgar
 */
public class MedicamentoDAOImp implements MetodosCRUD<Medicamento> {

    private final String SQL_CREAR = "INSERT INTO Medicamento"
            + "(IDMEDICAMENTO,IDCOMPOSICION,IDPRESENTACION,IDLABORATORIO,IDACCIONTERAPEUTICA)VALUES(?,?,?,?,?)";

    private static final Conexion con = Conexion.getInstance();

    @Override
    public boolean crear(Medicamento c) {
        PreparedStatement ps;

        try {
            ps = con.getConexion().prepareStatement(SQL_CREAR);
            ps.setInt(1, c.getIdMedicamento());
            ps.setInt(2, c.getIdComposicion());
            ps.setInt(3, c.getIdPresentacion());
            ps.setInt(4, c.getIdLaboratorio());
            ps.setInt(5, c.getIdAccionTerapeutica());

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
    public boolean actualizar(Medicamento c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medicamento leer(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medicamento> leerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
