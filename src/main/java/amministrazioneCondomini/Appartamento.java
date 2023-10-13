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
    
}
