package pescaOggetti;




/**
 *
 * @author andry
 */
public class Gomma extends Oggetto {

    public Gomma(String caratteristiche) throws Exception{

        super(caratteristiche.equals("rossa") ? -1 : 2, null, "Gomma", caratteristiche);

        controlloCarattteristiche(caratteristiche);
    }

    private void controlloCarattteristiche(String caratteristiche) throws Exception {
        if (!(caratteristiche.equals("rossa") || caratteristiche.equals("morbida") || caratteristiche.equals("dura"))) {
            throw new Exception("la caratteristica non è tra quelle presenti ovvero rossa, morbida e dura");
        }
    }

}

