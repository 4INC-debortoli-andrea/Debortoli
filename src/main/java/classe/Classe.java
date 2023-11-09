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

    public Studente getCapoClasse() {
        return capoClasse;
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

    public void ordinaStudenti() {

        Studente[] ordina = new Studente[this.studenti.length];

        char[] lettere = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int c = 0;
        for (int i = 0; i < lettere.length; i++) {
            for (int j = 0; j < this.studenti.length; j++) {
                if (this.studenti[j].primaLettera() == lettere[i]) {
                    ordina[c] = this.studenti[j];
                    c++;
                }
            }
        }

        this.studenti = ordina;

    }

    private char primaLettera() {
        return studenti[1].getNome.charAt(0);
    }

    public void invertiAttributiTest() throws Exception {

        String nome = this.capoClasse.getNome();
        String cognome = this.capoClasse.getCognome();

        this.capoClasse.setCognome(nome);
        this.capoClasse.setNome(cognome);

        for (int i = 0; i < studenti.length; i++) {
            String nomeStud = this.studenti[i].getNome();
            String cognomeStud = this.studenti[i].getCognome();

            this.studenti[i].setCognome(nomeStud);
            this.studenti[i].setNome(cognomeStud);
        }
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
