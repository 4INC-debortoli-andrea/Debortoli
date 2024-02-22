package generics;

/**
 *
 * @author andrea.debortoli
 */

/*
I tipi generici permettono di definire classi e metodi parametrici (con attributi 
e parametri di tipo generico). In questo modo possiamo scrivere una sola classe o 
metodo che gestisce un qualsiasi tipo di dato.

E    -> Tipo di un elemento in una raccolta (Collection)
K    -> Tipo di una chiave in una mappa (HashMap)
V    -> Tipo di un valore in una mappa (HashMap)
T    -> Tipo generico
S, U -> Ulteriori tipi generici
*/

public class Box <T> {    
    private T t;

    public Box() {
    
    }        
    
    public Box(T t) {
        //setT(t);
        this.t = t;
    }        

    public T getT() {        
        return t;
    }        
    
    public void setT(T t) /*throws Exception*/ {
        //if (t != null)
            this.t = t;
        //else
            //throw new Exception("l'attributo non può essere null!");
    }
    
    @Override
    public String toString() {
        
        return t.toString();                
    }          
    
    public Class tipo(){
        return t.getClass();
    }
    
    static public <T> T verificaTipo(T valore){
                
        return (T)valore.getClass();
    }
    
    public static void main(String[] args) throws Exception {
        Box<Integer> b0 = new Box<>();
        b0.setT(2);
        
        Box<Integer> b1 = new Box<>(10);
        Box<Double>  b2 = new Box<>(5.50);
        Box<String>  b3 = new Box<>("testo");
        Box<Boolean> b4 = new Box<>(true);
        
        System.out.println(b1.toString());
        System.out.println(b1.tipo());
        
        System.out.println(b2);
        System.out.println(b2.tipo());
        
        System.out.println(b3);
        System.out.println(b3.tipo());
        
        System.out.println(b4);
        System.out.println(b4.tipo());

        //Box<Boolean> b6 = new Box<>(null);
        //System.out.println(b6); 
        
        //Persona p = new Persona("cognome", "nome");
        //Box<Persona> b5 = new Box<>(p);        
        
        //System.out.print(b5);       
        //System.out.println(b5.tipo()); // se non è ridefinito il metodo toString stampa Persona@7852e922        
                
        //System.out.println(Box.verificaTipo(b5));                
    }
}
