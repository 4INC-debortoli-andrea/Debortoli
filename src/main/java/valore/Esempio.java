package valore;

/**
 *
 * @author andry
 */

import java.util.*;
// Definizione della classe che implementa Comparable
class Esempio implements Comparable<Esempio> {
    private int valore;

    public Esempio(int valore) {
        this.valore = valore;
    }

    public int getValue() {
        return valore;
    }

    // Sovrascrittura del metodo compareTo per definire l'ordine
    @Override
    public int compareTo(Esempio other) {
        // Ordine crescente in base al valore
        return Integer.compare(this.valore, other.valore);
    }
}
