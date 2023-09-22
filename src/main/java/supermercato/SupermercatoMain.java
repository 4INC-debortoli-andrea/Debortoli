package supermercato;

/**
 *
 * @author Andrea
 */
public class SupermercatoMain {
    public static void main(String[] args) {

        Prodotto bistecca = new Prodotto(10, 22, 0.4, 0.05, "Bistecca bovina, 400 grammi","8005235116964", "Bistecca bovina");
        Prodotto olio = new Prodotto(16, 22, 0.9, 0.9, "Olio d'oliva del Garda, 1 litro", "8005235155978","Olio Extravergine d'oliva");
        Prodotto sale = new Prodotto(19, 22, 1, 0.05, "Sale marino di Roma, 1 chilogrammo", "8005235116964", "Sale fino marino");

        Prodotto[] prodottiInVendita = {bistecca, olio, sale};

        Supermercato supermercatoPoli = new Supermercato("Poli", "Via Roma, 5", prodottiInVendita);

        supermercatoPoli.addProdotto(1, 22, 0.5, 0.010, "Monster Ultra Paradise, 500 millilitri", "8032089000017", "Monster Ultra Paradise");
        System.out.println(supermercatoPoli);
        System.out.println("Il prodotto con il prezzo più alto è: " + supermercatoPoli.prezzoAlto());
        System.out.println("Il valore totale della merce è: " + supermercatoPoli.valoreMerce());
        System.out.println("Il prodotto più leggero è: " + supermercatoPoli.pesoMinore());
        System.out.println("I prodotti con il valore sopra la media sono: " + supermercatoPoli.merciSopraMedia());
    }
}
