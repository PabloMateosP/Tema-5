package Ejemplo_clase;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String> conjunto3 = new HashSet<>();
        conjunto3.add("a1");
        conjunto3.add("a2");
        conjunto3.add("a3");

        TreeSet<String> a = new TreeSet<>();
        a.add("b1");
        a.add("b2");
        a.add("b3");

        System.out.println(a);

        a.add("b3");

        System.out.println(a);
    }
}
