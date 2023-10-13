package collage;

/**
 *
 * @author Andrea
 */
public class Collage {
    private Immagine[] immagini;
    private int dimL;

    
    public Collage(Immagine[] im) {
        this.dimL = im.length;
        immagini = im;
    }
    
    private void shiftSx(int indice){
        Immagine[] temp = new Immagine[dimL - 1];
        for(int i = indice; i < dimL; i++)
            immagini[i - 1] = immagini[i];
        dimL--;
        immagini = temp;
    }
    
    public void aggiungiImmangine(Immagine nuova){
        Immagine[] temp = new Immagine[dimL + 1];
        for (int i = 0; i < dimL; i++) {
            temp[i] = immagini[i];
        }
        temp[dimL] = nuova;
        dimL++;
        immagini = temp;
    }
    
    public String rimuoviImmagine(int posIm){
        shiftSx(posIm);
        return "Immagine aggiunta";
    }
    
    public int dimensioneTotale(){
        int somma = 0;
        for (int i = 0; i < dimL; i++) {
            somma += immagini[i].numeroPixel();
        }
        return somma;
    }
    
    public int contaImmaginiColori(){
        int n = 0;
        for (int i = 0; i < dimL; i++) {
            if(immagini[i].isColore() == true){
                n++;
            }
        }
        return n;
    }

    public int contaImmaginiGrigi(){
        return dimL - contaImmaginiColori();
    }
    
    public Immagine trovaImmaginePiùGrande(){
        int pos = 0;
        int max = immagini[0].numeroPixel();
        for (int i = 1; i < dimL; i++) {
            if(immagini[i].numeroPixel() > max){
                pos = i;
                max = immagini[i].numeroPixel();
            }
        }
        return immagini[pos];
    }
    
    public String stampa(){
        String t = "\n------IMMAGINI------\n";
        for (int i = 0; i < dimL; i++) 
            t += "\n" + immagini[i].stampa();
        
        return t;
    }
}
