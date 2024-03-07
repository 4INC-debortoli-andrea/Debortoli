package esercizi;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author andry
 */
public class Automobile extends MezzoDiTrasporto{
    private ArrayList<String> persone;

    public Automobile(ArrayList<String> persone, String marca, Integer cavalli) throws Exception {
        super(marca, cavalli);
        setPersone(persone);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.persone);
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
        final Automobile other = (Automobile) obj;
        return Objects.equals(this.persone, other.persone);
    }

    @Override
    public String toString() {
        return super.toString() + "\nAutomobile{" + "persone=" + persone + '}';
    }
    
        
    public void setPersone(ArrayList<String> persone)throws Exception{
        if (persone == null){
            throw new NullPointerException("Non può essere null");
        }else if(persone.isEmpty()){
            throw new Exception("L'automobile non può essere vuota");
        }else if(persone.size() > 5){
            throw new Exception("L'automobile non può contenere più di 5 persone");
        }else
        this.persone = (ArrayList<String>) persone.clone();
    }
    
    
    //potrebbe esserci un controllo sulla stringa
    public void aggiungiPersone(String persona)throws Exception{
        if(persone.size() < 5)
            persone.add(persona);
        else 
            throw new Exception("L'automobile non può contenere più di 5 persone");
    }
    
    //potrebbe esserci un controllo sulla stringa
    public void rimuoviPersone(String persona)throws Exception{
        if(persone.size() > 1)
            persone.remove(persona);
        else 
            throw new Exception("L'automobile non può essere svuotata ultriormente");
    }
    
    
        
}
