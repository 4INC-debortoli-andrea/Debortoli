package persona;

/**
 *
 * @author andry
 */

import data.Data;
public class Studente extends Persona {

    private final String SCUOLA = "I.T.T. Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private Float[] voti;

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
        this.voti = new Float[0];
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
                aggiungiVoti(voti[i]);                
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

    public void aggiungiVoti(Float voto) throws Exception {
        if (voto == null) {
            throw new Exception("Il voto deve essere compreso tra 0 e 10 e non può essere null");
        }
        if (voto < 0 || voto > 10) {
            throw new Exception("Il voto deve essere compreso tra 0 e 10");
        }
        if (voti == null) {
            throw new Exception("L'array non può essere null");
        } else {
            Float[] temp = new Float[voti.length+1];
            for (int i = 0; i < voti.length; i++){
                temp[i] = voti[i];
            }
            temp[voti.length] = voto;
            voti = temp;
        }
    }

    public void rimuoviVoto(Integer posizione) throws Exception {
        if (posizione >= voti.length || posizione < 0) {
            throw  new Exception("La posizione supera i limiti dell'array");
        }
        Float[] temp = new Float[voti.length-1];
        for (int i = 0; i < temp.length; i++){
            if (i < posizione) {
                temp[i] = voti[i];
            } else if(i >= posizione) {
                temp[i] = voti[i+1];
            }
        }
        voti = temp;
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

    private String stampaVoti() {
        String t = "";
        if (voti.length == 0) {
            t = "non ci sono voti";
        } else {
            t = "[" + voti[0];
            for (int i = 1; i < voti.length; i++) {
                t += "," + voti[i];
            }
            t += "]";
        }
        return t;
    }

}
