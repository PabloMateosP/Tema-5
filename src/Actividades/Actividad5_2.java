package Actividades;

import java.util.ArrayList;
import java.util.List;

public class Actividad5_2 {
    public static void main(String[] args) {
        List<String> tareas = new ArrayList<>();
        tareas.add("Tarea 1");
        tareas.add("Tarea 2");
        tareas.add("Tarea 3");
        tareas.add("Tarea 4");
        tareas.add("Tarea 5");
        tareas.add("Tarea 6");

        String nuevaTarea = "Tarea 7";
        agregarTarea(tareas, nuevaTarea);
        System.out.println(tareas);

        String tareaBorrar  ="Tarea 7";
        borrarTarea(tareas, tareaBorrar);
        System.out.println(tareas);

        String tareaCompletada = "Tarea 6";
        marcarCompletada(tareas, tareaCompletada);
        System.out.println(tareas);
    }
    static List<String> agregarTarea (List<String> tareas, String nuevaTarea){

        tareas.add(nuevaTarea);
        return tareas;
    }

    static List<String> borrarTarea (List<String> tareas, String tareaBorrar){
        tareas.remove(tareaBorrar);
        return tareas;
    }

    static List<String> marcarCompletada (List<String> tareas, String tareaCompletada){
        System.out.println("La tarea: " + tareaCompletada + " ha sido completada.");
        tareas.remove(tareaCompletada);
        return tareas;
    }
}
