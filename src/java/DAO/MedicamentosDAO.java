package DAO;

import Conexion.Conexion;
import Interfaces.MetodosCRUD;
import ModelosDTO.Medicamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edgar
 */
public class MedicamentosDAO implements MetodosCRUD<Medicamento> {

    private static final Conexion con = Conexion.getInstance();

    @Override
    public boolean crear(Medicamento c) {

        PreparedStatement ps = null;

        try {
            ps = con.getConexion().prepareCall("{ exec RegistroDeMedicamento(?,?,?,?,?,?,?,?,?) }");
            ps.setString(1, c.getNombreMed());
            ps.setFloat(2, c.getPrecioPublico());
            ps.setFloat(3, c.getPrecioCompra());
            ps.setDate(4, c.getFechaCaducidad());
            ps.setInt(5, c.getIdPresentaMedica());
            ps.setString(6, c.getSustanciaActiva());
            ps.setString(7, c.getSustanciaActiva());
            ps.setString(8, c.getNombreLaboratorio());
            ps.setInt(8, c.getIdAccioTer());
            ps.setInt(9, c.getIdProveedor());

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
    public boolean borrar(Object key) {
        PreparedStatement ps = null;

        try {
            ps = con.getConexion().prepareCall("{call EliminarMedicamentoID(?)}");

            ps.setString(1, key.toString());

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
    public boolean actualizar(Medicamento c) {

        PreparedStatement ps = null;

        try {
            ps = con.getConexion().prepareCall("{call ActualizacionDeMedicamento(?)}");
            ps.setString(1, c.getNombreMed());

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
    public Medicamento leer(Object key) {
        Medicamento med = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        try {
            ps = con.getConexion().prepareCall("{ call BuscarMedicamentoPorNombre(?)}");

            ps.setString(1, key.toString());

            res = ps.executeQuery();

            if (res.next()) {
                med = new Medicamento(res.getInt(1), res.getString(2), res.getFloat(3), res.getFloat(4), res.getDate(5), res.getInt(6), res.getString(7), res.getString(8), res.getInt(9), res.getInt(10));
            }
        } catch (SQLException e) {
        } finally {
            con.cerrarConexion();
        }

        return med;
    }

    @Override
    public List<Medicamento> leerTodo() {
        PreparedStatement ps = null;
        ArrayList<Medicamento> medicamentos = new ArrayList();
        ResultSet res = null;

        try {
            ps = con.getConexion().prepareStatement("Select * from Medicamentos");

            while (res.next()) {
                medicamentos.add(
                        new Medicamento(res.getInt(1), res.getString(2), res.getFloat(3), res.getFloat(4), res.getDate(5), res.getInt(6), res.getString(7), res.getString(8), res.getInt(9), res.getInt(10))
                );
            }
        } catch (SQLException e) {
        } finally {
            con.cerrarConexion();
        }

        return medicamentos;
    }
}
