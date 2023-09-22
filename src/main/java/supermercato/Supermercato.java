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
    private int diml;

    public Supermercato(String nome, String indirizzo, Prodotto[] prodotti) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.prodotti = prodotti;
        diml = 0;
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
    /*
    public void addProdotto(double prezzo, double iva, double pesoInChili, double taraInChili, String descrizione, String codiceABarre, String nomeProdotto) {
        Prodotto[] nuovoArray = new Prodotto[this.prodotti.length + 1];
        for (int i = 0; i < this.prodotti.length; i++) {
            nuovoArray[i] = this.prodotti[i];
        }
        nuovoArray[this.prodotti.length] = new Prodotto(prezzo, iva, pesoInChili, taraInChili, descrizione, codiceABarre, nomeProdotto);
        this.prodotti = nuovoArray;
    }
    */
    public void addProd(Prodotto pAdd){
        if(diml >= this.prodotti.length)
            prodotti = resize((prodotti.length))
    }

    public String stampaArray() {
        String txt = "";
        for (int i = 0; i < this.prodotti.length; i++) {
            txt += this.prodotti[i].getNomeProdotto() + "\n";
        }
        return txt;
    }


    @Override
    public String toString() {
        String t = "Supermercato{" + "\n" +
                "\tnome: \"" + nome + '\"' + "\n" +
                "\tindirizzo: \"" + indirizzo + '\"' + "\n" +
                "\tprodotti = " + "\n";
        for (int i = 0; i < prodotti.length; i++) {
            t +="Prodotto {" + "\n" +
                "\tprezzo = " + prodotti[i].getPrezzo() + "\n" +
                "\tiva = " + prodotti[i].getIva() + "\n" +
                "\tpeso = " + prodotti[i].getPeso() + "\n" +
                "\ttara = " + prodotti[i].getTara() + "\n" +
                "\tdescrizione = \"" + prodotti[i].getDescrizione() + '\"' + "\n" +
                "\tcodiceABarre = " + prodotti[i].getCodiceABarre() + "\n" +
                "}\n";
        }
        return t;
    }
}
