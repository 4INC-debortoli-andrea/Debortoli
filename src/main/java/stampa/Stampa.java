package stampa;

/**
 *
 * @author andrea.debortoli
 */
public class Stampa <T>{
    
    public Stampa(){
        
    }   
    
    public <T> T stampaElemento(T elemento){
        return elemento;
    }
    
    public <T> T stampaVettore(T[] vettore){
        String t = "";
        for(int i = 0; i < vettore.length; i++)
            t+= " " + vettore[i] + ",";
        return (T)t;
    }
    
}
