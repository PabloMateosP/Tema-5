package Ejemplo_clase;


import java.util.*;

//  22-02-2023
public class EjemploMap {
    public static void main(String[] args) {
        HashMap<Integer, String> a = new HashMap<>();
        a.put(1, "A");
        a.put(2, "B");
        a.put(3, "C");
        a.put(4, "D");
        a.put(5, "E");

        //Imprimimos la posición 3
        System.out.println(a.get(3));

        System.out.println(a);

        //Modificar la clave 4
        a.replace(4, "F");
        System.out.println(a);

        //Eliminamos el elemento 4
        System.out.println("El elemento eliminado es: " + a.remove(4));

        //Con el método clear podremos borrar completamente todos los valores del map
        //a.clear();

        //Con el containsValue podemos comprobar si un valor se encuentra dentro
        if (!a.containsValue("F")){ //Ponemos la exclamación para negar si ésta el valor
            System.out.println("La letra F no está en el map");
        } else {
            System.out.println("La letra F está en el map");
        }

        //También podríamos hacer un constainsKey
        if (!a.containsKey(4)){ //Ponemos la exclamación para negar si ésta el valor
            System.out.println("La 4º clave no está en el map");
        } else {
            System.out.println("La 4º clave está en el map");
        }

        //Para hacer un recorrido sobre el conjunto de los valores de nuestro mapa
        Collection<String> aLista = a.values();
        Iterator aListIterator = aLista.iterator();
        //Le decimos que mientras haya un siguiente valor, que lo imprima.
        while (aListIterator.hasNext()){
            System.out.println(aListIterator.next());
        }

        //Con el método isEmpty vemos si nuestro mapa está vacío o no
        System.out.println(a.isEmpty());

        //Con él .size vemos el tamaño de nuestro mapa
        System.out.println(a.size());

        a.put(null, "Z");
        System.out.println(a);

        //Vemos como se ordena por orden de inserción
        LinkedHashMap <Integer, String> b = new LinkedHashMap();
        b.put(1,"A");
        b.put(3,"C");
        b.put(4,"D");
        b.put(2,"B");
        b.put(5,"E");

        System.out.println(b);

        //Con el método putAll podemos coger los valores de otro mapa e introducirlo en el nuevo
        System.out.println(b.values());

        TreeMap <Integer, String> c = new TreeMap<>();
        c.put(5, "Suficiente");
        c.put(6, "Bien");
        c.put(7, "Notable Bajo");
        c.put(8, "Notable Alto");
        c.put(9, "Sobresaliente Bajo");
        c.put(10, "Sobresaliente Alto");

        System.out.println(c.values());

        System.out.println(c.get(c.firstKey()));

        //Obtener el elemento que está justo después de "Notable bajo"
        System.out.println(c.higherEntry(7));

    }
}
