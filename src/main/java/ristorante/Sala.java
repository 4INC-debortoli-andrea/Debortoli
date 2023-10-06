package ristorante;

/**
 *
 * @author andrea.debortoli
 */
public class Sala {
    private int capienza;
    private int nTavoli;
    private Tavolo[] tavoli;
    
    public Sala(Tavolo[] t){
        this.tavoli = t;
        this.nTavoli = tavoli.length;
        capienza = nTavoli;
    }
    
    private int cercaTavolo(int n){
        int i = 0;
        while(i < nTavoli && tavoli[i].getNumeroTavolo() != n)
            i++;
        return i;
    }
    
    private void shiftSx(int indice){
        for(int i = indice; i < nTavoli; i++)
            tavoli[i - 1] = tavoli[i];
    }
    
    public int nPosti(){
        int risposta = 0;
        for(int i = 0; i < nTavoli; i++)
            risposta += tavoli[i].getCapienza();
        return risposta;
    }
    
    public int nPersoneSedute(){
        int risposta = 0;
        for(int i = 0; i < nTavoli; i++)
            risposta += tavoli[i].getNumeroPersone();
        return risposta;
    }
    
    public boolean siediti(int numTav){
        return tavoli[cercaTavolo(numTav)].siedi();
    }
    
    public boolean alzati(int numTav){
        return tavoli[cercaTavolo(numTav)].alzati();
    }
    
    public boolean prenota(int p){
        boolean risposta = false;
        int i = 0;
        while(i < nTavoli && !tavoli[i].prenota(p))
            i++;
        if(i < nTavoli)
            risposta = true;
        return risposta;
    }
    
    public boolean disdici(int n){
        return tavoli[cercaTavolo(n)].disdici();
    }
    
    public boolean aggiungiTavolo(Tavolo t){
        boolean risposta = false;
        if(nTavoli < capienza){
            tavoli[nTavoli] = new Tavolo(t);
            nTavoli++;
            risposta = true;
        }
        return risposta;
    }
    
    public void rimuoviTavolo(int n){
        shiftSx(cercaTavolo(n));
    }
}

