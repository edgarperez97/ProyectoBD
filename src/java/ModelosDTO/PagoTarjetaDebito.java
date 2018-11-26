package ModelosDTO;

/**
 *
 * @author edgar
 */
public class PagoTarjetaDebito {

    private int idPagoTarjetaDebito;
    private int idCliente3;
    private int numeroTarjetaDebito;
    private int montoDebito;

    public PagoTarjetaDebito(int idPagoTarjetaDebito, int idCliente3, int numeroTarjetaDebito, int montoDebito) {
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

    public int getNumeroTarjetaDebito() {
        return numeroTarjetaDebito;
    }

    public void setNumeroTarjetaDebito(int numeroTarjetaDebito) {
        this.numeroTarjetaDebito = numeroTarjetaDebito;
    }

    public int getMontoDebito() {
        return montoDebito;
    }

    public void setMontoDebito(int montoDebito) {
        this.montoDebito = montoDebito;
    }

}
