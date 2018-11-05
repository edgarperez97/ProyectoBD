package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Farmacia {

    private int IdFarmacia;
    private int IdCiudad;
    private String nombre;

    public Farmacia(int IdFarmacia, int IdCiudad, String nombre) {
        this.IdFarmacia = IdFarmacia;
        this.IdCiudad = IdCiudad;
        this.nombre = nombre;
    }

    public int getIdFarmacia() {
        return IdFarmacia;
    }

    public void setIdFarmacia(int IdFarmacia) {
        this.IdFarmacia = IdFarmacia;
    }

    public int getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(int IdCiudad) {
        this.IdCiudad = IdCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
