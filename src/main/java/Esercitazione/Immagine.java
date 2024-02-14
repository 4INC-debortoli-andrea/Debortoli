package Esercitazione;

/**
 *
 * @author andry
 */
public class Immagine extends DatoMultimediale{
    private int luminosità;

    public Immagine(int luminosità, String titolo) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public int getLuminosità() {
        return luminosità;
    }
    
    public void schiarisci(int n) {
        if ((luminosità + n) <= 10) {
            luminosità += n;
        }
    }

    public void scurisci(int n) {
        if ((luminosità - n) >= 0) {
            luminosità -= n;
        }
    }
    
    public String mostra(){
        String t = super.getTitolo() + "\t";
        for (int i = 0; i < luminosità; i++) {
            t += "*";
        }
        t += "\n";
        return t;
    }

    @Override
    public String toString() {
        return super.toString() + "\nluminosità = " + luminosità;
    }
}

