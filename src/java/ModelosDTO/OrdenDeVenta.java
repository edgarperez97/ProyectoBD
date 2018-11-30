package ModelosDTO;

import java.sql.Date;

/**
 *
 * @author edgar
 */
public class OrdenDeVenta {

    private int idOrdenVenta;
    private Date fechaOrdenVenta;
    private int idSucOrdenVenta;
    private int idEmpOrdenVenta;
    private int idCliOrdenVenta;
    private int idMedicaOrdenVenta;
    private int idProdOrdenVenta;
    private int idTipoPagoOrdenVenta;
    private int idTarjCred;
    private int idTarjDeb;
    private float monto;
    private float totalConIVA;

    public OrdenDeVenta(int idOrdenVenta, Date fechaOrdenVenta, int idSucOrdenVenta, int idEmpOrdenVenta, int idCliOrdenVenta, int idMedicaOrdenVenta, int idProdOrdenVenta, int idTipoPagoOrdenVenta, int idTarjCred, int idTarjDeb, float monto, float totalConIVA) {
        this.idOrdenVenta = idOrdenVenta;
        this.fechaOrdenVenta = fechaOrdenVenta;
        this.idSucOrdenVenta = idSucOrdenVenta;
        this.idEmpOrdenVenta = idEmpOrdenVenta;
        this.idCliOrdenVenta = idCliOrdenVenta;
        this.idMedicaOrdenVenta = idMedicaOrdenVenta;
        this.idProdOrdenVenta = idProdOrdenVenta;
        this.idTipoPagoOrdenVenta = idTipoPagoOrdenVenta;
        this.idTarjCred = idTarjCred;
        this.idTarjDeb = idTarjDeb;
        this.monto = monto;
        this.totalConIVA = totalConIVA;
    }

    public int getIdOrdenVenta() {
        return idOrdenVenta;
    }

    public void setIdOrdenVenta(int idOrdenVenta) {
        this.idOrdenVenta = idOrdenVenta;
    }

    public Date getFechaOrdenVenta() {
        return fechaOrdenVenta;
    }

    public void setFechaOrdenVenta(Date fechaOrdenVenta) {
        this.fechaOrdenVenta = fechaOrdenVenta;
    }

    public int getIdSucOrdenVenta() {
        return idSucOrdenVenta;
    }

    public void setIdSucOrdenVenta(int idSucOrdenVenta) {
        this.idSucOrdenVenta = idSucOrdenVenta;
    }

    public int getIdEmpOrdenVenta() {
        return idEmpOrdenVenta;
    }

    public void setIdEmpOrdenVenta(int idEmpOrdenVenta) {
        this.idEmpOrdenVenta = idEmpOrdenVenta;
    }

    public int getIdCliOrdenVenta() {
        return idCliOrdenVenta;
    }

    public void setIdCliOrdenVenta(int idCliOrdenVenta) {
        this.idCliOrdenVenta = idCliOrdenVenta;
    }

    public int getIdMedicaOrdenVenta() {
        return idMedicaOrdenVenta;
    }

    public void setIdMedicaOrdenVenta(int idMedicaOrdenVenta) {
        this.idMedicaOrdenVenta = idMedicaOrdenVenta;
    }

    public int getIdProdOrdenVenta() {
        return idProdOrdenVenta;
    }

    public void setIdProdOrdenVenta(int idProdOrdenVenta) {
        this.idProdOrdenVenta = idProdOrdenVenta;
    }

    public int getIdTipoPagoOrdenVenta() {
        return idTipoPagoOrdenVenta;
    }

    public void setIdTipoPagoOrdenVenta(int idTipoPagoOrdenVenta) {
        this.idTipoPagoOrdenVenta = idTipoPagoOrdenVenta;
    }

    public int getIdTarjCred() {
        return idTarjCred;
    }

    public void setIdTarjCred(int idTarjCred) {
        this.idTarjCred = idTarjCred;
    }

    public int getIdTarjDeb() {
        return idTarjDeb;
    }

    public void setIdTarjDeb(int idTarjDeb) {
        this.idTarjDeb = idTarjDeb;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getTotalConIVA() {
        return totalConIVA;
    }

    public void setTotalConIVA(float totalConIVA) {
        this.totalConIVA = totalConIVA;
    }

}
