package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Laboratorio {

    private int idLaboratorio;
    private String nombreLaboraorio;

    public Laboratorio(int idLaboratorio, String nombreLaboraorio) {
        this.idLaboratorio = idLaboratorio;
        this.nombreLaboraorio = nombreLaboraorio;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getNombreLaboraorio() {
        return nombreLaboraorio;
    }

    public void setNombreLaboraorio(String nombreLaboraorio) {
        this.nombreLaboraorio = nombreLaboraorio;
    }

}
