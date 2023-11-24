package listaProdotti;

/**
 *
 * @author andrea.debortoli
 */

import prodotto.Prodotto;
import data.DataCompleta;
public class Alimentari extends Prodotto{
    private DataCompleta dataScadenza;
    
    public Alimentari(Prodotto p, DataCompleta dataScadenza) {
        super(p);
        setDataScadenza(dataScadenza);
    }
    
    public final void setDataScadenza(DataCompleta dataScadenza){
        this.dataScadenza = dataScadenza;
    }
        
    public DataCompleta getDataScadenza() {
        return dataScadenza;
    }
    
    @Override
    public String toString() {
        return super.toSting() + "dataScadenza: " + dataScadenza.toString();
    }
}

