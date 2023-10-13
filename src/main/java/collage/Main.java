package collage;

/**
 *
 * @author Andrea
 */
public class Main {

    public static void main(String[] args) {
        Immagine[] imm = new Immagine[3];
        imm[0] = new Immagine(10, 5, true);
        imm[1] = new Immagine(3, 9, true);
        imm[2] = new Immagine(15, 12, false);
        
        
        /*System.out.println("------IMMAGINI------");
        for(int i = 0; i < imm.length; i++)
            System.out.println("\n" + imm[i].stampa());
        */
        
        Collage c = new Collage(imm);
        Immagine nuova = new Immagine(3, 8, false);
        System.out.println(c.stampa());
        System.out.println("La somma delle dimensioni è: " + c.dimensioneTotale());
        System.out.println("Immagini a colori: " + c.contaImmaginiColori());
        System.out.println("Immagini non a colori: " + c.contaImmaginiGrigi());
        System.out.println("L'immagine piu' grande e' l'immagine: " + c.trovaImmaginePiùGrande());
       



    }

}
