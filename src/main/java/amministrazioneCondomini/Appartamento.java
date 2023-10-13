package amministrazioneCondomini;

/**
 *
 * @author andrea.debortoli
 */
public class Appartamento {
    private String nominativoProprietario;
    private double millesimi;
    private int numeroApp;
    
    public Appartamento(String nominativo, double millesimi, int numeroApp){
        this.nominativoProprietario = nominativo;
        this.millesimi = millesimi;
        this.numeroApp = numeroApp;
    }
    
    public Appartamento (Appartamento a){
        this.nominativoProprietario = a.nominativoProprietario;
        this.millesimi = a.millesimi;
        this.numeroApp = a.numeroApp;
    }

    public String getNominativoProprietario() {
        return nominativoProprietario;
    }
    public double getMillesimi() {
        return millesimi;
    }
    public int getNumeroApp() {
        return numeroApp;
    }
    public void setNominativoProprietario(String nominativoProprietario) {
        this.nominativoProprietario = nominativoProprietario;
    }
    public void setMillesimi(double millesimi) {
        this.millesimi = millesimi;
    }
    public void setNumeroApp(int numeroApp) {
        this.numeroApp = numeroApp;
    }

    @Override
    public String toString() {
        return "Appartamento{"
                + "\n\tnominativoProprietario: " + nominativoProprietario
                + "\n\tmillesimi: " + millesimi 
                + "\n\tnumeroAppartamento: " + numeroApp
                + "\n}"; 
    }
    
    
    
}
