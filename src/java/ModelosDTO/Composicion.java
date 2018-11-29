package ModelosDTO;

/**
 *
 * @author edgar
 */
public class Composicion {

    private String sustanciaActiva;
    private String miligramos;
    private String sustancia2;
    private String miligramos2;

    public Composicion(String sustanciaActiva, String miligramos, String sustancia2, String miligramos2) {
        this.sustanciaActiva = sustanciaActiva;
        this.miligramos = miligramos;
        this.sustancia2 = sustancia2;
        this.miligramos2 = miligramos2;
    }

    public String getSustanciaActiva() {
        return sustanciaActiva;
    }

    public void setSustanciaActiva(String sustanciaActiva) {
        this.sustanciaActiva = sustanciaActiva;
    }

    public String getMiligramos() {
        return miligramos;
    }

    public void setMiligramos(String miligramos) {
        this.miligramos = miligramos;
    }

    public String getSustancia2() {
        return sustancia2;
    }

    public void setSustancia2(String sustancia2) {
        this.sustancia2 = sustancia2;
    }

    public String getMiligramos2() {
        return miligramos2;
    }

    public void setMiligramos2(String miligramos2) {
        this.miligramos2 = miligramos2;
    }

}
