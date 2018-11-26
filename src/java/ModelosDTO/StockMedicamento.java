package ModelosDTO;

/**
 *
 * @author edgar
 */
public class StockMedicamento {

    private int idMedicamento;
    private int idSucStockMed;
    private int unidadeskExistencia;
    private String fechaUltimaCompra;
    private int unidadesCompradas;
    private int unidadesVendidas;
    private String fechaUltimaVenta;

    public StockMedicamento(int idMedicamento, int idSucStockMed, int unidadeskExistencia, String fechaUltimaCompra, int unidadesCompradas, int unidadesVendidas, String fechaUltimaVenta) {
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

    public String getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    public void setFechaUltimaCompra(String fechaUltimaCompra) {
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

    public String getFechaUltimaVenta() {
        return fechaUltimaVenta;
    }

    public void setFechaUltimaVenta(String fechaUltimaVenta) {
        this.fechaUltimaVenta = fechaUltimaVenta;
    }

}
