package Conjuntos;

import java.util.*;

public class Conjuntos_Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> conjunto1= new TreeSet<>();
        Set<Integer> conjunto2= new TreeSet<>();

        System.out.println("Introduce el primer conjunto de números separados por comas: ");
        String frase1 = sc.nextLine();
        String split[]= frase1.split(",");

        for (int i = 0; i < split.length; i++) {
            conjunto1.add(Integer.valueOf(split[i]));
        }

        TreeSet<Integer> interseccion= new TreeSet<>(conjunto1);
        Set<Integer> union= new TreeSet<Integer>(conjunto1);

        System.out.println("Introduce el segundo conjunto de números separados por comas: ");
        String frase2 = sc.nextLine();
        String split2[]= frase2.split(",");

        for (int i = 0; i < split2.length; i++) {
            conjunto2.add(Integer.valueOf(split2[i]));
        }

        interseccion.retainAll(conjunto2);
        System.out.println("Intersección: "+interseccion);

        union.addAll(conjunto2);
        System.out.println("Unión: "+union);
    }
}