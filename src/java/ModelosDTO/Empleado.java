package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Empleado {

    private int idEmpleado;
    private int idCargo;

    public Empleado(int idEmpleado, int idCargo) {
        this.idEmpleado = idEmpleado;
        this.idCargo = idCargo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

}
