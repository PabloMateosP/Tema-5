package Ejemplo_clase;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploComparator {
    public static void main(String[] args) {
        Comparator<Persona2> comparadorPersonaPorNombre = Comparator.comparing(Persona2::getNombre);
        Set<Persona2> personas = new TreeSet<>(comparadorPersonaPorNombre);

        Persona2 pepe = new Persona2("pepe", 19);
        Persona2 manolo = new Persona2("manolo", 22);

        //Creamos dos nuevas personas

        personas.add(pepe);
        personas.add(manolo);

        System.out.println(personas);
    }
}