package classe;

/**
 *
 * @author andrea.debortoli
 */
public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti) throws Exception {
        this.studenti = new Studente[studenti.length];
        for (int i = 0; i < studenti.length; i++) {
            this.studenti[i] = new Studente(studenti[i]);
        }
        this.capoClasse = setCapoClasse(capoClasse);
    }


     public final Studente setCapoClasse(Studente capoClasse) throws Exception {
        try {
            if (capoClasse == null) {
                throw new Exception("Il capo classe non e' presente nella classe");
            }

        } catch (Exception e) {
            throw e;
        }
        return capoClasse;
    }

    public Studente getCapoClasse() {
        return capoClasse;
    }
    
    
    public void invertiAttributi(){
        
    }
    
    public void ordineDiabetico(){
        
    }
    

    @Override
    public String toString() {
        String t = "Classe{" + "\n" +
                "\tCapoclasse: " + capoClasse + "\n" +
                "\tStudenti: ";
        
        for(int i = 0; i < studenti.length; i++){
            t += "\n\n" + studenti[i].toString();
        }
        
        t += "\n\n}";
        
        return t;
    }


    
}
