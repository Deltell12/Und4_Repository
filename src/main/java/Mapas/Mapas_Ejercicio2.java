package Mapas;

import java.sql.Array;
import java.util.*;

public class Mapas_Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] array = frase.split(" ");

        Map<String, List> mapa = new HashMap<>();
        int posicion = 0;


        for (String palabra : frase.split(" ")) {
            if (!mapa.containsKey(palabra)) {
                mapa.put(palabra, new ArrayList<>());
            }

            mapa.get(palabra).add(posicion);
            posicion++;

        }
        System.out.println("Posiciones de las palabras: ");
        for (Map.Entry<String, List> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}