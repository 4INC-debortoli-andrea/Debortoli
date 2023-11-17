package orologio;


public class OrologioDigitale extends Orologio {
    private int oraDigitale;
    private String amOrpm = "";

    public OrologioDigitale(int ora, int minuti, int secondi) throws Exception {
        super(ora, minuti, secondi);
        this.oraDigitale = ora;
    }

    public void suDodiciOre(boolean scelta) {
        if (scelta == true) {
            if (super.getOra() > 12) {
                oraDigitale = (super.getOra() - 12);
                this.amOrpm += "pm";
            } else {
                
                this.amOrpm += "am";
            }
            
        }        
    }

    public String stampa() {
        return oraDigitale + " : " + super.getMinuti() + " : " + 
                super.getSecondi() + " " + amOrpm;
    }
}
