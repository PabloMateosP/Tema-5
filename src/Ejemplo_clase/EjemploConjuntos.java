package Ejemplo_clase;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploConjuntos {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        System.out.println(conjunto.isEmpty());

        String s = "s1";
        conjunto.add(s);
        System.out.println(conjunto.isEmpty());

        System.out.println(conjunto);

        conjunto.add("s2");
        conjunto.add("s3");
        conjunto.add("s4");
        conjunto.add("s5");

        System.out.println(conjunto);

        conjunto.add("s3");

        System.out.println(conjunto);

        String e;
        Iterator<String> it = conjunto.iterator();
        while (it.hasNext()){
            e = it.next();
            System.out.print(e + " ");
        }

        conjunto.remove(s);
        System.out.println(conjunto);
    }
}
