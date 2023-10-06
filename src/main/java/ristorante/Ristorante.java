package ristorante;

/**
 *
 * @author Andrea
 */
public class Ristorante {
    private int capienza;
    private int nSale;
    private Sala[] sale;
    
    public Ristorante(Sala[] s){
        this.sale = s;
        this.nSale = sale.length;
        capienza = nSale;
    }
    
    private int cercaTavolo(int n){
        int i = 0;
        while(i < nSale && sale[i].getNumeroTavolo() != n)
            i++;
        return i;
    }
    
    private void shiftSx(int indice){
        for(int i = indice; i < nSale; i++)
            sale[i - 1] = sale[i];
    }
    
    public int nPosti(){
        int risposta = 0;
        for(int i = 0; i < nSale; i++)
            risposta += sale[i].getCapienza();
        return risposta;
    }
    
    public int nPersoneSedute(){
        int risposta = 0;
        for(int i = 0; i < nSale; i++)
            risposta += sale[i].getNumeroPersone();
        return risposta;
    }
    
    public boolean siediti(int numTav){
        return sale[cercaTavolo(numTav)].siedi();
    }
    
    public boolean alzati(int numTav){
        return sale[cercaTavolo(numTav)].alzati();
    }
    
    public boolean prenota(int p){
        boolean risposta = false;
        int i = 0;
        while(i < nSale && !sale[i].prenota(p))
            i++;
        if(i < nSale)
            risposta = true;
        return risposta;
    }
    
    public boolean disdici(int n){
        return sale[cercaTavolo(n)].disdici();
    }
    
    public boolean aggiungiTavolo(Tavolo t){
        boolean risposta = false;
        if(nSale < capienza){
            sale[nSale] = new Tavolo(t);
            nSale++;
            risposta = true;
        }
        return risposta;
    }
    
    public void rimuoviTavolo(int n){
        shiftSx(cercaTavolo(n));
    }
    
}
