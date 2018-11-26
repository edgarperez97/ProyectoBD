package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Medicamentos {

    private int idMedicamentos;
    private String nombreMed;
    private int idPresentaMedica;
    private int idComposicion;
    private int idLaboratorio;
    private int idAccionTera;
    private int idProveMed;

    public Medicamentos(int idMedicamentos, String nombreMed, int idPresentaMedica, int idComposicion, int idLaboratorio, int idAccionTera, int idProveMed) {
        this.idMedicamentos = idMedicamentos;
        this.nombreMed = nombreMed;
        this.idPresentaMedica = idPresentaMedica;
        this.idComposicion = idComposicion;
        this.idLaboratorio = idLaboratorio;
        this.idAccionTera = idAccionTera;
        this.idProveMed = idProveMed;
    }

    public int getIdMedicamentos() {
        return idMedicamentos;
    }

    public void setIdMedicamentos(int idMedicamentos) {
        this.idMedicamentos = idMedicamentos;
    }

    public String getNombreMed() {
        return nombreMed;
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    public int getIdPresentaMedica() {
        return idPresentaMedica;
    }

    public void setIdPresentaMedica(int idPresentaMedica) {
        this.idPresentaMedica = idPresentaMedica;
    }

    public int getIdComposicion() {
        return idComposicion;
    }

    public void setIdComposicion(int idComposicion) {
        this.idComposicion = idComposicion;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public int getIdAccionTera() {
        return idAccionTera;
    }

    public void setIdAccionTera(int idAccionTera) {
        this.idAccionTera = idAccionTera;
    }

    public int getIdProveMed() {
        return idProveMed;
    }

    public void setIdProveMed(int idProveMed) {
        this.idProveMed = idProveMed;
    }

}
