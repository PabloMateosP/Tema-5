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

        System.out.println("PilaProducto");

        Pila pilaProducto = new Pila();

        pilaProducto.apilar("María");
        pilaProducto.apilar("Gilberto");
        pilaProducto.apilar("Pepa");

        System.out.println(pilaProducto);

        pilaProducto.longitud();
        pilaProducto.apilar("Samuel");
        pilaProducto.longitud();

        System.out.println(pilaProducto.cima());

        pilaProducto.desapilar();
        System.out.println(pilaProducto);


        pilaProducto.limpiar();
        System.out.println(pilaProducto);

        System.out.println(pilaProducto.esVacia());
    }
}
