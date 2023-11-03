package classe;

/**
 *
 * @author andrea.debortoli
 */
public class Studente {
    private String cognome;
    private String nome;

    public Studente(String nome, String cognome) throws Exception {
        setNome(nome);
        setCognome(cognome);
    }

    public Studente(Studente s) {
        this.nome = s.nome;
        this.cognome = s.cognome;
    }

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }

    public final void setNome(String nome) throws Exception {
        this.nome = controllo(nome, "nome");
    }
    public final void setCognome(String cognome) throws Exception {
        this.cognome = controllo(cognome, "cognome");
    }

    private String controllo(String p, String nome) throws Exception {
        try {
            if (p == (null)) {
                throw new Exception("La stringa non può essere null!");
            }
            if (!p.isEmpty()) {
                if (Character.isUpperCase(p.charAt(0))) {
                    for (int i = 1; i < p.length(); i++) {
                        char c = p.charAt(i - 1);
                        if (Character.isUpperCase(p.charAt(i)) == false && c == ' ') {
                            throw new Exception("La prima lettera del secondo " + nome + " dev'essere maiuscola");
                        }
                        if (!Character.isLetter(c) && p.charAt(i) == 32) {
                            throw new Exception("Nel " + nome + " devono esserci solamente lettere");
                        }
                    }
                } else {
                    throw new Exception("La prima lettera dev'esere maiuscola!");
                }
            } else {
                throw new Exception("La stringa non può essere vuota!");
            }
        } catch (NumberFormatException e) {

        }
        return p;
    }

    
    @Override
    public String toString(){
    return "Studente{ " + "\n" +
            "\tcognome: " + cognome + "\n" +
            "\tnome: " + nome + "\n" +
            "}"; 
    }
}
