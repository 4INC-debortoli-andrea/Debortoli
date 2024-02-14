package Esercitazione;

/**
 *
 * @author andry
 */
public class Filmato extends DatoMultimediale implements IsRiproducibile {

    private int volume;
    private int durata;
    private int luminosità;

    public Filmato(int volume, int durata, int luminosità, String titolo) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
        this.luminosità = luminosità;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    public int getLuminosità() {
        return luminosità;
    }
    
    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void alza(int n) {
        if ((volume + n) <= 10) {
            volume += n;
        }
    }

    @Override
    public void abbassa(int n) {
        if ((volume - n) >= 0) {
            volume -= n;
        }
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

    @Override
    public String play() {
        String t = "";
        for (int i = 0; i < durata; i++) {
            t += super.getTitolo() + "\t";
            for (int j = 0; j < volume; j++) {
                t += "!";
            }
            t += "\t";
            for (int j = 0; j < luminosità; j++) {
                t += "*";
            }
            t += "\n";
        }
        return t;
    }
    
    public String mostra(){
        String t = super.getTitolo() + "\t";
        for (int i = 0; i < durata; i++) {
            t += "!";
        }
        t += "\n";
        return t;
    }

    @Override
    public String toString() {
        return super.toString() + "\nvolume = " + volume + "\ndurata = " + durata + "\nluminosità = " + luminosità;
    }
}

