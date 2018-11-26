package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Cliente {

    private int idCliente;
    private String nombreCliente;
    private String apellidoPCliente;
    private String apellidoMCliente;
    private int edad;
    private String direccion;
    private int idMunicipioCli;
    private int idEstCli;
    private int idCodPosCli;
    private int telefonoCli;

    public Cliente(int idCliente, String nombreCliente, String apellidoPCliente, String apellidoMCliente, int edad, String direccion, int idMunicipioCli, int idEstCli, int idCodPosCli, int telefonoCli) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoPCliente = apellidoPCliente;
        this.apellidoMCliente = apellidoMCliente;
        this.edad = edad;
        this.direccion = direccion;
        this.idMunicipioCli = idMunicipioCli;
        this.idEstCli = idEstCli;
        this.idCodPosCli = idCodPosCli;
        this.telefonoCli = telefonoCli;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoPCliente() {
        return apellidoPCliente;
    }

    public void setApellidoPCliente(String apellidoPCliente) {
        this.apellidoPCliente = apellidoPCliente;
    }

    public String getApellidoMCliente() {
        return apellidoMCliente;
    }

    public void setApellidoMCliente(String apellidoMCliente) {
        this.apellidoMCliente = apellidoMCliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdMunicipioCli() {
        return idMunicipioCli;
    }

    public void setIdMunicipioCli(int idMunicipioCli) {
        this.idMunicipioCli = idMunicipioCli;
    }

    public int getIdEstCli() {
        return idEstCli;
    }

    public void setIdEstCli(int idEstCli) {
        this.idEstCli = idEstCli;
    }

    public int getIdCodPosCli() {
        return idCodPosCli;
    }

    public void setIdCodPosCli(int idCodPosCli) {
        this.idCodPosCli = idCodPosCli;
    }

    public int getTelefonoCli() {
        return telefonoCli;
    }

    public void setTelefonoCli(int telefonoCli) {
        this.telefonoCli = telefonoCli;
    }

}
