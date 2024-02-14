package Esercitazione;

/**
 *
 * @author andry
 */
public class Audio extends DatoMultimediale implements IsRiproducibile {

    private int volume;
    private int durata;

    public Audio(int durata, int volume, String titolo) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int getDurata() {
        return durata;
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

    @Override
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

    @Override
    public String toString() {
        return super.toString() + "\nvolume = " + volume + "\ndurata = " + durata;
    }
}

