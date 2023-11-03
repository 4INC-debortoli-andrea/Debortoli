package classe;

/**
 *
 * @author andrea.debortoli
 */
public class Main {

    public static void main(String[] args) {

        try {
            Studente capoClasse = new Studente("Giacomo Antonio", "Calò");
            Studente s1 = new Studente("Riccardo", "Devescovi");
            Studente s2 = new Studente("Luca", "Giacomoni");
            Studente[] s = {s1, s2};
            Classe c = new Classe(capoClasse, s);
            System.out.println(c.toString());
            System.out.println();
        } catch (Exception e) {
            System.err.println(e);
        }
    }    
}

