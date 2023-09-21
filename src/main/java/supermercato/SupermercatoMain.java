package supermercato;

/**
 *
 * @author Andrea
 */
public class SupermercatoMain {
    public static void main(String[] args) {

        String codiceABarreBistecca = "8005235116964";
        String codiceABarreOlio = "8005235155978";
        String codiceABarreSale = "8005235116964";


        Prodotto bistecca = new Prodotto(10, 22, 0.4, 0.05, codiceABarreBistecca, "Bistecca bovina");
        Prodotto olio = new Prodotto(16, 22, 0.9, 0.9, codiceABarreOlio,"Olio Extravergine d'oliva");
        Prodotto sale = new Prodotto(19, 22, 1, 0.05, codiceABarreSale, "Sale fino marino");

        Prodotto[] prodottiInVendita = {bistecca, olio, sale};

        Supermercato supermercatoPoli = new Supermercato("Poli", "Via Roma, 5", prodottiInVendita);

        System.out.println(supermercatoPoli);
        System.out.println("Il prodotto con il prezzo più alto è: " + supermercatoPoli.prezzoAlto());
        System.out.println("Il valore totale della merce è: " + supermercatoPoli.valoreMerce());
        System.out.println("Il prodotto più leggero è: " + supermercatoPoli.pesoMinore());
        System.out.println("I prodotti con il valore sopra la media sono: " + supermercatoPoli.merciSopraMedia());
    }
}
