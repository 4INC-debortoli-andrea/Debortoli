package persona;

import data.Data;
public class Persona {

    private String cognome;
    private String nome;
    private Data dataDiNascita;
    protected static int numeroIstanze;

    public Persona() {
        cognome = null;
        nome = null;
        dataDiNascita = null;
        numeroIstanze++;
    }

    public Persona(String cognome, String nome, Data dataDiNascita) throws Exception {
        try {
            setCognome(cognome);
            setNome(nome);
            setDataDiNascita(dataDiNascita);
            numeroIstanze++;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    public final String getCognome() {
        return cognome;
    }

    public final Data getDataDiNascita() {
        return new Data(dataDiNascita);
    }

    public final  String getNome() {
        return nome;
    }

    public static final int getNumeroIstanze() {
        return numeroIstanze;
    }

    public final void setCognome(String cognome) throws Exception {
        if (cognome.isEmpty()) {
            throw new Exception("Il cognome non può essere vuoto");
        } else if (!Character.isUpperCase(cognome.charAt(0))) {
            throw new Exception("Il cognome deve cominciare con una lettera maiuscola");
        } else {
            try {
                controlloNominativi(cognome);
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
            this.cognome = cognome;
        }
    }

    public final void setNome(String nome) throws Exception {
        if (nome.isEmpty()) {
            throw new Exception("Il nome non può essere vuoto");
        } else if (!Character.isUpperCase(nome.charAt(0))) {
            throw new Exception("Il nome deve cominciare con una lettera maiuscola");
        } else {
            try {
                controlloNominativi(nome);
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
            this.nome = nome;
        }
    }

    public final void setDataDiNascita(Data dataDiNascita) throws Exception {
        try {
            if (Data.differenzaInGiorni(dataDiNascita, new Data()) < 0) {
                throw new Exception("La data di nascita non può essere successiva alla data attuale");
            } else {
                this.dataDiNascita = new Data(dataDiNascita);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    private void controlloNominativi(String nominativo) throws Exception {
        if (!Character.isUpperCase(nominativo.charAt(0))) {
            throw new Exception("Il nominativo deve cominciare con una lettera maiuscola");
        }
        for (int i = 1; i < nominativo.length(); i++) {
            if (!Character.isLetter(nominativo.charAt(i)) || Character.isUpperCase(nominativo.charAt(i))) {
                throw new Exception("Il nominativo non può contenere caratteri speciali o lettere maiuscole");
            }
        }
    }

    public Boolean verificaOmonimia(Persona persona) throws Exception {

        if (persona == null) {
            throw new Exception("Il parametro non può essere null");
        } else if (this.cognome == null || this.nome == null || persona.nome == null || persona.cognome == null) {
            throw new Exception("Uno o più dati sono nulli");
        } else {
            Boolean risultato = false;
            if (this.cognome.equals(persona.cognome) && this.nome.equals(persona.nome)) {
                risultato = true;
            }
            return risultato;
        }
    }

    public Integer calcolaEtà() throws Exception {
        try {
            return Data.differenzaInAnni(dataDiNascita, new Data());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public String info() throws Exception {
        if (cognome == null || nome == null || dataDiNascita == null) {
            throw new Exception("Gli attributi non possono essere null");
        } else {
            String t = "";
            t += "Cognome: " + cognome + "\n";
            t += "Nome: " + nome + "\n";
            t += "Data di nascita: " + dataDiNascita.toString() + "\n";
            return t;
        }

    }

}
