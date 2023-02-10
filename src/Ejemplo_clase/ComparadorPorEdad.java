package Ejemplo_clase;
import java.util.Comparator;
public class ComparadorPorEdad implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Persona2 p1 = (Persona2) o;
        Persona2 p2 = (Persona2) t1;
        if (p1.getEdad() == p2.getEdad())
            return 0;
        if (p1.getEdad() > p2.getEdad())
            return 1;
        else return -1;
    }
}