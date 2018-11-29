package ModelosDTO;

/**
 *
 * @author edgar
 */
public class PagoTarjetaDebito {

    private int idPagoTarjetaDebito;
    private int idCliente3;
    private String numeroTarjetaDebito;
    private float montoDebito;

    public PagoTarjetaDebito(int idPagoTarjetaDebito, int idCliente3, String numeroTarjetaDebito, float montoDebito) {
        this.idPagoTarjetaDebito = idPagoTarjetaDebito;
        this.idCliente3 = idCliente3;
        this.numeroTarjetaDebito = numeroTarjetaDebito;
        this.montoDebito = montoDebito;
    }

    public int getIdPagoTarjetaDebito() {
        return idPagoTarjetaDebito;
    }

    public void setIdPagoTarjetaDebito(int idPagoTarjetaDebito) {
        this.idPagoTarjetaDebito = idPagoTarjetaDebito;
    }

    public int getIdCliente3() {
        return idCliente3;
    }

    public void setIdCliente3(int idCliente3) {
        this.idCliente3 = idCliente3;
    }

    public String getNumeroTarjetaDebito() {
        return numeroTarjetaDebito;
    }

    public void setNumeroTarjetaDebito(String numeroTarjetaDebito) {
        this.numeroTarjetaDebito = numeroTarjetaDebito;
    }

    public float getMontoDebito() {
        return montoDebito;
    }

    public void setMontoDebito(float montoDebito) {
        this.montoDebito = montoDebito;
    }

}
