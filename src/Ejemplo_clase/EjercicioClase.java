package Ejemplo_clase;

//23-02-2023

import java.util.*;

public class EjercicioClase {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(14);
        lista.add(17);
        lista.add(13);
        lista.add(11);
        lista.add(18);
        lista.add(16);
        lista.add(15);
        System.out.println(lista);
        //Desordenamos la lista
        Collections.shuffle(lista);
        System.out.println("Lista desordenada: " + lista);
        //Ordenamos la lista
        Collections.sort(lista);
        System.out.println("Lista ordenada: "+lista);
        //Ordenamos al contrario
        Collections.reverse(lista);
        System.out.println("Lista ordenada al contrario: " + lista);
        //Hacemos la búsqueda de un elemento. Para que funcione la lista debe estar ordenada.
        Collections.sort(lista);
        System.out.println(Collections.binarySearch(lista, 15));
        //Crear un array a partir de un lista
        lista.toArray();

        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(15);
        set.add(17);
        set.add(18);
        set.add(13);
        set.add(14);
        set.add(19);
        System.out.println(set);



    }
}
