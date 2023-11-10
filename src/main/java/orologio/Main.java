package orologio;

public class Main {
    public static void main(String[] args) {
        
      try {
              OrologioDigitale l = new OrologioDigitale(15, 2, 17);
              l.suDodiciOre(false);
              System.out.println(l.stampa());
              OrologioCucu o = new OrologioCucu(0, 0, 0);
              System.out.println(o.stampa());
          } catch (Exception e) {
              System.err.println(e.getMessage());
            }          
    }
}