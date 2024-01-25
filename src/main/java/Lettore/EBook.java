package Lettore;

/**
 *
 * @author andry
 */
public class EBook implements Lettore{
    private String testo;
    private String nomeLibro;
    private int nPagine;

    public EBook(String testo, String nomeLibro, int nPagine) {
        this.testo = testo;
        this.nomeLibro = nomeLibro;
        this.nPagine = nPagine;
    }
    
    @Override
    public String getTesto() {
        return testo;
    }
    
    @Override
    public String leggiTesto(){
        return "Il nome del libro: " + nomeLibro + "\n" +
               "Le pagine totali sono: " + nPagine + "\n" +
               getTesto(); 
    }

    @Override
    public String toString() {
        return "Ebook{" + "nomeLibro=" + nomeLibro + ", totPagine=" + nPagine + "\n"+ testo + '}';
    }
    
    
    
    
}
