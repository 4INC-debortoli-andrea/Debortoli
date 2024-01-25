package Lettore;

/**
 *
 * @author andry
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Whatsapp wA = new Whatsapp("Masch ♂");
        EBook eB = new EBook ("Molto leggera ma pesante", "L'insostenibile leggerezza dell'essere", 318);
        PostaElettronica pA = new PostaElettronica ("Salve", "Andrea", "Saluti");
        System.out.println(wA.leggiTesto());
        System.out.println(eB.leggiTesto());
        System.out.println(pA.leggiTesto());
    }
    
}
