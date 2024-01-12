package pescaOggetti;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author andry
 */
public class Tabellone {

    private Cella[][] tabellone;

    public Tabellone(Oggetto[] oggetti) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserire numero di righe : ");
        int righe = scanner.nextInt();
        System.out.print("inserire numero di colonne : ");
        int colonne = scanner.nextInt();
        this.tabellone = new Cella[righe][colonne];

        // Inizializza ogni cella nell'array
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                this.tabellone[i][j] = new Cella(null, null);
            }
        }

        caricaOggetti(oggetti);

        calcoloCelle();
    }

    public boolean ciSonoOggetti() {
        
        boolean presenza = true;
        int c = 0;
        
        for (int i = 0; i < this.tabellone.length; i++) {
            for (int j = 0; j < this.tabellone[i].length; j++) {
                if(this.tabellone[i][j].getSelezionata() == false){
                    c++;
                }
            }
        }
        
        if(c == 0){
            presenza = false;
        }
        
        return presenza;
    }

    public boolean sceltaCella(int numero) {
        if (numero > calcoloCelle()) {
            return false;
        }

        boolean trovato = false;
        int i = 0, j = 0;

        while (!trovato && i < this.tabellone.length) {
            j = 0;
            while (!trovato && j < this.tabellone[i].length) {
                if (this.tabellone[i][j].getNumeroCella() == numero) {
                    this.tabellone[i][j].setSelezionata(true);
                    trovato = true;
                    if (this.tabellone[i][j].getOggettoCella() == null) {
                        System.out.println("\nNon hai pescato nulla!");
                    } else {

                        salvaOggetto(this.tabellone[i][j].getOggettoCella(), i, j);

                    }
                } else {
                    j++;
                }
            }
            if (!trovato) {
                i++;
            }
        }

        return trovato;
    }

    public Oggetto salvaOggetto(Oggetto oggetto, int i, int j) {
        System.out.println("\nHai pescato l'oggetto " + this.tabellone[i][j].nomeOggetto());
        return oggetto;
    }

    private int calcoloCelle() {

        int contatore = 1;

        for (int i = 0; i < this.tabellone.length; i++) {
            for (int j = 0; j < this.tabellone[i].length; j++) {
                this.tabellone[i][j].setNumeroCella(contatore);

                contatore++;
            }
        }

        return contatore;
    }

    //ciclo for-each, davvero utile
   private void caricaOggetti(Oggetto[] oggetti) {
    int d = 0;
    Random rand = new Random();

    for (Oggetto oggetto : oggetti) {
        int x, y;
        do {
            x = rand.nextInt(tabellone.length);
            y = rand.nextInt(tabellone[x].length);
        } while (tabellone[x][y].getOccupata());

        tabellone[x][y].setOggettoCella(oggetto);
        tabellone[x][y].setOccupata(true);
        d++;
    }
}


    public boolean èUsata(int numero) {

        boolean usata = false;

        for (int i = 0; i < this.tabellone.length; i++) {
            for (int j = 0; j < this.tabellone[i].length; j++) {
                if (this.tabellone[i][j].getNumeroCella().equals(numero) && this.tabellone[i][j].getSelezionata()) {
                    usata = true;
                }
            }
        }
        return usata;
    }

    public void Utilizza(int numero) {
        for (int i = 0; i < this.tabellone.length; i++) {
            for (int j = 0; j < this.tabellone[i].length; j++) {
                if (this.tabellone[i][j].getNumeroCella().equals(numero) && this.tabellone[i][j].getOccupata()) {
                    this.tabellone[i][j].setSelezionata(true);
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder txt = new StringBuilder();

        // Stampa la riga superiore del tabellone
        for (int i = 0; i < this.tabellone[0].length; i++) {
            txt.append("+-----");
        }
        txt.append("+\n");

        for (int i = 0; i < this.tabellone.length; i++) {
            for (int j = 0; j < this.tabellone[i].length; j++) {
                // Se la cella è selezionata, stampa una "X"
                if (this.tabellone[i][j].getSelezionata()) {
                    txt.append("|  X  ");
                } else {
                    // Altrimenti, stampa il numero della cella
                    txt.append("| ").append(String.format("%3d", this.tabellone[i][j].getNumeroCella())).append(" ");
                }
            }
            // Stampa la riga finale di ogni riga del tabellone
            txt.append("|\n");

            // Stampa la riga divisoria tra le righe del tabellone
            for (int j = 0; j < this.tabellone[i].length; j++) {
                txt.append("+-----");
            }
            txt.append("+\n");
        }

        return txt.toString();
    }

}
