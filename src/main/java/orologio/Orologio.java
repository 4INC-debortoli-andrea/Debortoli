package orologio;


public class Orologio {

    private int ora;
    private int minuti;
    private int secondi;

    public Orologio(int ora, int minuti, int secondi) throws Exception {
        setMinuti(minuti);
        setOra(ora);
        setSecondi(secondi);
    }

    public void setMinuti(int minuti) throws Exception {
        if (minuti > 60 || minuti < 0) {
            throw new Exception("minuti sbagliati");
        } else {
            this.minuti = minuti;
        }
    }

    public void setOra(int ora) throws Exception {
        if (ora > 23  || ora < 0) {
            throw new Exception("ora sbagliata");
        } else {
            this.ora = ora;
        }
    }

    public void setSecondi(int secondi) throws Exception {
        if (secondi > 60 || secondi < 0) {
            throw new Exception("secondi sbagliati");
        } else {
            this.secondi = secondi;
        }
    }

    public int getOra() {
        return ora;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }
    
    public void aggiungiOre(int n) {

        ora += n;
        while (ora >= 24) {
            ora -= 24;
        }

    }


    public String stampa() {
        return ora + " : " + minuti + " : " + secondi;
    }
}