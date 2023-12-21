package persona;


import data.Data;
public class Main {
    public static void main(String[] args) {
        
        
        try {
            Data d = new Data(6, 9, 2006);
            Studente s = new Studente(4, false, "Debortoli", "Andrea", d);
            System.out.println("Numero della classe iniziale: " + s.getClasse());
            s.promuovi();
            System.out.println("Numero della classe dopo aver invocato in metodo promuovi senza parametri: "+s.getClasse());
            s.promuovi(2);
            System.out.println("Numero della classe dopo aver invocato in metodo promuovi con i parametri: "+s.getClasse());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
