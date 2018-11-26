package ModelosDTO;

import java.math.BigDecimal;

/**
 *
 * @author edgar
 */
public class PagoTarjetaCredito {

    private int idPagoTarjetaCredito;
    private int idCliente2;
    private String numeroTarjeta;
    private BigDecimal montoCredito;

    public PagoTarjetaCredito(int idPagoTarjetaCredito, int idCliente2, String numeroTarjeta, BigDecimal montoCredito) {
        this.idPagoTarjetaCredito = idPagoTarjetaCredito;
        this.idCliente2 = idCliente2;
        this.numeroTarjeta = numeroTarjeta;
        this.montoCredito = montoCredito;
    }

    public int getIdPagoTarjetaCredito() {
        return idPagoTarjetaCredito;
    }

    public void setIdPagoTarjetaCredito(int idPagoTarjetaCredito) {
        this.idPagoTarjetaCredito = idPagoTarjetaCredito;
    }

    public int getIdCliente2() {
        return idCliente2;
    }

    public void setIdCliente2(int idCliente2) {
        this.idCliente2 = idCliente2;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public BigDecimal getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(BigDecimal montoCredito) {
        this.montoCredito = montoCredito;
    }

}
