package Conjuntos;

import java.util.*;

public class Conjuntos_Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> lista = new HashSet<>();
        Iterator<String> iterador = lista.iterator();

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        frase.split(", ");
        lista.add(frase);




        System.out.println(lista);

    }
}