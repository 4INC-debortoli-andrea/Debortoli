package test;

/**
 *
 * @author andrea.debortoli
 */

import java.util.Scanner;
public class Impiccato {

    private String parola = "portafoglio";
    private StringBuilder censura;
    private int contatore;
    private boolean giocoFinito;

    public Impiccato() {
        censura = new StringBuilder();
        for (int i = 0; i < parola.length(); i++) {
            censura.append("-");
        }
        contatore = 0;
        giocoFinito = false;
    }

    public void stampaParolaCensurata() {
        System.out.println("Parola: " + censura.toString());
    }

    public void trovaLettera(char lettera) {
        if (!giocoFinito) {
            boolean trovata = false;

            for (int i = 0; i < parola.length(); i++) {
                if (parola.charAt(i) == lettera) {
                    trovata = true;
                    censura.setCharAt(i, lettera);
                }
            }

        if (!trovata) {
            System.out.println("\nLettera non presente.");
            contatore++;

            if (contatore <= 6) {
                switch (contatore) {
                    case 1:
                        System.out.println("______\n|    |\n|    O\n|    \n|    \n|______\n");
                        break;
                    case 2:
                        System.out.println("______\n|    |\n|    O\n|    |\n|    \n|______\n");
                        break;
                    case 3:
                        System.out.println("______\n|    |\n|    O\n|   /|\n|    \n|______\n");
                        break;
                    case 4:
                        System.out.println("______\n|    |\n|    O\n|   /|\\\n|    \n|______\n");
                        break;
                    case 5:
                        System.out.println("______\n|    |\n|    O\n|   /|\\\n|     \\\n|______\n");
                        break;
                    case 6:
                        System.out.println("______\n|    |\n|    O\n|   /|\\\n|   / \\\n|______\n");
                        System.out.println("Hai esaurito tutti i tentativi!");
                        giocoFinito = true;
                        break;
                    default:
                        break;
                }
            }
            } else {
                System.out.println("\nLettera trovata!");
            }

        if (!censura.toString().contains("-")) {
            System.out.println("Complimenti, hai indovinato la parola!");
            giocoFinito = true;
        }
        }
    }


    public boolean getGiocoFinito() {
        return this.giocoFinito;
    }

    public int getContatore() {
        return contatore;
    }

    public String getParola() {
        return parola;
    }

}
