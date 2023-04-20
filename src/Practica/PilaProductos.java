package Practica;

import java.util.Stack;

import static Practica.Pila.*;

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

        String bateria = "Bateria0.8";

        apilar(productos, bateria);
        desapilar(productos, bateria);
        cima(productos);
        limpiar(productos);
        esVacia(productos);
        longitud(productos);

    }

}
