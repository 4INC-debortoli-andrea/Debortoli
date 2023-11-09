package orologio;

public class Main {
    public static void main(String[] args) {
        
      try {
              OrologioDigitale l = new OrologioDigitale(13, 56, 25);
              l.suDodiciOre(true);
              System.out.println(l.stampa());
              OrologioCucu o = new OrologioCucu(10, 30, 25);
              System.out.println(o.stampa());
          } catch (Exception e) {
              System.err.println(e.getMessage());
            }          
    }
}