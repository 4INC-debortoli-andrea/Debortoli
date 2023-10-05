package ristorante;

/**
 *
 * @author Andrea
 */
public class Tavolo {
    private int capienza;
    private int numeroPersone;
    private int numeroTavolo;
    private boolean prenotato;
    
    
    public Tavolo(int capienza, int numeroPersone, int numeroTavolo, boolean prenotato){
        this.capienza = capienza;
        this.numeroPersone = numeroPersone;
        this.numeroTavolo = numeroTavolo;
        this.prenotato = prenotato;
    }
    
    public Tavolo(Tavolo t){
        this.capienza = t.capienza;
        this.numeroPersone = t.numeroPersone;
        this.numeroTavolo = t.numeroTavolo;
        this.prenotato = t.prenotato;
    }

    public int getCapienza() {
        return capienza;
    }
    public int getNumeroPersone() {
        return numeroPersone;
    }
    public int getNumeroTavolo() {
        return numeroTavolo;
    }
    public boolean isPrenotato() {
        return prenotato;
    }
    
    
    public boolean alzati(){
        boolean risposta = false;
        if(numeroPersone > 0){
            numeroPersone--;
            risposta = true;
        }
        return risposta;
    }
    
    public boolean siedi(){
        boolean risposta = false;
        if(numeroPersone < capienza){
            numeroPersone++;
            risposta = true;
        }
        return risposta;
    }
    
    public boolean prenota(int n){
        boolean risposta = false;
        if(prenotato != true && n <= capienza){
            prenotato = true;
            risposta = true;
        }
        return risposta;
    }
    
    public boolean disdici(){
        boolean risposta = false;
        if(prenotato = true){
            prenotato = false;
            risposta = true;
        }    
        return prenotato;
    }
    
    
    @Override
    public String toString() {
        return "Tavolo{" + "\n" +
                "\tcapienza=" + capienza + "\n" +
                "\tnumPers=" + numeroPersone + "\n" +
                "\tnumTav=" + numeroTavolo + "\n" +
                "\tprenotato=" + prenotato + "\n" +
                '}';
    }
    
}
