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
    private int idMunicipioEmp;
    private int idEstadoEmp;
    private int idCodigoPostal;
    private String telefonoEmp;
    private int idTipoEmp;
    private int idSucursalEmp;

    public Empleado(int idEmpleado, String nombreEmpleado, String apellidoPaternoEmp, String apellidoMaternoEmp, int edadEmp, String direccionEmp, int idMunicipioEmp, int idEstadoEmp, int idCodigoPostal, String telefonoEmp, int idTipoEmp, int idSucursalEmp) {
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

    public int getIdMunicipioEmp() {
        return idMunicipioEmp;
    }

    public void setIdMunicipioEmp(int idMunicipioEmp) {
        this.idMunicipioEmp = idMunicipioEmp;
    }

    public int getIdEstadoEmp() {
        return idEstadoEmp;
    }

    public void setIdEstadoEmp(int idEstadoEmp) {
        this.idEstadoEmp = idEstadoEmp;
    }

    public int getIdCodigoPostal() {
        return idCodigoPostal;
    }

    public void setIdCodigoPostal(int idCodigoPostal) {
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
