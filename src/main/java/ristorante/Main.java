package ristorante;

/**
 *
 * @author Andrea
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] capienza = {6,7,4,8,5,9};
        int[] numPers = {2,4,0,5,1,0};
        int[] numTav = {1,2,3,4,5,6};
        boolean[] prenotato = {true, false, false, false, true, true};
        Tavolo[] t = new Tavolo[capienza.length];
        
        for(int i = 0; i < t.length; i++)
            t[i] = new Tavolo(capienza[i], numPers[i], numTav[i], prenotato[i]);
        
        Ristorante r = new Ristorante(t);
        
        System.out.println("Siediti: " + r.siediti(3));
        System.out.println("Alzati: " + r.alzati(2));
        System.out.println("Posti totali: " + r.nPosti());
        System.out.println("Persone sedute totali: " + r.nPersoneSedute());
        System.out.println("Prenota: " + r.prenota(9));
        System.out.println("Disdici: " + r.disdici(4));
        
        Tavolo t1 = new Tavolo(1,1,7,true);
        r.addTav(t1);
        r.remTav(3);
    }
    
}
