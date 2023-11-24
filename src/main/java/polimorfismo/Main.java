package polimorfismo;

/**
 *
 * @author andrea.debortoli
 */
public class Main {

    public static void main(String[] args) {
        
        /*
        Padre p = new Padre(pp);
        
        System.out.println("Padre prima di incrementa: \n" + p.toString());       
        p.incrementa();
        System.out.println("\nPadre dopo incrementa: \n" + p.toString());
        
        Figlio f = new Figlio(pp);
        
        System.out.println("\nFiglio prima di incrementa: \n" + f.toString());
        p.incrementa();
        System.out.println("\nFiglio dopo incrementa: \n" + f.toString());
        System.out.println("\nPadre dopo incrementa sia di Padre che di figlio: \n" + p.toString());
        */
        
        Padre p = new Padre();
        Figlio f = new Figlio();
        Padre pf = new Figlio();
        Padre pp = pf;
        
        
        p.incrementa();
        System.out.println("p: " + p.toString());
        System.out.println("pp: " + pp.toString());
        
        pp.incrementa();
        System.out.println("p: " + p.toString());
        System.out.println("pp: " + pp.toString());
        
        f.incrementa();
        System.out.println("f: " + f.toString());
        
        pf.incrementa();
        System.out.println("pf: " + pf.toString());
    }
    
}
