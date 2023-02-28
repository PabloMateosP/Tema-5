package Actividades;

import java.util.Map;
import java.util.TreeMap;

public class Actividad5_3 {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 3, 5, 2, 1, 8, 8, 2, 5, 3};

        // Crea un objeto Map para contar los números
        Map<Integer, Integer> contador = new TreeMap<>();

        // Itera sobre el array de números
        for (int numero : numeros) {
            // Si el número ya está en el mapa, aumenta su contador en 1
            if (contador.containsKey(numero)) {
                contador.put(numero, contador.get(numero) + 1);
            }
            // Si el número no está en el mapa, lo agrega con un contador de 1
            else {
                contador.put(numero, 1);
            }
        }

        // Imprime los resultados en orden ascendente según el valor del número
        for (Map.Entry<Integer, Integer> entrada : contador.entrySet()) {
            System.out.println("El número " + entrada.getKey() + " aparece " + entrada.getValue() + " veces");
        }
    }
}
//Con el método containsKey determinamos si el número(el número va cogiendo uno por uno los valores que tiene el mapa) aparece el mapa.
//El método entry devuelve un conjunto de pares clave - valor contenidos en el mapa.
