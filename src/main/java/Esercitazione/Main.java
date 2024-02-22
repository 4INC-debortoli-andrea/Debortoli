package Esercitazione;

/**
 *
 * @author andry
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        DatoMultimediale[] d = {
            new Audio(5, 10, "A"),
            //new Filmato(2, 7, 4, "B"),
            new Audio(3, 1, "C"),
            new Immagine(8, "D"),
            new Immagine(4, "E")
        };
        /*
        int scelta = 6;
        while (scelta != 0) {
            System.out.println(
                    "---MENU---"
                    + "\n0. esci"
                    + "\n1. Audio --> " + d[0].getTitolo()
                    + "\n2. Filmato --> " + d[1].getTitolo()
                    + "\n3. Audio --> " + d[2].getTitolo()
                    + "\n4. Immagine --> " + d[3].getTitolo()
                    + "\n5. Immagine --> " + d[4].getTitolo());
            System.out.print("Scelta: ");
            scelta = s.nextInt();
            if (scelta <= 5 && scelta >= 1) {
                if (d[scelta - 1] instanceof Immagine) {
                    Immagine i = (Immagine) d[scelta - 1];
                    System.out.println(i.mostra());
                } else if (d[scelta - 1] instanceof Audio) {
                    Audio a = (Audio) d[scelta - 1];
                    System.out.println(a.play());
                } else {
                    Filmato f = (Filmato) d[scelta - 1];
                    System.out.println(f.play());
                }
            } else if(scelta == 0){
                System.out.println("Programma terminato");
            }else{
                System.out.println("Scelta non valida\n");
            }
        }
        */
        
        Immagine i = (Immagine) d[1];
        System.out.println(i.mostra());
    }
}
