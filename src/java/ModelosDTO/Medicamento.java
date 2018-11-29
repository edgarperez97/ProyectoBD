package ModelosDTO;

import java.util.Date;

/**
 *
 * @author edgar
 */
public class Medicamento {

    private int idMedicamentos;
    private String nombreMed;
    private float precioPublico;
    private float precioCompra;
    private Date fechaCaducidad;
    private int idPresentaMedica;
    private String sustanciaActiva;
    private String nombreLaboratorio;
    private int idAccioTer;
    private int idProveedor;

    public Medicamento(int idMedicamentos, String nombreMed, float precioPublico, float precioCompra, Date fechaCaducidad, int idPresentaMedica, String sustanciaActiva, String nombreLaboratorio, int idAccioTer, int idProveedor) {
        this.idMedicamentos = idMedicamentos;
        this.nombreMed = nombreMed;
        this.precioPublico = precioPublico;
        this.precioCompra = precioCompra;
        this.fechaCaducidad = fechaCaducidad;
        this.idPresentaMedica = idPresentaMedica;
        this.sustanciaActiva = sustanciaActiva;
        this.nombreLaboratorio = nombreLaboratorio;
        this.idAccioTer = idAccioTer;
        this.idProveedor = idProveedor;
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

    public float getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(float precioPublico) {
        this.precioPublico = precioPublico;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getIdPresentaMedica() {
        return idPresentaMedica;
    }

    public void setIdPresentaMedica(int idPresentaMedica) {
        this.idPresentaMedica = idPresentaMedica;
    }

    public String getSustanciaActiva() {
        return sustanciaActiva;
    }

    public void setSustanciaActiva(String sustanciaActiva) {
        this.sustanciaActiva = sustanciaActiva;
    }

    public String getNombreLaboratorio() {
        return nombreLaboratorio;
    }

    public void setNombreLaboratorio(String nombreLaboratorio) {
        this.nombreLaboratorio = nombreLaboratorio;
    }

    public int getIdAccioTer() {
        return idAccioTer;
    }

    public void setIdAccioTer(int idAccioTer) {
        this.idAccioTer = idAccioTer;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

}
