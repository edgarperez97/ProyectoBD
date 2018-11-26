package ModelosDTO;

/**
 *
 * @author edgar
 */
public class CodigoPostal {

    private int idCodPos;
    private int codigoPostal;

    public CodigoPostal(int idCodPos, int codigoPostal) {
        this.idCodPos = idCodPos;
        this.codigoPostal = codigoPostal;
    }

    public int getIdCodPos() {
        return idCodPos;
    }

    public void setIdCodPos(int idCodPos) {
        this.idCodPos = idCodPos;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

}
