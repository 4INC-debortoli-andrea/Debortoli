package pescaOggetti;


/**
 *
 * @author andry
 */
public abstract class Oggetto {

    private Integer puntiDirettti;
    private Integer puntiIndiretti;
    private String nomeOgg;
    private String caratteristiche;

    public Oggetto(Integer puntiDirettti, Integer puntiIndiretti, String nomeOgg, String caratteristiche) {
        this.puntiDirettti = puntiDirettti;
        this.puntiIndiretti = puntiIndiretti;
        this.nomeOgg = nomeOgg;
        this.caratteristiche = caratteristiche;
    }

    public String getCaratteristiche() {
        return caratteristiche;
    }

    public String getNomeOgg() {
        return nomeOgg;
    }

    public Integer getPuntiDirettti() {
        return puntiDirettti;
    }

    public Integer getPuntiIndiretti() {
        return puntiIndiretti;
    }

    @Override
    public String toString() {
        if (caratteristiche == null) {
            return nomeOgg;
        } else {
            return nomeOgg + " " + caratteristiche;
        }
    }

}
