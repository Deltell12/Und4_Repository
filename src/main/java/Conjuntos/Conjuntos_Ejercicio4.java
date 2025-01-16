package Conjuntos;

import java.util.ArrayList;

public class Conjuntos_Ejercicio4 {
    public static void main(String[] args) {

        ArrayList<Integer> conjuntos= new ArrayList<>();

        for(int i=1; i<=10; i++){
            conjuntos.add((int) (Math.random()*10));
        }
        System.out.println(conjuntos);
    }
}
