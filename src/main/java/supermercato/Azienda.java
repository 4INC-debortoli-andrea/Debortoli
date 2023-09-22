
package supermercato;

/**
 *
 * @author andrea.debortoli
 */
public class Azienda {
    private String nomeGruppo;
    private String sedeLegale;
    private Supermercato[] supermercati;
    
    public Azienda(String nomeGruppo, String sedeLegale, Supermercato[] supermercato){
        this.nomeGruppo = nomeGruppo;
        this.sedeLegale = sedeLegale;
        this.supermercati = copia(supermercati);
    }
    
    private Supermercato[] copia(Supermercato[] arrayDaCopiare){
        Supermercato[] temp = new Supermercato[arrayDaCopiare.length];
        for(int i = 0; i < arrayDaCopiare.length; i++){
            temp[i] = arrayDaCopiare[i];
        }
        return temp;
    }
    
    public void addProd(Prodotto[] pAdd, int indice){
        supermercati[indice].addProd(pAdd);
    }
}
