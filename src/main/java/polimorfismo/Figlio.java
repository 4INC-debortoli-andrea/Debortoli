package polimorfismo;

/**
 *
 * @author andrea.debortoli
 */

public class Figlio extends Padre {
    public String ff;
    
    public Figlio(){
        super();
        ff = "figlio";
    }

    public void setFf(String ff) {
        this.ff = ff;
    }
    public String getFf() {
        return ff;
    }
    
    @Override
    public void incrementa(){
        ff = "ho modificato il metodo del padre";
    }

    @Override
    public String toString() {
        return "Figlio{ \n\tpp: " + pp + "\n\tff: " + ff + "\n}";
    }
    
    

    
    
}
