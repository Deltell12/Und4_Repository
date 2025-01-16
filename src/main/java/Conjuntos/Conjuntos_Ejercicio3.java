package Conjuntos;

import java.util.*;

public class Conjuntos_Ejercicio3 {
    public static void main(String[] args) {

       TreeSet<Integer> conjuntos = new TreeSet<>(Comparator.reverseOrder());


        for (int i = 1; i <= 10; i++) {
            conjuntos.add((int) (Math.random()*100));

        }
            System.out.println("Lista ordenada (decreciente, números únicos): " + conjuntos);
        }
    }

