package verifica;

/**
 *
 * @author andrea.debortoli
 */
import verifica512.Data;
public abstract class HasNormativa extends Edificio {
    private boolean normativaIncendio;
    private String nome;

    public HasNormativa(boolean normativaIncendio, String nome, Impianto impianto, Data controlloAnnuale, Data controlloFumi, boolean hasCapotto) {
        super(impianto, controlloAnnuale, controlloFumi, hasCapotto);
        this.normativaIncendio = normativaIncendio;
        this.nome = nome;
    }  
}
