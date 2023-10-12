package collage;

/**
 *
 * @author Andrea
 */
public class Main {

    public static void main(String[] args) {
        Immagine[] i = new Immagine[3];
        i[0] = new Immagine(10, 5, true);
        i[1] = new Immagine(3, 9, true);
        i[2] = new Immagine(15, 12, false);

        Collage c = new Collage(i);
        Immagine nuova = new Immagine(3, 8, false);
        System.out.println("La somma delle dimensioni è: " + c.dimensioneTotale());
        System.out.println("Immagini a colori: " + c.contaImmaginiColori());
        System.out.println("Immagini non a colori: " + c.contaImmaginiGrigi());
        System.out.println("L'immagine piu' grande e' l'immagine: " + c.trovaImmaginePiùGrande());
        System.out.println(c.stampa());




    }

}
