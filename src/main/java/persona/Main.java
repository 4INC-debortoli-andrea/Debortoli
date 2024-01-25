package persona;


import data.Data;
public class Main {
    public static void main(String[] args) {
        
        
        try {
            Data d = new Data(6, 9, 2006);
            Studente s = new Studente(4, false, "Debortoli", "Andrea", d);
            //System.out.println("Numero della classe iniziale: " + s.getClasse());
            //s.promuovi();
            //System.out.println("Numero della classe dopo aver invocato in metodo promuovi senza parametri: "+s.getClasse());
            //s.promuovi(2);
            //System.out.println("Numero della classe dopo aver invocato in metodo promuovi con i parametri: "+s.getClasse());
            s.aggiungiVoto(8.0f);
            s.aggiungiVoto(3.0f);
            s.aggiungiVoto(6.25f);
            s.aggiungiVoto(9.5f);
            System.out.println("Voti prima dell'ordinamento");
            System.out.println(s.stampaVoti());
            s.ordinaVotoCrescente();
            System.out.println("Voti dopo l'ordinamento crescente");
            System.out.println(s.stampaVoti());
            s.ordinaVotoDecrescente();
            System.out.println("Voti dopo l'ordinamento decrescente");
            System.out.println(s.stampaVoti());
            System.out.println("Voto maggiore: " + s.votoMaggiore());
            System.out.println("Voto minore: " + s.votoMinore());
            System.out.println("Media voti: " + s.mediaVoti());
            


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
