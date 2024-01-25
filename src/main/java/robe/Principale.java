package robe;

public class Principale {
    public static void main(String[] args) {
        Cane mioCane = new Cane();
        mioCane.emettiSuono();  // Chiama il metodo della classe Animale
        mioCane.abbaia();       // Chiama il metodo della classe Cane

        // Upcasting
        Animale animale = mioCane;  // L'upcasting è implicito
        animale.emettiSuono();      // Chiama il metodo della classe Animale
        // animale.abbaia();         // Errore: La classe Animale non ha un metodo 'abbaia'
    }
}