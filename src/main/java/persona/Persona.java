package persona;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
    private String cognome;
    private String nome;
    private String codFisc;
    private String dataDiNascita;
    private static int numeroIstanze;

    public Persona(String cognome, String nome, String codFisc, String dataDiNascita) throws Exception {
        setCognome(cognome);
        setNome(nome);
        setCodFisc(codFisc);
        this.dataDiNascita = dataDiNascita;
        addIstanza();
    }

    private void addIstanza() {
        numeroIstanze++;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isEmpty()) {
            throw new Exception("Il nome non può essere vuoto.");
        }
        for(int i = 1; i < nome.length(); i++) {
            if(Character.isUpperCase(nome.charAt(i))){
                i = nome.length();
                throw new Exception("Non possono esserci maiuscole oltre all'iniziale");
            }
        }
        if (Character.isUpperCase(nome.charAt(0))) {
            this.nome = nome;
        } else {
            throw new Exception("Il nome deve iniziare con una lettera maiuscola.");
        }
        
    }

    public void setCognome(String cognome) throws Exception {
        if (cognome.isEmpty()) {
            throw new Exception("Il cognome non può essere vuoto.");
        }
        for(int i = 1; i < cognome.length(); i++) {
            if(Character.isUpperCase(nome.charAt(i))){
                i = cognome.length();
                throw new Exception("Non possono esserci maiuscole oltre all'iniziale");
            }
        }
        if (Character.isUpperCase(nome.charAt(0))) {
            this.cognome = cognome;
        } else {
            throw new Exception("Il cognome deve iniziare con una lettera maiuscola.");
        }
    }

    public void setCodFisc(String codFisc) throws Exception {
        if (codFisc.length() != 16) {
            throw new Exception("Codice fiscale troppo corto");
        }

        codFisc = codFisc.toUpperCase();

        for (int i = 0; i < 6; i++) {
            if (!Character.isLetter(codFisc.charAt(i))) {
                throw new Exception("Numeri all'inizio");
            }
        }

        for (int i = 6; i < 8; i++) {
            if (!Character.isDigit(codFisc.charAt(i))) {
                throw new Exception("Lettere in centro");
            }
        }

        if (!Character.isLetter(codFisc.charAt(8))) {
            throw new Exception("Nona lettera errata");
        }

        for (int i = 9; i < 11; i++) {
            if (!Character.isDigit(codFisc.charAt(i))) {
                throw new Exception("Ultime cifre sbagliate");
            }
        }

        this.codFisc = codFisc;
    }

    
    
    
    public boolean verificaOmonimia(Persona p) {
        boolean risultato = false;
        if (p.nome.equals(this.nome) && p.cognome.equals(this.cognome)) {
            risultato = true;
        }

        return risultato;
    }

    public int calcolaEta() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataOdierna = LocalDate.now();
        LocalDate dataNascita = LocalDate.parse(dataDiNascita, formatter);
        return Period.between(dataNascita, dataOdierna).getYears();
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }


    @Override
    public String toString() {
        return "Persona [cognome = " + cognome + ", nome = " + nome + ", codFisc = " + codFisc + ", dataDiNascita = "
                + dataDiNascita + "]";
    }
}
