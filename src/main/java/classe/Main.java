package classe;

/**
 *
 * @author andrea.debortoli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Studente test = null;
        Studente test1 = null;
        Studente test2 = null;
        Studente test3 = null;
        try{
            test = new Studente("Andrea", "Debortoli");
            test1 = new Studente("Giovanni", "Stamer");
            test2 = new Studente("Diego", "Girardi");
            test3 = new Studente("Gael", "Buscè");
            
            Studente[] st = {test, test1, test2, test3};
            Classe cl = new Classe (test1, st);
            System.out.println(cl);
            System.out.println(cl.controllaOmonimia(test));
            System.out.println(cl.hashCode(0) == test.hashCode());
            System.out.println(test.hashCode());
            System.out.println(test1.hashCode());
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
}


