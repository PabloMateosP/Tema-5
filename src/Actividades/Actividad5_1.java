package Actividades;

import java.util.TreeSet;

public class Actividad5_1 {
    public static void main(String[] args) {
        TreeSet<Persona> Personas = new TreeSet<>();
        Persona Manolo = new Persona(24, "Manolo");
        Persona Adri = new Persona(31, "Adri");
        Persona Pepa = new Persona(14, "Pepa");
        Persona Ricky = new Persona(18, "Ricky");

        Personas.add(Manolo);
        Personas.add(Ricky);
        Personas.add(Pepa);
        Personas.add(Adri);

        System.out.println(Personas);

    }
}
