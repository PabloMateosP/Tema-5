package Ejemplo_clase;

import java.util.TreeSet;

public class EjemploComparable {
    public static void main(String[] args) {
        Persona2 pepe = new Persona2("Pepe",19);
        Persona2 manolo = new Persona2("manolo",22);
        System.out.println(pepe.compareTo(manolo));

        TreeSet<Persona2> treeSet = new TreeSet<>();
        treeSet.add(pepe);
        treeSet.add(manolo);
        System.out.println(treeSet);

        TreeSet<Persona2> treeSet2 = new TreeSet<>(new ComparadorPorEdad());
        treeSet2.add(pepe);
        treeSet2.add(manolo);
        System.out.println(treeSet2);


    }
}