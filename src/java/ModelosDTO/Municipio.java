package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Municipio {

    private int idMunicipio;
    private String nombreCiudad;

    public Municipio(int idMunicipio, String nombreCiudad) {
        this.idMunicipio = idMunicipio;
        this.nombreCiudad = nombreCiudad;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

}
