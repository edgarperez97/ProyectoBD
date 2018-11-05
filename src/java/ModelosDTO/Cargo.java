package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Cargo {

    private int cargo;
    private String nombreCargo;

    public Cargo(int cargo, String nombreCargo) {
        this.cargo = cargo;
        this.nombreCargo = nombreCargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

}
