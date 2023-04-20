package Practica;

import java.util.ArrayList;
import java.util.List;

import static Practica.Cola.*;

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

        encolar(cola, 6);
        desencolar(cola, 5);
        frente(cola);
        limpiar(cola);
        esVaciar(cola);
        longitud(cola);
        resto(cola);
    }

}
