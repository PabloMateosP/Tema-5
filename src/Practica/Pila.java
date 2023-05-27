package Practica;

import java.util.Stack; //Cambiamos de la clase stack a likedlist
//Todo: hacer una clase pila como tal y cambiar el tipo de stack a likedlist: -- Hecho

import java.util.LinkedList;
import java.util.List;

public class Pila {
    private List<String> pila = new LinkedList<String>();

    public void apilar(String persona){
        pila.add(persona);
    }

    public void desapilar(){
        pila.remove(pila.size() - 1);
    }

    public String cima(){
        return (pila.get(pila.size() - 1));
    }

    public void limpiar(){
        pila.clear();
    }

    public boolean esVacia(){
        return pila.isEmpty();
    }

    public int longitud(){
        return (pila.size());
    }

    @Override
    public String toString() {
        return pila.toString();
    }
}
