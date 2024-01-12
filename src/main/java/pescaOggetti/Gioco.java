
package pescaOggetti;


import java.util.Scanner;
/**
 *
 * @author andry
 */
public class Gioco {

    private Tabellone tabellone;
    private Giocatore[] giocatori;

    public Gioco(Tabellone tabellone) throws  Exception{
        this.tabellone = tabellone;
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserire numero di giocatori : ");
        int numGiocatori = scanner.nextInt();
        scanner.nextLine();
        this.giocatori = new Giocatore[numGiocatori];

        int numero = 1;

        for (int i = 0; i < this.giocatori.length; i++) {
            System.out.print("inserire il nome giocatore " + numero + " : ");
            String nome = scanner.nextLine();
            this.giocatori[i] = new Giocatore();
            this.giocatori[i].setNome(nome);
            numero++;
        }
    }

    public void sceltaGiocatore() {
        Scanner scanner = new Scanner(System.in);
        boolean cellaTrovata = false;
        int i = 0;

        while (this.tabellone.ciSonoOggetti() == true) {

            System.out.println("\nTurno di " + this.giocatori[i].getNome());

            cellaTrovata = false;
            while (!cellaTrovata) {

                System.out.println(this.tabellone.toString());
                System.out.print("\nInserire la cella che si vuole selezionare: ");
                int cella = scanner.nextInt();

                if (this.tabellone.èUsata(cella) == false) {
                    this.tabellone.sceltaCella(cella);
                    this.tabellone.Utilizza(cella);
                    cellaTrovata = true;

                } else {
                    if (this.tabellone.èUsata(cella) == true) {
                        System.out.println("\nCella non trovata o occupata, reinserisci\n");
                    }
                }

            }
            i++;
            if (i == this.giocatori.length) {
                i = 0;
            }
        }
    }
}