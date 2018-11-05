package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Farmacia {

    private int idFarmacia;
    private int idCiudad;
    private String nombre;

    public Farmacia(int idFarmacia, int idCiudad, String nombre) {
        this.idFarmacia = idFarmacia;
        this.idCiudad = idCiudad;
        this.nombre = nombre;
    }

    public int getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(int idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
