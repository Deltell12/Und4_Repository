package Conjuntos;

import java.util.ArrayList;
import java.util.Collections;

public class Conjuntos_Ejercicio2 {
    public static void main(String[] args) {

        ArrayList<Integer> conjuntos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            conjuntos.add((int) (Math.random()*100));
        }
        System.out.println("Lista original: "+conjuntos);
        Collections.sort(conjuntos, Collections.reverseOrder());
        System.out.println("Lista ordenado (decreciente): "+conjuntos);
    }
}