package amministrazioneCondomini;

import java.util.Arrays;

/**
 *
 * @author andrea.debortoli
 */
public class Amministrazione {
    private String nomeAmministratore;
    private int numCondomini;
    private Condominio[] condomini;

    public Amministrazione(String nomeAmministratore){
        this.nomeAmministratore = nomeAmministratore;
        condomini = new Condominio[10];
        numCondomini = 0;
    }

    public int cercaCondominio(String indirizzo){
        int indice = 0;
        while(indice < numCondomini && indirizzo.equals(condomini[indice].getIndirizzo()))
            indice++;
        return indice;
    }

    public void addCondominio(Condominio c){
        if(numCondomini < condomini.length){
            condomini[numCondomini] = new Condominio(c);
            numCondomini++;
        }
    }

    private void shiftSx(int indice){
        for(int i = indice; i < numCondomini; i++)
            condomini[i - 1] = condomini[i];
    }

    public void remApp(String indirizzo){
        shiftSx(cercaCondominio(indirizzo));
    }

    public String condominioMaxAppartamenti(){  //ritorna i dati del condominio con più appartamenti
        int j = 0;
        for(int i = 1; i < numCondomini; i++){
            if(condomini[j].getNumAppartamenti() < condomini[i].getNumAppartamenti())
                j = i;
        }
        return condomini[j].toString();
    }

    @Override
    public String toString() {
        return "Amministrazione{ " + "\n" +
                "\tnomeAmministratore = " + nomeAmministratore + '\n' +
                "\tnumCondomini = " + numCondomini + "\n" +
                "\tcondomini = " + Arrays.toString(condomini) + "\n" +
                '}';
    }
}
