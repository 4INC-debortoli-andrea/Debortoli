package orologio;


public class OrologioDigitale extends Orologio {

    private int ora12h;
    private String amOrpm;

    public OrologioDigitale(int ora, int minuti, int secondi) throws Exception {
        super(ora, minuti, secondi);
    }

    public void suDodiciOre(boolean scelta) {
        if (scelta == true) {
            if (super.getOra() > 12) {
                this.ora12h = (super.getOra() - 12);
                this.amOrpm = "pm";
            } else {
                this.amOrpm = "am";
            }
        }
    }

    public String stampa(){
        return ora12h+" : "+super.getMinuti()+" : "+super.getSecondi()+" "+amOrpm;
    }
}