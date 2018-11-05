package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Ciudad {

    private int IdCiudad;
    private String nombre;

    public Ciudad(int IdCiudad, String nombre) {
        this.IdCiudad = IdCiudad;
        this.nombre = nombre;
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
