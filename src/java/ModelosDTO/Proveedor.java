package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Proveedor {

    private int idProveedor;
    private String nombreProv;
    private String apelliP;
    private String apelliM;
    private int edadProv;
    private String direccion;
    private String nomMuniProv;
    private String nomEstProv;
    private String codPostProv;
    private String telefonoProv;

    public Proveedor(int idProveedor, String nombreProv, String apelliP, String apelliM, int edadProv, String direccion, String nomMuniProv, String nomEstProv, String codPostProv, String telefonoProv) {
        this.idProveedor = idProveedor;
        this.nombreProv = nombreProv;
        this.apelliP = apelliP;
        this.apelliM = apelliM;
        this.edadProv = edadProv;
        this.direccion = direccion;
        this.nomMuniProv = nomMuniProv;
        this.nomEstProv = nomEstProv;
        this.codPostProv = codPostProv;
        this.telefonoProv = telefonoProv;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getApelliP() {
        return apelliP;
    }

    public void setApelliP(String apelliP) {
        this.apelliP = apelliP;
    }

    public String getApelliM() {
        return apelliM;
    }

    public void setApelliM(String apelliM) {
        this.apelliM = apelliM;
    }

    public int getEdadProv() {
        return edadProv;
    }

    public void setEdadProv(int edadProv) {
        this.edadProv = edadProv;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNomMuniProv() {
        return nomMuniProv;
    }

    public void setNomMuniProv(String nomMuniProv) {
        this.nomMuniProv = nomMuniProv;
    }

    public String getNomEstProv() {
        return nomEstProv;
    }

    public void setNomEstProv(String nomEstProv) {
        this.nomEstProv = nomEstProv;
    }

    public String getCodPostProv() {
        return codPostProv;
    }

    public void setCodPostProv(String codPostProv) {
        this.codPostProv = codPostProv;
    }

    public String getTelefonoProv() {
        return telefonoProv;
    }

    public void setTelefonoProv(String telefonoProv) {
        this.telefonoProv = telefonoProv;
    }

}
