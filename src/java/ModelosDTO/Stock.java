package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Stock {

    private int IdFarmacia;
    private int IdMedicamento;
    private int cantidad;
    private double precio;

    public Stock(int IdFarmacia, int IdMedicamento, int cantidad, double precio) {
        this.IdFarmacia = IdFarmacia;
        this.IdMedicamento = IdMedicamento;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdFarmacia() {
        return IdFarmacia;
    }

    public void setIdFarmacia(int IdFarmacia) {
        this.IdFarmacia = IdFarmacia;
    }

    public int getIdMedicamento() {
        return IdMedicamento;
    }

    public void setIdMedicamento(int IdMedicamento) {
        this.IdMedicamento = IdMedicamento;
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
