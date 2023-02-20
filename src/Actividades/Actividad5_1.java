package Actividades;


import java.util.Set;
import java.util.TreeSet;

public class Actividad5_1 {
    public static void main(String[] args) {
        TreeSet<Persona> Personas = new TreeSet<>();
        Persona Manolo = new Persona();
        Persona Adri = new Persona();
        Persona Pepa = new Persona();
        Persona Ricky = new Persona();

        Personas.add(Manolo);
        Personas.add(Ricky);
        Personas.add(Pepa);
        Personas.add(Adri);

        System.out.println(Personas);


    }
}
