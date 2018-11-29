package ModelosDTO;

/**
 *
 * @author edgar
 */
public class PagoTarjetaCredito {

    private int idPagoTarjetaCredito;
    private int idCliente2;
    private String numeroTarjeta;
    private float montoCredito;

    public PagoTarjetaCredito(int idPagoTarjetaCredito, int idCliente2, String numeroTarjeta, float montoCredito) {
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

    public float getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(float montoCredito) {
        this.montoCredito = montoCredito;
    }

}
