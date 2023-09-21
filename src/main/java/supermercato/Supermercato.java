package supermercato;

/**
 *
 * @author Andrea
 */
import java.util.Arrays;

public class Supermercato {
    private String nome;
    private String indirizzo;
    /**
     * prodotti è un'array della classe Prodotto
     */
    private Prodotto[] prodotti;

    public Supermercato(String nome, String indirizzo, Prodotto[] prodotti) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.prodotti = prodotti;
    }

    /**
     * restituisce il nome del prodotto che hai il prezzo ivato più alto
     * @return
     */
    public String prezzoAlto() {
        String prodottoPiuCostoso = prodotti[0].getDescrizione();
        double prezzoAlto = prodotti[0].prezzoIvato();

        for (Prodotto p: prodotti) {
            if (prezzoAlto < p.prezzoIvato()) {
                prezzoAlto = p.prezzoIvato();
                prodottoPiuCostoso = p.getDescrizione();
            }
        }

        return prodottoPiuCostoso;
    }

    /**
     * restituisce l’importo totale di tutti i prodotti al netto dell’Iva
     * @return
     */
    public double valoreMerce() {
        double importoTotale = 0;

        for (Prodotto p: prodotti)
            importoTotale += p.getPrezzo();

        return importoTotale;
    }

    public String pesoMinore() {
        String descrizioneProdottoPiuLeggero = prodotti[0].getDescrizione();
        double pesoProdottoPiuLeggero = prodotti[0].getPeso();

        for (Prodotto p: prodotti)
            if (pesoProdottoPiuLeggero > p.getPeso()) {
                pesoProdottoPiuLeggero = p.getPeso();
                descrizioneProdottoPiuLeggero = p.getDescrizione();
            }

        return descrizioneProdottoPiuLeggero;
    }

    public String merciSopraMedia() {
        double sommaValori = 0;
        double valoreMedio = 0;
        String prodottiSopraLaMedia = "";

        for (Prodotto p: prodotti)
            sommaValori += p.getPrezzo();

        valoreMedio = sommaValori / prodotti.length;

        for (int i = 1; i < prodotti.length; i++) {
            if (valoreMedio < prodotti[i].prezzoIvato())
                prodottiSopraLaMedia += prodotti[i].getDescrizione();
            if (i != prodotti.length - 1)
                prodottiSopraLaMedia += ", ";
        }

        return prodottiSopraLaMedia;
    }
    
    public void addProd(Prodotto pAdd){
        if(diml == this.prodotti.length)
            prodotti = copia(prodotti, prodotti.length + 10);

        prodotti[diml] = pAdd;
        diml++;
    }

    public void addProd(double prezzo, double iva, double peso, double tara, String descrizione, String codiceBarre){
        Prodotto p = new Prodotto(prezzo, iva, peso, tara, descrizione, codiceBarre);
        addProd(p);
    }

    @Override
    public String toString() {
        return "Supermercato{" + "\n" +
                "\tnome: \"" + nome + '\"' + "\n" +
                "\tindirizzo: \"" + indirizzo + '\"' + "\n" +
                "\tprodotti = " + Arrays.toString(prodotti) + "\n" +
                '}';
    }
}
