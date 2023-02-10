package Ejemplo_clase;

import java.util.Objects;

public class Persona2 implements Comparable<Persona2>{
    private String nombre;
    private int edad;

    Persona2(){
        //Constructor por defecto
    }

    public Persona2(String nombre) {
        this.nombre = nombre;
    }

    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    /**
     * @param other
     * @return compara por nombre
     */
    @Override
    public int compareTo(Persona2 other) {
        return nombre.compareTo(other.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona2 persona = (Persona2) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
