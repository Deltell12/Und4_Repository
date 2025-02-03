package Ejs_Und7.Ejercicios_Entregar;

import java.util.*;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> palabras = new ArrayList<String>();
        palabras.add("auto");
        palabras.add("elefante");
        palabras.add("iglesia");
        palabras.add("oso");
        palabras.add("uva");
        palabras.add("abeja");

        System.out.println("Palabras agrupadas por vocal inicial: ");
        for (Map.Entry<String, List<String>> entry : filtrarPorVocal(palabras).entrySet()) {
            System.out.println(entry);
        }
    }

    public static Map<String, List<String>> filtrarPorVocal(List<String> palabras) {

        Map<String, List<String>> vocales = new HashMap<>();

        for (String palabra : palabras) {
            String vocal= String.valueOf(palabra.charAt(0));

            switch (vocal) {
                case "a","e", "u", "o", "i":
                    if (!vocales.containsKey(String.valueOf(vocal))) {
                        vocales.put(String.valueOf(vocal), new ArrayList<>());
                    }
                    vocales.get(String.valueOf(vocal)).add(palabra);
                    break;
            }
        }
        return vocales;
    }
}