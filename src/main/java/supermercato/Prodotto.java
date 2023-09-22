package supermercato;

/**
 *
 * @author Andrea
 */
public class Prodotto {
    /**
     * prezzo indica il prezzo lordo del prodotto in Euro
     */
    private double prezzo;
    /**
     * iva indica l'iva del prodotto in percentuale
     */
    private double iva;
    /**
     * peso indica il peso netto in Chilogrammi del prodotto
     */
    private double pesoInChili;
    /**
     * tara indica il peso del contenitore del prodotto in Chilogrammi
     */
    private double taraInChili;
    /**
     * descrizione indica una breve descrizione del prodotto
     */
    private String descrizione;
    /**
     * codiceABarre indica il codice a barre del prodotto
     */
    private String codiceABarre;
    
    private String nomeProdotto;

    public Prodotto(double prezzo, double iva, double pesoInChili, double taraInChili, String descrizione, String codiceABarre, String nomeProdotto) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.pesoInChili = pesoInChili;
        this.taraInChili = taraInChili;
        this.descrizione = descrizione;
        this.codiceABarre = codiceABarre;
        this.nomeProdotto = nomeProdotto;
    }
    
    public Prodotto(Prodotto p){
        this.prezzo = p.prezzo;
        this.iva = p.iva;
        this.pesoInChili = p.pesoInChili;
        this.taraInChili = p.taraInChili;
        this.descrizione = p.descrizione;
        this.codiceABarre = p.codiceABarre;
        this.nomeProdotto = p.nomeProdotto;
    }

    public double getPrezzo() {
        return prezzo;
    }
    public double getIva() {
        return iva;
    }
    public double getPeso() {
        return pesoInChili;
    }
    public double getTara() {
        return taraInChili;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public String getCodiceABarre() {
        return codiceABarre;
    }
    public String getNomeProdotto(){
       return nomeProdotto;
    }

    public double prezzoIvato() {
        return prezzo += (iva / 100) * prezzo;
    }

    public double pesoLordo() {
        return pesoInChili + taraInChili;
    }

    // codiceDiControllo è il parametro formale
    public String controlloCodice() {
        String trueFalse = "";
        int somma1 = 0;
        int somma2 = 0;

        for (int i = 0; i < 12; i += 2) {
            int cifra = Character.getNumericValue(codiceABarre.charAt(i));
            somma2 += cifra * 3;
        }

        for (int i = 1; i < 12; i += 2) {
            int cifra = Character.getNumericValue(codiceABarre.charAt(i));
            somma1 += cifra;
        }

        int resto = (somma1 + somma2) % 10;
        int cifraControllo = Character.getNumericValue(codiceABarre.charAt(12));
        if (resto == cifraControllo) {
            trueFalse = "codice approvato";
        } else {
            trueFalse = "codice errato";
        }
        return trueFalse + "\n" + resto;
    }

    @Override
    public String toString() {
        return "Prodotto {" + "\n" +
                "\tprezzo = " + prezzo + "\n" +
                "\tiva = " + iva + "\n" +
                "\tpeso = " + pesoInChili + "\n" +
                "\ttara = " + taraInChili + "\n" +
                "\tdescrizione = \"" + descrizione + '\"' + "\n" +
                "\tcodiceABarre = " + codiceABarre + "\n" +
                '}';


    }
}
