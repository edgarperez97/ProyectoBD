package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Presentacion {

    private int idPresentacion;
    private String nombre;

    public Presentacion(int idPresentacion, String nombre) {
        this.idPresentacion = idPresentacion;
        this.nombre = nombre;
    }

    public int getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(int idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
