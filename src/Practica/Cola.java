package Practica;

import java.util.ArrayList;
import java.util.List;

public class Cola {
    static List<Integer> encolar (List <Integer> cola, Integer nuevoCliente){
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
