package Conjuntos;

import java.util.*;

public class Conjuntos_Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<String> nombres= new LinkedHashSet<>();

        String palabra="fin";

        System.out.println("Introduce nombres (si escribes 'fin' se termina el programa): ");

        while (!nombres.contains(palabra)) {
            nombres.add(sc.next());
        }
        nombres.remove(palabra);
        System.out.println("Lista de nombres únicos: " + nombres);
    }
}