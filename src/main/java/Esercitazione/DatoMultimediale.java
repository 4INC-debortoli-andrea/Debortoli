package Esercitazione;

/**
 *
 * @author andry
 */
public abstract class DatoMultimediale {
    private String titolo;

    public DatoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return "titolo = " + titolo;
    }
}
