package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Listas_Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        int total=0;

        int longi= 10+(int) (Math.random() * 11);

        for (int i =1; i < longi; i++) {
            lista.add((int) (Math.random()*100));
        }

        Iterator<Integer> iterador = lista.iterator();

        while (iterador.hasNext()) {
            total += iterador.next();
        }

        int media= total/lista.size();

        System.out.println("Lista generada : "+lista);
        System.out.println("La suma total es : "+total);
        System.out.println("La media es : "+media);
        System.out.println("El mínimo es : "+Collections.min(lista));
        System.out.println("El máximo es : "+Collections.max(lista));

    }
}
