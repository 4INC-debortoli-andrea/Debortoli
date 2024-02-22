package operatrice;

/**
 *
 * @author andry
 */
public class Operatrice<T> {

    private T val1;
    private T val2;

    public Operatrice() {
        this.val1 = null;
        this.val2 = null;
    }

    public Operatrice(T val1, T val2) {
        setVal1(val1);
        setVal2(val2);
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        if (val1 == null) {
            throw new IllegalArgumentException("Il valore non può essere nullo");
        }
        this.val1 = val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        if (val2 == null) {
            throw new IllegalArgumentException("Il valore non può essere nullo");
        }
        this.val2 = val2;
    }

    public T somma() {
        T r;
        if ((val1 instanceof Integer || val1 instanceof Float || val1 instanceof Double || val1 instanceof String)
                && (val2 instanceof Integer || val2 instanceof Float || val2 instanceof Double || val2 instanceof String)) {
            if (val1 instanceof Number && val2 instanceof Number) {
                Double a = ((Number) val1).doubleValue() + ((Number) val2).doubleValue();
                r = (T) a;
            } else {
                r = (T) ("" + val1 + val2);
            }
        } else {
            r = (T) "Impossibile effetuare la somma";
        }

        return r;
    }

    public T sotrazione() {
        T r;
        if (val1 instanceof Number && val2 instanceof Number) {
            Double a = ((Number) val1).doubleValue() - ((Number) val2).doubleValue();
            r = (T) a;
        } else if (val1 instanceof String && val2 instanceof String) {
            r = (T) ((String) val1).replace((String) val2, "");
        } else {
            r = (T) "Impossibile effettuare la sottrazione";
        }
        return r;
    }

    public T moltiplicazione() {
        T r;
        if (val1 instanceof Number && val2 instanceof Number) {
            Double a = ((Number) val1).doubleValue() * ((Number) val2).doubleValue();
            r = (T) a;
        } else {
            r = (T) "Impossibile effetuare la moltiplicazione";
        }
        return r;
    }

    public T divisione() throws Exception {
        T r;
        if(((Number)val2).doubleValue() == 0){
            throw new Exception("Impossibile dividere per 0");
        }
        if (val1 instanceof Number && val2 instanceof Number) {
            Double a = ((Number) val1).doubleValue() / ((Number) val2).doubleValue();
            r = (T) a;
        } else {
            r = (T) "Impossibile effetuare la divisione";
        }
        return r;
    }

    public Class tipoVal1() {
        return val1.getClass();
    }

    public Class tipoVal2() {
        return val2.getClass();
    }

    public <T> T verificaTipo(T valore) {
        return valore;
    }

    @Override
    public String toString() {
        return "OPERATORICE" + "\nval1 = " + val1 + "\nval2 = " + val2;
    }
}
