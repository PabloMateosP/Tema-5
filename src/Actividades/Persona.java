package Actividades;

public class Persona {
    private String nombre;
    private Integer edad;

    public Persona(Integer edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public Persona(){

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre =' " + nombre + '\'' +
                ", edad = " + edad +
                '}';
    }

    public int compareTo(Object other){
        Persona otherPersona = (Persona)other;
        if (this.edad == otherPersona.edad){
            return 0;
        }
        if (this.edad > otherPersona.edad){
            return 1;
        }
            return -1;
    }
}
