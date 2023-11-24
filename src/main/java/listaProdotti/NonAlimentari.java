package listaProdotti;

/**
 *
 * @author andrea.debortoli
 */

import prodotto.Prodotto;
public class NonAlimentari extends Prodotto{
    private boolean contienePlastica;
    
    public NonAlimentari(Prodotto p, boolean contienePlastica){
        super(p);
        setContienePlastica(contienePlastica);
    }
    
    public final void setContienePlastica(boolean contienePlastica) {
        this.contienePlastica=contienePlastica;
    }
    
    public boolean contienePlastica() {
        return contienePlastica;
    }
    
    @Override
    public String toString() {
       return super.toSting() + "contienePlastica: " + contienePlastica + "\n";
    }   
}
