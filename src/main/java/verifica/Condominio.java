package verifica;

/**
 *
 * @author andrea.debortoli
 */

import java.util.ArrayList;
import verifica512                     .Data;
public class Condominio extends HasNormativa {
    private ArrayList<Appartamento> appartamenti;

    public Condominio(ArrayList<Appartamento> appartamenti, boolean normativaIncendio, String nome, Impianto impianto, Data controlloAnnuale, Data controlloFumi, boolean hasCapotto) {
        super(normativaIncendio, nome, impianto, controlloAnnuale, controlloFumi, hasCapotto);
        this.appartamenti = appartamenti;
    }
    
    
}
