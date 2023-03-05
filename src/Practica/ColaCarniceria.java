package Practica;

import java.util.ArrayList;
import java.util.List;

public class ColaCarniceria {
    public static void main(String[] args) {
        //Para crear nuestra cola de una carnicería.
        // Usaré un arrayList, ya que por inserción el primero que llegue será el primero siempre.
        // Siguiendo así el acrónimo First in First Out

        List <Integer> cola = new ArrayList<>();
        cola.add(0); //Los valores introducidos son el puesto al coger el número de la carnicería
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);
        cola.add(6);

        resto(cola);
    }
    static List <Integer> encolar (List <Integer> cola, Integer nuevoCliente){
        cola.add(nuevoCliente);
        return cola;
    }
    static List <Integer> desencolar (List <Integer> cola, Integer clienteDespachado){
        cola.remove(clienteDespachado);
        return cola;
    }
    static List <Integer> frente (List <Integer> cola){
        System.out.println(cola.get(0));
        return cola;
    }
    static List <Integer> resto (List <Integer> cola){
        //Creamos una copia de la cola original para así no afectarla. Entonces el primer puesto de la copia de nuestra
        //cola original para así poder imprimir todos los clientes menos el del frente
        List<Integer> copiaCola = new ArrayList<>();
        copiaCola.addAll(cola);
        copiaCola.remove(0);
        System.out.println(copiaCola);
        return cola;
    }
    static List <Integer> limpiar (List <Integer> cola){
        cola.clear();
        return cola;
    }
    static List <Integer> esVaciar (List <Integer> cola){
        if (cola.size() == 0){
            System.out.println("La cola de clientes está vacía.");
        } else {
            System.out.println("La cola no está vacía.");
        }
        return cola;
    }
    static List <Integer> longitud (List <Integer> cola){
        System.out.println("El tamaño de la cola es de: " + cola.size() + " cliente.");
        return cola;
    }
}
