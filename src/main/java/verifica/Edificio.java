package verifica;

/**
 *
 * @author andrea.debortoli
 */
import verifica512.Data;


public abstract class Edificio {
    private Impianto impianto;
    private Data controlloAnnuale;
    private Data controlloFumi;
    private boolean hasCapotto;

    public Edificio(Impianto impianto, Data controlloAnnuale, Data controlloFumi, boolean hasCapotto) {
        this.impianto = impianto;
        this.controlloAnnuale = controlloAnnuale;
        this.controlloFumi = controlloFumi;
        this.hasCapotto = hasCapotto;
    }
    

}
