package orologio;

public class Main {
    public static void main(String[] args) {
        
      try {
            Orologio o = new Orologio(13, 17, 14);
            OrologioDigitale d = new OrologioDigitale(15, 33, 9);
            OrologioCucu c = new OrologioCucu(0, 0, 0);

            Orologio[] arrayOrologi = {new Orologio(13, 17, 14),
                new OrologioDigitale(15, 33, 9), 
                new OrologioCucu(0, 0, 0)};
            
            
            d.suDodiciOre(true);

            for (Orologio orologio : arrayOrologi) 
                System.out.println("Orologio: " + orologio.stampa());

            o.aggiungiOre(2);
            d.aggiungiOre(7);
            c.aggiungiOre(12);
            
            System.out.println("\n");

            for (Orologio orologio : arrayOrologi) 
                System.out.println("Orologio dopo: " + orologio.stampa());
            
            } 
            catch (Exception e) {
                System.err.println(e.getMessage());
            }          
    }
}