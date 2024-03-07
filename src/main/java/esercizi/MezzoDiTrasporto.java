package esercizi;

/**
 *
 * @author andry
 */
import java.util.*;
public class MezzoDiTrasporto implements Cloneable{
    private String marca;
    private Integer cavalli;
    protected static int nIstanze;
    private final float costante = 0.73f;

    public MezzoDiTrasporto(String marca, Integer cavalli) throws Exception{
        setMarca(marca);
        setCavalli(cavalli);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.marca);
        hash = 29 * hash + Objects.hashCode(this.cavalli);
        hash = 29 * hash + Float.floatToIntBits(this.costante);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MezzoDiTrasporto other = (MezzoDiTrasporto) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.cavalli, other.cavalli);
    }

    @Override    
    protected MezzoDiTrasporto clone() throws CloneNotSupportedException {
        MezzoDiTrasporto m = (MezzoDiTrasporto) super.clone();
        nIstanze++;
        return m;
    } 

    @Override
    public String toString() {
        return "MezzoDiTrasporto{" + "marca=" + marca + ", cavalli=" + cavalli + ", costante=" + costante + '}';
    }
    
    
    
    public void setMarca(String marca)throws Exception{
        marca = marca.trim();        
        if(marca == null){
            throw new NullPointerException("Non può essere null");
        } else if(marca.length() < 3){
            throw new Exception("La marca deve avere almeno 3 lettere");
            } else if(!marca.equals(marca.toUpperCase())){
                throw new Exception("La marca deve essere tutta maiuscola");
                }else
                this.marca = marca;
    }
    
    
    
    public void setCavalli(Integer cavalli)throws Exception{
        Random r = new Random();
        Integer cavalliMinimi = r.nextInt(100) + 100;
        Integer cavalliMassimi = r.nextInt(100) + 900;
        if(cavalli.intValue() < cavalliMinimi){
            throw new Exception("Il mezzo deve avere più di un numero n random compreso tra 100 e 200 cavalli");
        }else if(cavalli.intValue() > cavalliMassimi){
                throw new Exception("Il mezzo deve avere meno di un numero n random compreso tra 900 e 1000 cavalli");
        }else
            this.cavalli = cavalli;
    }
    
    public int kiloWatt(){
        return (int) costante * cavalli;
    }
    
    public String info()throws Exception{
        if(marca == null || cavalli == null){
            throw new Exception("Gli attributi nono possono essere null");
        }else
            return toString();        
    }
    
    
}
