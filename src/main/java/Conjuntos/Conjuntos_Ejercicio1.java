package Conjuntos;

import java.util.*;

public class Conjuntos_Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<Integer> conjuntos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            conjuntos.add((int) (Math.random()*100));
        }
        System.out.println("Lista original: "+conjuntos);
        Set<Integer> ordenado = new TreeSet<>(conjuntos);
        System.out.println("Lista ordenado (creciente): "+ordenado);
    }
}
