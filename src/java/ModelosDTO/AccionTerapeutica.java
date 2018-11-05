package ModelosDTO;

/**
 *
 * @author edgar
 */
public class AccionTerapeutica {

    private int idAccionTerapeutica;
    private String nombre;

    public AccionTerapeutica(int idAccionTerapeutica, String nombre) {
        this.idAccionTerapeutica = idAccionTerapeutica;
        this.nombre = nombre;
    }

    public int getIdAccionTerapeutica() {
        return idAccionTerapeutica;
    }

    public void setIdAccionTerapeutica(int idAccionTerapeutica) {
        this.idAccionTerapeutica = idAccionTerapeutica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
