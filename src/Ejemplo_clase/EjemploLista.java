package Ejemplo_clase;

import java.util.ArrayList;

public class EjemploLista {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Seat");
        cars.add("Volkswagen");
        cars.add("Renault");
        System.out.println(cars);

        System.out.println(cars.get(2));
        //get nos coge por inserción el número que pongamos sabiendo que empieza por 0

        cars.remove(0);
        //Con el remove quitamos el elemento del indice introducido
        System.out.println(cars);
        System.out.println(" ");

        System.out.println(cars.remove("Seat")); //Nos dirá true o false dependiendo de si ha podido completar o no.
        cars.remove("Seat");
        System.out.println(cars);

        cars.set(2, "Ferrari"); //Con el set nos cambia lo que se encuentra en el número de ese indice por el string que introduzcamos
        System.out.println(cars);
    }
}
