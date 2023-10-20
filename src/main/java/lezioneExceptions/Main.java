package lezioneExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Inserisci il dividendo: ");
            int dividendo = in.nextInt();

            System.out.println("Inserisci il divisore: ");
            int divisore = in.nextInt();

            int divisione = dividendo / divisore;

            System.out.println(divisione);

        } catch (ArithmeticException e) {
            System.err.println("Impossibile dividere per 0");
        }


        /*try {
            int[] vett = {1, 2, 3};

            for (int i = 0; i < 10; i++)
                System.out.println(vett[i]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Oltre la lunghezza del vettore");
        }

         */
    }
}

