package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Medicamento {

    private int idMedicamento;
    private int idComposicion;
    private int idPresentacion;
    private int idLaboratorio;
    private int idAccionTerapeutica;

    public Medicamento(int idMedicamento, int idComposicion, int idPresentacion, int idLaboratorio, int idAccionTerapeutica) {
        this.idMedicamento = idMedicamento;
        this.idComposicion = idComposicion;
        this.idPresentacion = idPresentacion;
        this.idLaboratorio = idLaboratorio;
        this.idAccionTerapeutica = idAccionTerapeutica;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getIdComposicion() {
        return idComposicion;
    }

    public void setIdComposicion(int idComposicion) {
        this.idComposicion = idComposicion;
    }

    public int getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(int idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public int getIdAccionTerapeutica() {
        return idAccionTerapeutica;
    }

    public void setIdAccionTerapeutica(int idAccionTerapeutica) {
        this.idAccionTerapeutica = idAccionTerapeutica;
    }

}
