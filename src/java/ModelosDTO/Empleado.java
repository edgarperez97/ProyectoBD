package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Empleado {

    private int idEmpleado;
    private int idCargo;
    private String nombre;

    public Empleado(int idEmpleado, int idCargo, String nombre) {
        this.idEmpleado = idEmpleado;
        this.idCargo = idCargo;
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
