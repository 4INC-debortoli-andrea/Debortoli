package verifica;

/**
 *
 * @author andrea.debortoli
 */
import verifica512.Data;

enum Potenza {
    LIMITATA,
    MEDIA
}

enum tipoCombustibile {
    LEGNA,
    METANO,
    GPL,
    ELETTRICA,
    GASOLIO,
    POMPA_DI_CALORE,
    CONDENSAZIONE,
    PELLET,
    BIOMASSA
}

public class Impianto {
    private String modello;
    private String marca;
    private double dimensione;
    private Potenza potenza;
    private boolean hasAcquaCalda;
    private Data anno;
    private tipoCombustibile tipoCombustibile;

    public Impianto(String modello, String marca, double dimensione, Potenza potenza, boolean hasAcquaCalda, Data anno, tipoCombustibile tipoCombustibile) {
        this.modello = modello;
        this.marca = marca;
        this.dimensione = dimensione;
        this.potenza = potenza;
        this.hasAcquaCalda = hasAcquaCalda;
        this.anno = anno;
        this.tipoCombustibile = tipoCombustibile;
    }

    public double getDimensione() {
        return dimensione;
    }

    @Override
    public String toString() {
        return String.valueOf(dimensione);
    }
    
    
}
