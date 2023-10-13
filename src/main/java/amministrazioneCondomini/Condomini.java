package amministrazioneCondomini;

/**
 *
 * @author andrea.debortoli
 */
public class Condominio {
   
    private String nome;
    private String indirizzo;
    private Appartamento[] appartamenti;
   
    public Condominio(String nome, String indirizzo,Appartamento[] app) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        appartamenti = copia(app);
    }
   
    public Condominio(Condominio c){
        this.nome = c.nome;
        this.indirizzo = c.indirizzo;
        this.appartamenti = copia(c.appartamenti);
    }
   
    public int numeroAppartamenti() {
        return appartamenti.length;
    }
   
    public String nominativoMillesimiMax() {
        return appartamenti[trovaMaxMillesimi()].getNominativoProprietario();
    }
   
   
    private int trovaMaxMillesimi() {
        int pos = 0;
        for (int i = 1; i < appartamenti.length; i++){
            if (appartamenti[pos].getMillesimi() < appartamenti[i].getMillesimi())
                pos = i;
        }
        return pos;
    }
   
   
    private Appartamento[] copia(Appartamento[] app){
        Appartamento[] temp = new Appartamento[app.length];
        for (int i = 0; i < app.length; i++){
            temp[i] = app[i];
        }
        return temp;
    }
   
}
