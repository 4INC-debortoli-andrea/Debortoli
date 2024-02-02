package verifica;

/**
 *
 * @author andrea.debortoli
 */
import java.util.ArrayList;
import java.util.Comparator;
import verifica512.Data;

public class NewMain {
    
    public static void main(String[] args) {
        ArrayList<Appartamento> appa = new ArrayList();
        appa.add(new Appartamento(1, 1, "1"));
        appa.add(new Appartamento(1, 1, "2"));
        ArrayList<Impianto> impianti = new ArrayList();
        try {
            impianti.add(new Impianto("a", "b", 10, Potenza.MEDIA, true, new Data(10, 10, 2023), tipoCombustibile.BIOMASSA) );
            impianti.add(new Impianto("a", "b", 4, Potenza.MEDIA, true, new Data(10, 10, 2023), tipoCombustibile.BIOMASSA) );
            impianti.add(new Impianto("a", "b", 20, Potenza.MEDIA, true, new Data(10, 10, 2023), tipoCombustibile.BIOMASSA) );
            impianti.add(new Impianto("a", "b", 16, Potenza.MEDIA, true, new Data(10, 10, 2023), tipoCombustibile.BIOMASSA) );
            Condominio cond = new Condominio(appa, true, "cond1", impianti.get(0), new Data(10, 10, 2023), new Data(10, 10, 2023), true);
        } catch (Exception e) {
            System.out.println(e);
        }
        impianti.sort(Comparator
                .comparing(Impianto :: getDimensione)
        );
        System.out.println(impianti);
    }
    
}
