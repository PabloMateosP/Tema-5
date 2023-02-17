package Ejemplo_clase;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemploListaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(14);
        numeros.add(17);
        numeros.add(54);
        numeros.add(34);
        numeros.add(21);
        numeros.add(15);
        numeros.add(52);

        ListIterator<Integer> it = numeros.listIterator();


        while(it.hasNext()){
            Integer i = it.next();
            if(i < 17){
                it.remove();
            }
        }
        System.out.println(numeros);
        while(it.hasPrevious()){
            Integer o = it.previous();
            if(o < 20){
                it.remove();
            }
            if (o == 34){
                it.add(10);
            }
        }
        System.out.println(numeros);
    }

}
