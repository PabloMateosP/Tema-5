package Actividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskList {
    List<String> tareas = new ArrayList<>();
    public List<String> getTareas() {
        return tareas;
    }

    public void setTareas(List<String> tareas) {
        this.tareas = tareas;
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

    static void getTasks(List<String> lista){
        Object [] arreglo = lista.toArray();
        System.out.println(Arrays.toString(arreglo));
    }
}
