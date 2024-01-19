package persona;

/**
 *
 * @author andry
 */

import java.util.ArrayList;
import java.util.Comparator; 
import data.Data;
enum TipoOrdinamento{
    CRESCENTE,
    DECRESCENTE
}

public class Studente extends Persona {

    private final String SCUOLA = "I.T.T. Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private ArrayList<Float> voti;

    public Studente() {
        super();
        classe = null;
        isRipetente = null;
        voti = null;
    }

    public Studente(Integer classe, Boolean isRipetente, String cognome, String nome, Data dataDiNascita) throws Exception {
        super(cognome, nome, dataDiNascita);
        try {
            setClasse(classe);
            setIsRipetente(isRipetente);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        this.voti = new ArrayList<Float>();
    }

    
    public final void setClasse(Integer classe) throws Exception {
        if (classe == null) {
            throw new Exception("Il parametro non può essere null");
        } else if (classe < 1 || classe > 5) {
            throw new Exception("La classe deve essere compresa tra 1 e 5");
        } else {
            this.classe = classe;
        }
    }
    
    public final void setIsRipetente(Boolean isRipetente) throws Exception {
        if (classe == null) {
            throw new Exception("Il parametro non può essere null");
        } else {
            this.isRipetente = isRipetente;
        }
    }
    
    public final void setVoti(Float[] voti) throws Exception {
        if (voti == null) 
        throw new Exception("Il parametro inserito non può essere null");
        else {
            for (int i = 0; i < voti.length; i++) {
                aggiungiVoto(voti[i]);                
            }
        }
    }
    
    public final String getSCUOLA() {
        return SCUOLA;
    }
    
    public final Boolean getIsRipetente() {
        return isRipetente;
    }
    
    public final Integer getClasse() {
        return classe;
    }
    
    public void aggiungiVoto(Float voto) throws Exception {
        if (voto == null) {
            throw new Exception("Il voto deve essere compreso tra 0 e 10 e non può essere null");
        }
        if (voto.floatValue() < 3 || voto.floatValue() > 10) {
            throw new Exception("Il voto deve essere compreso tra 0 e 10");
        }
        if (voti == null) {
            throw new Exception("L'array non può essere null");
        } else {  
            voti.add(voto);
        }
    }

    public Boolean verificaOmonimia(Studente studente) throws Exception {
        if (studente == null) {
            throw new Exception("Il parametro non può essere null");
        } else if (this.classe == null || studente.classe == null) {
            throw new Exception("Uno o più dati sono nulli");
        } else {
            Boolean risultato = false;
            if (this.classe.equals(studente.classe)) {
                try {
                    risultato = super.verificaOmonimia(studente);
                } catch (Exception e) {
                    throw new Exception(e.getMessage());
                }
            }
            return risultato;
        }

    }
    
    public void rimuoviUltimoVoto()throws Exception {
        if(voti == null){
            throw new Exception("Non può essere null");
        } else {
            if(voti.size() == 0){
                throw new Exception("Non puoi rimuovere più voti");
            } else{
                voti.removeLast();
            }
        } 
    }

    public void rimuoviVoto(Integer posizione) throws Exception {
        if(voti == null){ 
            throw new Exception("Non può essere null");
        }
        if (posizione >= voti.size() || posizione < 0) {
            throw new Exception("La posizione supera i limiti dell'array");
        }
        voti.remove(posizione.intValue());
    }

    public void rimuoviVoto(Float voto) throws Exception {
        if(voti == null){ 
            throw new Exception("Non può essere null");
        }
        if(voto == null){ 
            throw new Exception("Non può essere null");
        }
        if (voto.floatValue() < 3 || voto.floatValue() > 10) {
            throw new Exception("Non esistono voti con tale valore");
        } 
        voti.remove(voto);
    }

    public Float mediaVoti() throws Exception{
        if(voti == null){
            throw new Exception("Non può essere null");
        }
        if(voti.size() == 0){
            throw new Exception("La media di 0 voti non può essere decisa");
        }

        Float media = 0.0f;

        for(int i = 0; i < voti.size(); i++){
            media += voti.get(i).floatValue();
        }

        return media / voti.size();
    }

    private ArrayList<Float> ordinamento(TipoOrdinamento t) throws Exception {
        ArrayList<Float> temp = new ArrayList<Float>();
        if(voti instanceof ArrayList<?>){
            temp = (ArrayList<Float>) voti.clone();
        }
        if(t == TipoOrdinamento.CRESCENTE){
            temp.sort(Comparator.naturalOrder());
        } else if(t == TipoOrdinamento.DECRESCENTE){
            temp.sort(Comparator.reverseOrder());
        } else {
            throw new Exception("Invalid TipoOrdinamento");
        }
        return temp;
    }

    public Float votoMinore() throws Exception {
        return ordinamento(TipoOrdinamento.CRESCENTE).getFirst().floatValue();
    }

    public Float votoMaggiore() throws Exception {
        return ordinamento(TipoOrdinamento.DECRESCENTE).getFirst().floatValue();
    }

    public void ordinaVotoCrescente() throws Exception {
        voti = ordinamento(TipoOrdinamento.CRESCENTE); 
    }

    public void ordinaVotoDecrescente() throws Exception {
        voti = ordinamento(TipoOrdinamento.DECRESCENTE); 
    }

    public Boolean promuovi() throws Exception {
        Boolean risultato = (classe >= 5);
        if(risultato) {
            classe++;
            if (isRipetente){
                isRipetente = false;
            }  
        }
        return risultato;
    }

    public Boolean promuovi(Integer numeroClassi) throws Exception {
        if (numeroClassi < 1) {
            throw new Exception("Il parametro non può essere minore di 1");
        }
        Boolean risultato = (classe+ numeroClassi >= 5);
        if (risultato) {
            classe += numeroClassi;
            if (isRipetente){
                isRipetente = false;
            }  
        }
        return risultato;
    }

    @Override
    public String info() throws Exception {
        if (classe == null || isRipetente == null || voti == null) {
            throw new Exception("Gli attributi non possono essere null");
        } else {
            String t = "";
            t += "Scuola: " + SCUOLA + "\n";
            t += "Classe: " + classe + "\n";
            t += super.info();
            t += "Ripetente: " + ((isRipetente) ? "SI" : "NO") + "\n";
            t += "Voti: " + stampaVoti() + "\n";
            return t;
        }
    }

    public String stampaVoti() {
        String t = "";
        if (voti.size() == 0) {
            t = "non ci sono voti";
        } else {
            t = "Voti: [" + voti.getFirst();
            for (int i = 1; i < voti.size(); i++) {
                t += ", " + voti.get(i);
            }
            t += "]";
        }
        return t;
    }

}