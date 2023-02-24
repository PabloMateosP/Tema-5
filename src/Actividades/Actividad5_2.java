package Actividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Actividades.TaskList.*;

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

        System.out.println(" ");

        String tareaCompletada = "Tarea 6";
        marcarCompletada(tareas, tareaCompletada);
        System.out.println(tareas);

        System.out.println(" ");

        getTasks(tareas);
    }
}
