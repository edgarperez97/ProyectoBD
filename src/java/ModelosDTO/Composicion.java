package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Composicion {

    private int idComposicion;
    private String nombre;

    public Composicion(int idComposicion, String nombre) {
        this.idComposicion = idComposicion;
        this.nombre = nombre;
    }

    public int getIdComposicion() {
        return idComposicion;
    }

    public void setIdComposicion(int idComposicion) {
        this.idComposicion = idComposicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
