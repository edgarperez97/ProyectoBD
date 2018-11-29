package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Sucursal {

    private int idSucursal;
    private String nombreSucl;
    private String direccionSuc;
    private String nomMunicipio;
    private String nomEstado;
    private String codPostal;
    private String telefonoSuc;

    public Sucursal(int idSucursal, String nombreSucl, String direccionSuc, String nomMunicipio, String nomEstado, String codPostal, String telefonoSuc) {
        this.idSucursal = idSucursal;
        this.nombreSucl = nombreSucl;
        this.direccionSuc = direccionSuc;
        this.nomMunicipio = nomMunicipio;
        this.nomEstado = nomEstado;
        this.codPostal = codPostal;
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

    public String getNomMunicipio() {
        return nomMunicipio;
    }

    public void setNomMunicipio(String nomMunicipio) {
        this.nomMunicipio = nomMunicipio;
    }

    public String getNomEstado() {
        return nomEstado;
    }

    public void setNomEstado(String nomEstado) {
        this.nomEstado = nomEstado;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getTelefonoSuc() {
        return telefonoSuc;
    }

    public void setTelefonoSuc(String telefonoSuc) {
        this.telefonoSuc = telefonoSuc;
    }

}
