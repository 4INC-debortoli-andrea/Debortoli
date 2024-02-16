package Esercitazione;

/**
 *
 * @author andry
 */
public class Audio extends DatoMultimediale {

    private int volume;
    private int durata;

    public Audio(int durata, int volume, String titolo) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }

    public void alza(int n) {
        if ((volume + n) <= 10) {
            volume += n;
        }
    }

    public void abbassa(int n) {
        if ((volume - n) >= 0) {
            volume -= n;
        }
    }

    public String play() {
        String t = "";
        for (int i = 0; i < durata; i++) {
            t += super.getTitolo() + "\t";
            for (int j = 0; j < volume; j++) {
                t += "!";
            }
            t += "\n";
        }
        return t;
    }

    public String toString() {
        return super.toString() + "\nvolume = " + volume + "\ndurata = " + durata;
    }
}

