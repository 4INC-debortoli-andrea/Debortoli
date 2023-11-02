package classe;

/**
 *
 * @author andrea.debortoli
 */
public class Studente {
    private String cognome;
    private String nome;

    public Studente(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }
    
    public Studente(Studente studente) {
        this.cognome = studente.getCognome();
        this.nome = studente.getNome();        
    }
    
    public String getCognome() {
        return cognome;
    }
    public String getNome() {
        return nome;
    }
    
    public void setCognome(String c){
        nome = c;
    }
    public void setNome(String n){
        cognome = n;
    }
    
    @Override
    public String toString(){
    return "Studente{ " + "\n" +
            "\tcognome: " + cognome + "\n" +
            "\tnome: " + nome + "\n" +
            "}"; 
    }
}
