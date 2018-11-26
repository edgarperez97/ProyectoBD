package ModelosDTO;

/**
 *
 * @author edgar
 */
public class PagoTarjetaCredito {

    private int idPagoTarjetaCredito;
    private int idCliente2;
    private int numeroTarjeta;
    private int montoCredito;

    public PagoTarjetaCredito(int idPagoTarjetaCredito, int idCliente2, int numeroTarjeta, int montoCredito) {
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

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(int montoCredito) {
        this.montoCredito = montoCredito;
    }

}
