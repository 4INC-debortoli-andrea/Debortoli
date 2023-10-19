package amministrazioneCondomini;

import java.util.Arrays;

/**
 *
 * @author andrea.debortoli
 */
public class Condominio {
    private String nome;
    private String indirizzo;
    private int numAppartamenti;
    private Appartamento[] appartamenti;

    public Condominio(String nome, String indirizzo, int numAppartamenti,Appartamento[] app) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numAppartamenti = numAppartamenti;
        appartamenti = copia(app);
    }
   
    public Condominio(Condominio c){
        this.nome = c.nome;
        this.indirizzo = c.indirizzo;
        this.numAppartamenti = c.numAppartamenti;
        this.appartamenti = copia(c.appartamenti);
    }
    private Appartamento[] copia(Appartamento[] app){
        Appartamento[] temp = new Appartamento[app.length];
        for (int i = 0; i < app.length; i++)
            temp[i] = app[i];
        return temp;
    }

    public String getNome() {
        return nome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public Appartamento[] getAppartamenti() {
        return appartamenti;
    }
    public int getNumAppartamenti() {
        return numAppartamenti;
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

    @Override
    public String toString() {
        return "Condominio{ " + "\n" +
                "\tnome = " + nome + '\n' +
                "\tindirizzo = " + indirizzo + '\n' +
                "\tnumAppartamenti = " + numAppartamenti + "\n" +
                "\tappartamenti = " + Arrays.toString(appartamenti) + "\n" +
                '}';
    }
}
