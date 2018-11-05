package DAO;

import Conexion.Conexion;
import Interfaces.MetodosCRUD;
import ModelosDTO.Stock;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author edgar
 */
public class StockDAOImp implements MetodosCRUD<Stock> {

    private final String SQL_CREAR = "INSERT INTO Stock(IDFARMACIA,IDMEDICAMENTO,CANTIDAD,PRECIO)"
            + " VALUES(?,?,?,?)";
    private static final Conexion con = Conexion.getInstance();

    @Override
    public boolean crear(Stock c) {

        PreparedStatement ps;

        try {
            ps = con.getConexion().prepareStatement(SQL_CREAR);
            ps.setInt(1, c.getIdFarmacia());
            ps.setInt(2, c.getIdMedicamento());
            ps.setInt(3, c.getCantidad());
            ps.setDouble(4, c.getPrecio());

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
    public boolean actualizar(Stock c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stock leer(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Stock> leerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
