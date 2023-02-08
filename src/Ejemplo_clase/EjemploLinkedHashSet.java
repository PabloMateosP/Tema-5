package Ejemplo_clase;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EjemploLinkedHashSet {
    public static void main(String[] args) {
        Set <String> conjunto2 = new LinkedHashSet<>(); //Mediante el linked te lo ordena según introducción ej: este caso
        conjunto2.add("Samuel");
        conjunto2.add("Alex Salas");
        conjunto2.add("Manolo");
        conjunto2.add("Pablito");

        System.out.println(conjunto2);

        conjunto2.add("Samuel");

        System.out.println(conjunto2);

        conjunto2.add(null);

        System.out.println(" ");

        String a;
        Iterator<String> repetidor = conjunto2.iterator();
        while (repetidor.hasNext()){
            a = repetidor.next();
            System.out.print(a + " ");
        }
    }
}
