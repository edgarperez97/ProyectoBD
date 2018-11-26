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
    private int idMunicipioProv;
    private int idEstadoProv;
    private int idCodPosProv;
    private int telefono;

    public Proveedor(int idProveedor, String nombreProv, String apelliP, String apelliM, int edadProv, String direccion, int idMunicipioProv, int idEstadoProv, int idCodPosProv, int telefono) {
        this.idProveedor = idProveedor;
        this.nombreProv = nombreProv;
        this.apelliP = apelliP;
        this.apelliM = apelliM;
        this.edadProv = edadProv;
        this.direccion = direccion;
        this.idMunicipioProv = idMunicipioProv;
        this.idEstadoProv = idEstadoProv;
        this.idCodPosProv = idCodPosProv;
        this.telefono = telefono;
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

    public int getIdMunicipioProv() {
        return idMunicipioProv;
    }

    public void setIdMunicipioProv(int idMunicipioProv) {
        this.idMunicipioProv = idMunicipioProv;
    }

    public int getIdEstadoProv() {
        return idEstadoProv;
    }

    public void setIdEstadoProv(int idEstadoProv) {
        this.idEstadoProv = idEstadoProv;
    }

    public int getIdCodPosProv() {
        return idCodPosProv;
    }

    public void setIdCodPosProv(int idCodPosProv) {
        this.idCodPosProv = idCodPosProv;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
