package parentesi;

/**
 *
 * @author andry
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String testoVero = "({[]})";
        String testoFalso = "([]})";
        
        
        System.out.println(Parentesi.parentesiBilanciate(testoVero));
        System.out.println(Parentesi.parentesiBilanciate(testoFalso));
    }
    
}
