package pescaOggetti;

/**
 *
 * @author andry
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            System.out.println("--BENVENUTI AL GIOCO DELLA PESCA DEGLI OGGETTI!--");

            Oggetto[] oggetti = {
                new Forbici("punta normale"),
                new Forbici("arrotondata"),
                new Gomma("rossa"),
                new Gomma("morbida"),
                new Gomma("dura"),
                new Matita(),
                new Matita(),
                new Matita(),
                new Penna("stilografica"),
                new Penna("sferografica"),
                new Penna("biro")
            };

            Tabellone tabellone = new Tabellone(oggetti);
            Gioco gioco = new Gioco(tabellone);
            

            gioco.sceltaGiocatore();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}