package operatrice;

public class Main {

    public static void main(String[] args) {
        try {
            Operatrice o = new Operatrice(34.57353, 23.432);
            System.out.println("Somma: " + o.somma());
            System.out.println("Differenza: " + o.sotrazione());
            System.out.println("Moltiplicaizione: " + o.moltiplicazione());
            System.out.println("Divisione: " + o.divisione());
            System.out.println("Tipo val1: " + o.tipoVal1());
            System.out.println("Tipo val2: " + o.tipoVal2());
            System.out.println("Valore inserito come parametro: " + o.verificaTipo("Ciao"));
            System.out.println(o.toString());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}

