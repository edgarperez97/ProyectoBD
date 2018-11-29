package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Empleado {

    private int idEmpleado;
    private String nombreEmpleado;
    private String apellidoPaternoEmp;
    private String apellidoMaternoEmp;
    private int edadEmp;
    private String direccionEmp;
    private String idMunicipioEmp;
    private String idEstadoEmp;
    private String idCodigoPostal;
    private String telefonoEmp;
    private int idTipoEmp;
    private int idSucursalEmp;

    public Empleado(int idEmpleado, String nombreEmpleado, String apellidoPaternoEmp, String apellidoMaternoEmp, int edadEmp, String direccionEmp, String idMunicipioEmp, String idEstadoEmp, String idCodigoPostal, String telefonoEmp, int idTipoEmp, int idSucursalEmp) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoPaternoEmp = apellidoPaternoEmp;
        this.apellidoMaternoEmp = apellidoMaternoEmp;
        this.edadEmp = edadEmp;
        this.direccionEmp = direccionEmp;
        this.idMunicipioEmp = idMunicipioEmp;
        this.idEstadoEmp = idEstadoEmp;
        this.idCodigoPostal = idCodigoPostal;
        this.telefonoEmp = telefonoEmp;
        this.idTipoEmp = idTipoEmp;
        this.idSucursalEmp = idSucursalEmp;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoPaternoEmp() {
        return apellidoPaternoEmp;
    }

    public void setApellidoPaternoEmp(String apellidoPaternoEmp) {
        this.apellidoPaternoEmp = apellidoPaternoEmp;
    }

    public String getApellidoMaternoEmp() {
        return apellidoMaternoEmp;
    }

    public void setApellidoMaternoEmp(String apellidoMaternoEmp) {
        this.apellidoMaternoEmp = apellidoMaternoEmp;
    }

    public int getEdadEmp() {
        return edadEmp;
    }

    public void setEdadEmp(int edadEmp) {
        this.edadEmp = edadEmp;
    }

    public String getDireccionEmp() {
        return direccionEmp;
    }

    public void setDireccionEmp(String direccionEmp) {
        this.direccionEmp = direccionEmp;
    }

    public String getIdMunicipioEmp() {
        return idMunicipioEmp;
    }

    public void setIdMunicipioEmp(String idMunicipioEmp) {
        this.idMunicipioEmp = idMunicipioEmp;
    }

    public String getIdEstadoEmp() {
        return idEstadoEmp;
    }

    public void setIdEstadoEmp(String idEstadoEmp) {
        this.idEstadoEmp = idEstadoEmp;
    }

    public String getIdCodigoPostal() {
        return idCodigoPostal;
    }

    public void setIdCodigoPostal(String idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }

    public String getTelefonoEmp() {
        return telefonoEmp;
    }

    public void setTelefonoEmp(String telefonoEmp) {
        this.telefonoEmp = telefonoEmp;
    }

    public int getIdTipoEmp() {
        return idTipoEmp;
    }

    public void setIdTipoEmp(int idTipoEmp) {
        this.idTipoEmp = idTipoEmp;
    }

    public int getIdSucursalEmp() {
        return idSucursalEmp;
    }

    public void setIdSucursalEmp(int idSucursalEmp) {
        this.idSucursalEmp = idSucursalEmp;
    }

}
