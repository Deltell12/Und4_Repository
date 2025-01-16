package Conjuntos;

import java.util.*;

public class Conjuntos_Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> nombres= new ArrayList<>();

        String palabra="fin";

        System.out.println("Introduce nombres (si escribes 'fin' se termina el programa): ");

        while (!nombres.contains(palabra)) {
            nombres.add(sc.next());
        }
        nombres.remove(palabra);
        Collections.sort(nombres);
        Set<String> cambio = new TreeSet<>(nombres);
        System.out.println("Lista de nombres únicos: " + cambio);
    }
}
