package lezioneExceptions;

/**
 *
 * @author andrea.debortoli
 */
public class TriangoloRettangolo {
    private Double base;
    private Double altezza;
    private Double lato;
    private String colore;
    private String id;
   
    public TriangoloRettangolo(double base, Double altezza, Double lato, String colore, String id) throws Exception {
        setBase(base);
        setAltezza(altezza);
        setLato(lato);
        setColore(colore);
        setId(id);
    }
   
    public final void setBase(Double base) throws Exception {
        if (base == null) {
            throw new Exception("Il valore dell'altezza deve essere null!");
        }

        if (base > 0) {
            this.base = base;
        } else {
            throw new Exception("Il valore della base deve essere maggiore di 0!");
        }
    }
    

    public final void setAltezza(Double altezza) throws Exception {
        if (altezza == null) {
            throw new Exception("Il valore dell'altezza deve essere null!");
        }

        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            throw new Exception("Il valore dell'altezza deve essere maggiore di 0!");
        }
    }

    public final void setLato(Double lato) throws Exception {
        try {
            if (lato > 0) {
                this.lato = lato;
            } else {
                throw new Exception("Il valore del lato deve essere maggiore di 0!");
            }
        } catch (NullPointerException e) {
            throw new NullPointerException /*Exception*/ ("Il valore del lato non può essere null!");
        } catch (Exception e){
            throw new Exception /*Exception*/ ("Errore generico!");
        }
    }


    public final void setColore(String colore) throws Exception {
        try {
            if (!colore.isEmpty())
                if (colore.length() >= 3)
                    this.colore = colore;
                else
                    throw new Exception("Il colore deve avere almeno 3 caratteri!");
            else 
                throw new Exception("Il colore non può essere una stringa vuota!");                                    
        } catch (NullPointerException e) {
            throw new NullPointerException /*Exception*/ ("Il colore non può essere null!");
        }                 
    }
    
    public void setId(String id) throws Exception{
        String num = "";
        String chara = "";
        try {
            if(!id.isEmpty()){
                num = id.substring(0, 2);
                chara = id.substring(2);
                        
                Integer.parseInt(id)
                this.id = id;
            }else 
                throw new Exception ("Id vuoto");
        } catch (NullPointerException e){
                throw new NullPointerException ("Id Vuoto");
        }
    }

    
    
    
    
    
}
