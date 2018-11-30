package ModelosDTO;

import java.sql.Date;

/**
 *
 * @author edgar
 */
public class StockProducto {

    private int idStockProducto;
    private int idSucStockProd;
    private int idProdStock;
    private int unidadesExistencia;
    private Date fechaUltimaCompra;
    private int unidadesVendidas;
    private Date fechaUltimaVenta;

    public StockProducto(int idStockProducto, int idSucStockProd, int idProdStock, int unidadesExistencia, Date fechaUltimaCompra, int unidadesVendidas, Date fechaUltimaVenta) {
        this.idStockProducto = idStockProducto;
        this.idSucStockProd = idSucStockProd;
        this.idProdStock = idProdStock;
        this.unidadesExistencia = unidadesExistencia;
        this.fechaUltimaCompra = fechaUltimaCompra;
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

    public Date getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    public void setFechaUltimaCompra(Date fechaUltimaCompra) {
        this.fechaUltimaCompra = fechaUltimaCompra;
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
