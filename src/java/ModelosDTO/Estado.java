package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Estado {

    private String nombreEstado;

    public Estado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
    
    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

}
