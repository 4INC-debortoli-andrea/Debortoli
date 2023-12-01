package persona;

public class Main {
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("Debortoli", "Andrea", "RSSMRC95M16H224T", "06/09/2006");
            Persona p2 = new Persona("Feltrin", "Alex", "RSSMRC95M16H224T", "03/03/2006");
            Persona p3 = new Persona("Rossi", "Marco", "RSSMRC95M16H224T", "12/12/1912");
            Persona p4 = new Persona("Bernardo", "Alessandro", "RSSMRC95M16H224T", "04/12/2006");

            Persona[] gruppo = { p1, p2, p3, p4 };

            for (Persona p : gruppo) {
                System.out.println("\n" + p.toString());
                System.out.println("Età attuale: " + p.calcolaEta());
                for (Persona altraPersona : gruppo) {
                    if (!p.equals(altraPersona) && p.verificaOmonimia(altraPersona)) {
                        System.out.println("Omonimia trovata con: " + altraPersona.toString());
                    }
                }
            }

            System.out.println(Persona.getNumeroIstanze());

        } catch (Exception e) {
            System.out.println("Si e verificata un'eccezione: " + e.getMessage());
        }
    }
}
