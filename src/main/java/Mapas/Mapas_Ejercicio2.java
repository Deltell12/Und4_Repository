package Mapas;

import java.util.*;

public class Mapas_Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<String>();
        HashMap<String, List> mapa = new HashMap<>();
        int posicion = 0;

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            lista.add(String.valueOf(frase.charAt(i)));
            Collections.binarySearch(lista, String.valueOf(frase.charAt(i)));
            mapa.put(String.valueOf(frase.charAt(i)), lista);
        }
        System.out.println(mapa);
    }
}
