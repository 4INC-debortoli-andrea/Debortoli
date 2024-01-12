package pescaOggetti;

/**
 *
 * @author andry
 */
public class Penna extends Oggetto{

    public Penna(String caratteristiche) throws Exception{
        super(caratteristiche.equals("stilografica") ? 5 : 4, null, "Penna", caratteristiche);
    }
    
    private void controlloCarattteristiche(String caratteristiche) throws Exception{
       if (!(caratteristiche.equals("stilografica") || caratteristiche.equals("sferografica") || caratteristiche.equals("biro"))) {
            throw new Exception("la caratteristica non è tra quelle presenti ovvero stilografica, sferografica e biro");
        }   
    }
    
}