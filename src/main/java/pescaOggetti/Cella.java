package pescaOggetti;

/**
 *
 * @author andry
 */
public class Cella {

    private Oggetto oggettoCella;
    private Integer numeroCella;
    private Boolean selezionata = false;
    private Boolean occupata = false;

    public Cella(Oggetto ogggettoCella, Integer numeroCella) {
        this.oggettoCella = ogggettoCella;
        this.numeroCella = numeroCella;
    }

    public void setSelezionata(Boolean selezionata) {
        this.selezionata = selezionata;
    }

    public Boolean getSelezionata() {
        return selezionata;
    }

    public void setNumeroCella(Integer numeroCella) {
        this.numeroCella = numeroCella;
    }

    public Integer getNumeroCella() {
        return numeroCella;
    }

    public void setOggettoCella(Oggetto oggettoCella) {
        this.oggettoCella = oggettoCella;
    }

    public void setOccupata(Boolean occupata) {
        this.occupata = occupata;
    }

    public Boolean getOccupata() {
        return occupata;
    }

    public Oggetto getOggettoCella() {
        return oggettoCella;
    }
    
    
    public String nomeOggetto(){
        return this.oggettoCella.toString();
    }
    

}

