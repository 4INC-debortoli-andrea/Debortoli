package polimorfismo;

/**
 *
 * @author andrea.debortoli
 */
public class Padre {
    public int pp;
    
    public Padre(){
        setPp();
    }
    
    public Padre (Padre p){
        
    }

    public void setPp() {
        this.pp = 5;
    }
    public int getPp(){
        return pp;
    }
    
    public void incrementa(){
        pp++;
    }

    @Override
    public String toString() {
        return "Padre{ \n\tpp: " + pp + "\n}"; 
    }
    
    
    
}
