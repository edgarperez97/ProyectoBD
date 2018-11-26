package ModelosDTO;

/**
 *
 * @author edgar
 */
public class TipoEmpleado {

    private int idTipoEmpleado;
    private String cargo;

    public TipoEmpleado(int idTipoEmpleado, String cargo) {
        this.idTipoEmpleado = idTipoEmpleado;
        this.cargo = cargo;
    }

    public int getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(int idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
