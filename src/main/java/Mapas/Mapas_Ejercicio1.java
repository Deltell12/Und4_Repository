package Mapas;

import java.util.*;

public class Mapas_Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String frase = sc.nextLine();

        String[] palabra = frase.split(" ");
        Map<String, Integer>Mapa = new HashMap();

        Integer cantidad = 0;




        for (String s : palabra) {
            if (Mapa.containsKey(s)) {
                cantidad++;
            }
            Mapa.put(s, cantidad);
        }

        for (Map.Entry<String, Integer> entry : Mapa.entrySet()) {
            System.out.println(entry.getKey() + "- >" + entry.getValue());
        }



    }
}
