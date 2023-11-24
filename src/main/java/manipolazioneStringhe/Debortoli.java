package manipolazioneStringhe;

/**
 *
 * @author andry
 */

import java.util.Scanner;
public class Debortoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);  
        System.out.println("---------INSERISCI LA STRINGA---------");

        String testo = scanner.nextLine();  
        System.out.println("La tua stringa e':  " + testo);
        
        

        // Metodo length(): restituisce la lunghezza della stringa
        int lunghezza = testo.length();
        System.out.println("Lunghezza della stringa: " + lunghezza);

        // Metodo charAt(): restituisce il carattere all'indice specificato
        char carattere = testo.charAt(3);
        System.out.println("Carattere alla posizione 3: " + carattere);

        // Metodo substring(): restituisce una sottostringa a partire dall'indice specificato
        String sottostringa = testo.substring(4, 6);
        System.out.println("Sottostringa dall'indice iniziale all'indice finale: " + sottostringa);

        // Metodo toLowerCase() e toUpperCase(): converte la stringa in minuscolo o maiuscolo
        String minuscolo = testo.toLowerCase();
        String maiuscolo = testo.toUpperCase();
        System.out.println("Stringa in minuscolo: " + minuscolo);
        System.out.println("Stringa in maiuscolo: " + maiuscolo);

        // Metodo indexOf() e lastIndexOf(): restituisce l'indice della prima e dell'ultima occorrenza di un carattere o una stringa
        int indicePrimaApparizione = testo.indexOf('a');
        int indiceUltimaApparizione = testo.lastIndexOf('f');
        System.out.println("Indice della prima apparizione nella stringa del carattere inserito: " + indicePrimaApparizione);
        System.out.println("Indice dell'ultima apparizione nella stringa del carattere inserito: " + indiceUltimaApparizione);

        // Metodo replace(): sostituisce una sottostringa con un'altra
        String sostituito = testo.replace(" ", "spazio");
        System.out.println("Sostituzione della stringa/carattere inserita/o: " + sostituito);

        // Metodo contains(): verifica se la stringa contiene una determinata sottostringa
        boolean contiene = testo.contains("Marco");
        System.out.println("La stringa contiene la parola/carattere inserita/o: " + contiene);

        // Metodo compareTo() e equals(): confronto tra stringhe
        String altraStringa = "Marco afferra la penna";
        int confronto = testo.compareTo(altraStringa);
        boolean uguale = testo.equals(altraStringa);
        System.out.println("Confronto tra stringhe: " + confronto);
        System.out.println("Le stringhe sono uguali? " + uguale);

        // Metodo indexOf() e lastIndexOf() con posizioni aggiuntive
        int indiceDa = testo.indexOf('a', 5);
        int indiceA = testo.lastIndexOf('e', 10);
        System.out.println("Indice della lettera inserita a partire dalla posizione inserita: " + indiceDa);
        System.out.println("Ultimo indice della lettera inserita entro la posizione inserita: " + indiceA);

        // Metodo substring() con un solo indice
        String dopoPosizione = testo.substring(10);
        System.out.println("Sottostringa dalla posizione inserita fino alla fine: " + dopoPosizione);

        // Metodo replaceAll() e replaceFirst()
        String sostituzioneTutte = testo.replaceAll("penna", "SOSTITUZIONETUTTE");
        String sostituzionePrima = testo.replaceFirst("a", "SOSTITUZIONEPRIMA");
        System.out.println("Sostituzione del carattere/stringa inserito/a: " + sostituzioneTutte);
        System.out.println("Sostituzione del/della primo/a carattere/stringa inserito/a: " + sostituzionePrima);

        // Metodo toCharArray()
        char[] caratteri = testo.toCharArray();
        System.out.println("La stringa in un array di caratteri: " + java.util.Arrays.toString(caratteri));

        // Metodo startsWith()  con offset
        boolean iniziaConOffset = testo.startsWith("di", 9);
        System.out.println("La stringa inizia con 'di' a partire dalla posizione 9: " + iniziaConOffset);

        // Metodo matches()
        boolean corrisponde = testo.matches(".*manipolazione.*");
        System.out.println("La stringa corrisponde all'espressione regolare '.*manipolazione.*': " + corrisponde);

        // Metodo trim(): rimuove gli spazi bianchi iniziali e finali
        String senzaSpazi = testo.trim();
        System.out.println("Stringa senza spazi bianchi: \"" + senzaSpazi + "\"");

        // Metodo startsWith() e endsWith(): verifica se la stringa inizia o finisce con una determinata sottostringa
        boolean iniziaCon = testo.startsWith("Esempio");
        boolean finisceCon = testo.endsWith("stringhe");
        System.out.println("La stringa inizia con 'Esempio': " + iniziaCon);
        System.out.println("La stringa finisce con 'stringhe': " + finisceCon);

        // Metodo isEmpty(): verifica se la stringa è vuota
        boolean vuota = testo.isEmpty();
        System.out.println("La stringa è vuota? " + vuota);

        // Metodo concat(): concatena una stringa con un'altra
        String nuovaStringa = testo.concat(" Stringa concatenata");
        System.out.println("Nuova stringa concatenata: \"" + nuovaStringa + "\"");
        
        // Metodo split(): divide la stringa in sottostringhe basate su uno spazio
        String[] parole = testo.split(" ");
        System.out.println("Numero di parole nella stringa: " + parole.length);


        
    }
}