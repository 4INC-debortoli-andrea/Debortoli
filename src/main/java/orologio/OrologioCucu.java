package orologio;


public class OrologioCucu extends Orologio {

    public OrologioCucu(int ora, int minuti, int secondi) throws Exception {
        super(ora, minuti, secondi);
    }

    public String stampa() {

        String cucu = " CuCu!";
        String txt = super.getOra()+" : "+super.getMinuti()+" : "+super.getSecondi();

        if (super.getOra() == 12 || super.getOra() == 0) {
            txt += cucu;
        }

        return txt;
    }
}