package ModelosDTO;

/**
 *
 * @author edgar
 */
public class FarmaciaEmpleado {

    private int idEmpleado;
    private int idFarmacia;

    public FarmaciaEmpleado(int idEmpleado, int idFarmacia) {
        this.idEmpleado = idEmpleado;
        this.idFarmacia = idFarmacia;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(int idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

}
