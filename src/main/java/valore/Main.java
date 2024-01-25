package valore;

/**
 *
 * @author andry
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creazione di oggetti MyClass
        Esempio obj1 = new Esempio(10);
        Esempio obj2 = new Esempio(5);
        Esempio obj3 = new Esempio(15);

        // Creazione di una lista e aggiunta degli oggetti
        List<Esempio> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        // Stampa degli oggetti prima dell'ordinamento
        System.out.println("Prima dell'ordinamento:");
        for (Esempio obj : list) {
            System.out.println(obj.getValue());
        }

        // Ordinamento della lista
        Collections.sort(list);

        // Stampa degli oggetti dopo l'ordinamento
        System.out.println("\nDopo l'ordinamento:");
        for (Esempio obj : list) {
            System.out.println(obj.getValue());
        }
    }
    
}
