package ModelosDTO;

/**
 *
 * @author edgar
 */
public class PresentacionMedica {

    private int idPresentacionMedica;
    private String descripcion;

    public PresentacionMedica(int idPresentacionMedica, String descripcion) {
        this.idPresentacionMedica = idPresentacionMedica;
        this.descripcion = descripcion;
    }

    public int getIdPresentacionMedica() {
        return idPresentacionMedica;
    }

    public void setIdPresentacionMedica(int idPresentacionMedica) {
        this.idPresentacionMedica = idPresentacionMedica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
