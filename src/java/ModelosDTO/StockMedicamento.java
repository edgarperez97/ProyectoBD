package ModelosDTO;

import java.util.Date;

/**
 *
 * @author edgar
 */
public class StockMedicamento {

    private int idMedicamento;
    private int idSucStockMed;
    private int unidadeskExistencia;
    private Date fechaUltimaCompra;
    private int unidadesCompradas;
    private int unidadesVendidas;
    private Date fechaUltimaVenta;

    public StockMedicamento(int idMedicamento, int idSucStockMed, int unidadeskExistencia, Date fechaUltimaCompra, int unidadesCompradas, int unidadesVendidas, Date fechaUltimaVenta) {
        this.idMedicamento = idMedicamento;
        this.idSucStockMed = idSucStockMed;
        this.unidadeskExistencia = unidadeskExistencia;
        this.fechaUltimaCompra = fechaUltimaCompra;
        this.unidadesCompradas = unidadesCompradas;
        this.unidadesVendidas = unidadesVendidas;
        this.fechaUltimaVenta = fechaUltimaVenta;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getIdSucStockMed() {
        return idSucStockMed;
    }

    public void setIdSucStockMed(int idSucStockMed) {
        this.idSucStockMed = idSucStockMed;
    }

    public int getUnidadeskExistencia() {
        return unidadeskExistencia;
    }

    public void setUnidadeskExistencia(int unidadeskExistencia) {
        this.unidadeskExistencia = unidadeskExistencia;
    }

    public Date getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    public void setFechaUltimaCompra(Date fechaUltimaCompra) {
        this.fechaUltimaCompra = fechaUltimaCompra;
    }

    public int getUnidadesCompradas() {
        return unidadesCompradas;
    }

    public void setUnidadesCompradas(int unidadesCompradas) {
        this.unidadesCompradas = unidadesCompradas;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public Date getFechaUltimaVenta() {
        return fechaUltimaVenta;
    }

    public void setFechaUltimaVenta(Date fechaUltimaVenta) {
        this.fechaUltimaVenta = fechaUltimaVenta;
    }

}
