package Practica;

import java.util.Stack;

public class PilaProductos {
    public static void main(String[] args) {
        //Nos situaremos en el hecho de que somos una empresa la cual vendemos baterías recargables, siempre en constante
        // innovación siendo así nuestros productos más nuevos lo que buscamos vender antes, ya que son los de mejor calidad.
        //Por lo tanto, los modelos de baterías más antiguas tendrán una menor publicidad así como menor muestra en tienda.

        //Mediante búsqueda en Internet encontré que el mejor tipo de dato para almacenar con el método LIFO sería el stack
        //Mediante esta clase podremos guardar nuestras baterías haciendo que la primera en añadir sea la última de nuestra lista.
        Stack<String> productos = new Stack<>();
        productos.push("Bateria0.1");
        productos.push("Bateria0.2");
        productos.push("Bateria0.3");
        productos.push("Bateria0.4");
        productos.push("Bateria0.5");
        productos.push("Bateria0.6");
        productos.push("Bateria0.7");

        longitud(productos);
    }
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
