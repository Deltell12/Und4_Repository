package Mapas;

import java.util.*;

public class Mapas_Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer>Mapa = new HashMap();
        String palabra="";
        Integer cantidad = 0;


        System.out.print("Introduce una cadena: ");
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            Mapa.put(String.valueOf(frase.charAt(i)), cantidad);
        }

        System.out.println(Mapa);


    }
}
