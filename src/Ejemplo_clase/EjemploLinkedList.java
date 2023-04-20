package Ejemplo_clase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(14);
        numeros.add(17);
        numeros.add(54);
        numeros.add(34);
        numeros.add(21);
        numeros.add(15);
        numeros.add(52);



        List<Integer> linkedlist = new LinkedList<>(numeros);
        linkedlist.add(7);
        linkedlist.add(78);
        linkedlist.add(12);
        System.out.println(linkedlist);

        ListIterator<Integer> listIterator = linkedlist.listIterator(linkedlist.size());
        Integer e;
        while(listIterator.hasPrevious()){
            e = listIterator.previous();
            System.out.println(e);
        }

        //Modificación del 4º elemento para que valga 22
        linkedlist.set(4,22);
        //Mostar si el 22 está en la lista
        System.out.println(linkedlist.contains(22));
        //Vemos la posición que buscamos en este caso el 22
        System.out.println(linkedlist.indexOf(22));
        //Eliminamos ese elemento 22
        linkedlist.remove(4);
        // -- Podemos borrar un elemento mediante el índice en el que se encuentra
        // -- Mediante el método index of veremos donde se encuentra ese elemento para poder borrarlo
        // -- Mediante el método contains podemos ver después del borrado como no se encuentra el elemento
        System.out.println(linkedlist);
        //Añadir un elemento en un lugar concreto
        linkedlist.add(1, 9669);
        System.out.println(linkedlist);
    }
}
