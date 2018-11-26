package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Sucursal {

    private int idSucursal;
    private String nombreSucl;
    private String direccionSuc;
    private int idMunicipioSuc;
    private int idEstadoSuc;
    private int idPaisSuc;
    private int idCodPostalSuc;
    private int telefonoSuc;

    public Sucursal(int idSucursal, String nombreSucl, String direccionSuc, int idMunicipioSuc, int idEstadoSuc, int idPaisSuc, int idCodPostalSuc, int telefonoSuc) {
        this.idSucursal = idSucursal;
        this.nombreSucl = nombreSucl;
        this.direccionSuc = direccionSuc;
        this.idMunicipioSuc = idMunicipioSuc;
        this.idEstadoSuc = idEstadoSuc;
        this.idPaisSuc = idPaisSuc;
        this.idCodPostalSuc = idCodPostalSuc;
        this.telefonoSuc = telefonoSuc;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucl() {
        return nombreSucl;
    }

    public void setNombreSucl(String nombreSucl) {
        this.nombreSucl = nombreSucl;
    }

    public String getDireccionSuc() {
        return direccionSuc;
    }

    public void setDireccionSuc(String direccionSuc) {
        this.direccionSuc = direccionSuc;
    }

    public int getIdMunicipioSuc() {
        return idMunicipioSuc;
    }

    public void setIdMunicipioSuc(int idMunicipioSuc) {
        this.idMunicipioSuc = idMunicipioSuc;
    }

    public int getIdEstadoSuc() {
        return idEstadoSuc;
    }

    public void setIdEstadoSuc(int idEstadoSuc) {
        this.idEstadoSuc = idEstadoSuc;
    }

    public int getIdPaisSuc() {
        return idPaisSuc;
    }

    public void setIdPaisSuc(int idPaisSuc) {
        this.idPaisSuc = idPaisSuc;
    }

    public int getIdCodPostalSuc() {
        return idCodPostalSuc;
    }

    public void setIdCodPostalSuc(int idCodPostalSuc) {
        this.idCodPostalSuc = idCodPostalSuc;
    }

    public int getTelefonoSuc() {
        return telefonoSuc;
    }

    public void setTelefonoSuc(int telefonoSuc) {
        this.telefonoSuc = telefonoSuc;
    }

}
