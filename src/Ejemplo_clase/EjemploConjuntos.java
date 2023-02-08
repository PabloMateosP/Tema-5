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

        //Prueba método constaintAll
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("HashSet1: " + numbers);

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet2: " + primeNumbers);

        System.out.println(numbers.containsAll(primeNumbers));
    }
}
