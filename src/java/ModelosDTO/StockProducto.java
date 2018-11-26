package ModelosDTO;

/**
 *
 * @author edgar
 */
public class StockProducto {

    private int idStockProducto;
    private int idSucStockProd;
    private int idProdStock;
    private int unidadesExistencia;
    private String fechaUltimaCompra;
    private int unidadesCompradas;
    private int unidadesVendidas;
    private String fechaUltimaVenta;

    public StockProducto(int idStockProducto, int idSucStockProd, int idProdStock, int unidadesExistencia, String fechaUltimaCompra, int unidadesCompradas, int unidadesVendidas, String fechaUltimaVenta) {
        this.idStockProducto = idStockProducto;
        this.idSucStockProd = idSucStockProd;
        this.idProdStock = idProdStock;
        this.unidadesExistencia = unidadesExistencia;
        this.fechaUltimaCompra = fechaUltimaCompra;
        this.unidadesCompradas = unidadesCompradas;
        this.unidadesVendidas = unidadesVendidas;
        this.fechaUltimaVenta = fechaUltimaVenta;
    }

    public int getIdStockProducto() {
        return idStockProducto;
    }

    public void setIdStockProducto(int idStockProducto) {
        this.idStockProducto = idStockProducto;
    }

    public int getIdSucStockProd() {
        return idSucStockProd;
    }

    public void setIdSucStockProd(int idSucStockProd) {
        this.idSucStockProd = idSucStockProd;
    }

    public int getIdProdStock() {
        return idProdStock;
    }

    public void setIdProdStock(int idProdStock) {
        this.idProdStock = idProdStock;
    }

    public int getUnidadesExistencia() {
        return unidadesExistencia;
    }

    public void setUnidadesExistencia(int unidadesExistencia) {
        this.unidadesExistencia = unidadesExistencia;
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
