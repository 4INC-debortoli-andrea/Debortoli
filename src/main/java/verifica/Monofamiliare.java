package verifica;

/**
 *
 * @author andrea.debortoli
 */

import verifica512.Data;
public class Monofamiliare extends Edificio {
    private Double metratura;

    public Monofamiliare(Double metratura, Impianto impianto, Data controlloAnnuale, Data controlloFumi, boolean hasCapotto) {
        super(impianto, controlloAnnuale, controlloFumi, hasCapotto);
        this.metratura = metratura;
    }
    
}

