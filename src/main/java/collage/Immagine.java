package collage;

/**
 *
 * @author Andrea
 */
public class Immagine {
    private int base;
    private int altezza;
    private boolean colore;

    public Immagine(int base, int altezza, boolean colore) {
        this.base = base;
        this.altezza = altezza;
        this.colore = colore;
    }

    public int getAltezza() {
        return altezza;
    }
    public int getBase() {
        return base;
    }
    public boolean isColore() {
        return colore;
    }
    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public void setColore(boolean colore) {
        this.colore = colore;
    }
    
    public int numeroPixel(){
        return base * altezza;
    }

    public String confrontaDimensioni(Immagine nuova){
        String t = "";
        int dimensione1 = base*altezza;
        int dimensione2 = nuova.getBase() * nuova.getAltezza();
        if(dimensione1 > dimensione2){
            t = "L'immagine è più grande";
        }else if(dimensione1 == dimensione2){
            t = "Le due immagini sono uguali";
        }else{
            t = "L'immagine nuova è più grande";
        }
        return t;
    }

    public String ridimensiona(int nuovaBase, int nuovaAltezza){
        base = nuovaBase;
        altezza = nuovaAltezza;
        return "Immagine ridimensionata";
    }

    public String cambiaColore(boolean nuovoColore){
        colore = nuovoColore;
        return "Colore aggiornato";
    }

    public String stampa(){
        return "Immagine {"
                + "\n\tbase: " + base
                + "\n\taltezza: " + altezza
                + "\n\tcolore: " + colore
                + "\n}";
    } 

}
