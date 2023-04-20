package Practica;

import java.util.Stack;

public class Pila {
    static void apilar (Stack<String> productos, String nuevoProducto){
        productos.push(nuevoProducto);
    }
    static void desapilar (Stack<String> productos, String productoEliminado){
        productos.remove(productoEliminado);
    }
    static void cima (Stack<String> productos){
        System.out.println(productos.get(0));
    }
    static void limpiar (Stack<String> productos){
        productos.pop();
    }
    static void esVacia (Stack<String> productos){
        if (productos.size() == 0){
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("La pila no está vacía.");
        }
    }
    static void longitud (Stack<String> productos){
        System.out.println(productos.size());
    }
}
