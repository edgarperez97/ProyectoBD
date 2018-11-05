package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Stock {

    private int idFarmacia;
    private int idMedicamento;
    private int cantidad;
    private double precio;

    public Stock(int idFarmacia, int idMedicamento, int cantidad, double precio) {
        this.idFarmacia = idFarmacia;
        this.idMedicamento = idMedicamento;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(int idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
