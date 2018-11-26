package ModelosDTO;

/**
 *
 * @author edgar
 */
public class OrdenDeVenta {

    private int idOrdenVenta;
    private int idSucursalOrdenVenta;
    private int empleadoOrdenVenta;
    private int idClienteOrdenVenta;
    private int idMedicamentoOrdenVenta;
    private int idProductoOrdenVenta;
    private int idTipoPagoOrdenVenta;
    private int idPagoTarjetaCredito;
    private int idPagoTarjetaDebito;
    private int monto;
    private String fechaOrdenVenta;

    public OrdenDeVenta(int idOrdenVenta, int idSucursalOrdenVenta, int empleadoOrdenVenta, int idClienteOrdenVenta, int idMedicamentoOrdenVenta, int idProductoOrdenVenta, int idTipoPagoOrdenVenta, int idPagoTarjetaCredito, int idPagoTarjetaDebito, int monto, String fechaOrdenVenta) {
        this.idOrdenVenta = idOrdenVenta;
        this.idSucursalOrdenVenta = idSucursalOrdenVenta;
        this.empleadoOrdenVenta = empleadoOrdenVenta;
        this.idClienteOrdenVenta = idClienteOrdenVenta;
        this.idMedicamentoOrdenVenta = idMedicamentoOrdenVenta;
        this.idProductoOrdenVenta = idProductoOrdenVenta;
        this.idTipoPagoOrdenVenta = idTipoPagoOrdenVenta;
        this.idPagoTarjetaCredito = idPagoTarjetaCredito;
        this.idPagoTarjetaDebito = idPagoTarjetaDebito;
        this.monto = monto;
        this.fechaOrdenVenta = fechaOrdenVenta;
    }

    public int getIdOrdenVenta() {
        return idOrdenVenta;
    }

    public void setIdOrdenVenta(int idOrdenVenta) {
        this.idOrdenVenta = idOrdenVenta;
    }

    public int getIdSucursalOrdenVenta() {
        return idSucursalOrdenVenta;
    }

    public void setIdSucursalOrdenVenta(int idSucursalOrdenVenta) {
        this.idSucursalOrdenVenta = idSucursalOrdenVenta;
    }

    public int getEmpleadoOrdenVenta() {
        return empleadoOrdenVenta;
    }

    public void setEmpleadoOrdenVenta(int empleadoOrdenVenta) {
        this.empleadoOrdenVenta = empleadoOrdenVenta;
    }

    public int getIdClienteOrdenVenta() {
        return idClienteOrdenVenta;
    }

    public void setIdClienteOrdenVenta(int idClienteOrdenVenta) {
        this.idClienteOrdenVenta = idClienteOrdenVenta;
    }

    public int getIdMedicamentoOrdenVenta() {
        return idMedicamentoOrdenVenta;
    }

    public void setIdMedicamentoOrdenVenta(int idMedicamentoOrdenVenta) {
        this.idMedicamentoOrdenVenta = idMedicamentoOrdenVenta;
    }

    public int getIdProductoOrdenVenta() {
        return idProductoOrdenVenta;
    }

    public void setIdProductoOrdenVenta(int idProductoOrdenVenta) {
        this.idProductoOrdenVenta = idProductoOrdenVenta;
    }

    public int getIdTipoPagoOrdenVenta() {
        return idTipoPagoOrdenVenta;
    }

    public void setIdTipoPagoOrdenVenta(int idTipoPagoOrdenVenta) {
        this.idTipoPagoOrdenVenta = idTipoPagoOrdenVenta;
    }

    public int getIdPagoTarjetaCredito() {
        return idPagoTarjetaCredito;
    }

    public void setIdPagoTarjetaCredito(int idPagoTarjetaCredito) {
        this.idPagoTarjetaCredito = idPagoTarjetaCredito;
    }

    public int getIdPagoTarjetaDebito() {
        return idPagoTarjetaDebito;
    }

    public void setIdPagoTarjetaDebito(int idPagoTarjetaDebito) {
        this.idPagoTarjetaDebito = idPagoTarjetaDebito;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFechaOrdenVenta() {
        return fechaOrdenVenta;
    }

    public void setFechaOrdenVenta(String fechaOrdenVenta) {
        this.fechaOrdenVenta = fechaOrdenVenta;
    }

}
