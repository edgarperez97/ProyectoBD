package ModelosDTO;

/**
 *
 * @author edgar
 */
public class AccionTerapeutica {

    private int idAccionTerapeutica;
    private String descripcion;

    public AccionTerapeutica(int idAccionTerapeutica, String descripcion) {
        this.idAccionTerapeutica = idAccionTerapeutica;
        this.descripcion = descripcion;
    }

    public int getIdAccionTerapeutica() {
        return idAccionTerapeutica;
    }

    public void setIdAccionTerapeutica(int idAccionTerapeutica) {
        this.idAccionTerapeutica = idAccionTerapeutica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
