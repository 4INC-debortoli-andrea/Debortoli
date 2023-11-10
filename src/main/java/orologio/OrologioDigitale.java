package orologio;


public class OrologioDigitale extends Orologio {

    private int oraDig = super.getOra();
    private String amOrpm = "";

    public OrologioDigitale(int ora, int minuti, int secondi) throws Exception {
        super(ora, minuti, secondi);
    }

    public void suDodiciOre(boolean scelta) {
        if (scelta == true) {
            if (super.getOra() > 12) {
                this.oraDig = (this.oraDig - 12);
                this.amOrpm += "pm";
            } else {

                this.amOrpm += "am";
            }
        }
    }

    public String stampa() {
        return oraDig + " : " + super.getMinuti() + " : " + super.getSecondi() + " " + amOrpm;
    }
}
