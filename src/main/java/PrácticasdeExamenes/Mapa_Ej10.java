package PrácticasdeExamenes;

import java.util.*;

public class Mapa_Ej10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Map<String, String> mapa = new HashMap<>();
        mapa.put("España", "Madrid");
        mapa.put("Portugal", "Lisboa");
        mapa.put("Francia", "París");

        System.out.print("Escribe el nombre de un país y te diré su capital: ");
        String pais = entrada.next();

        while (!pais.equals("salir")) {
            if (mapa.containsKey(pais)) {
                Set<Map.Entry<String,String>> entry= mapa.entrySet();
                System.out.println("La capital de " +mapa.getVa+ "es "+mapa.get(pais));


            }
            else {
                System.out.println("No conozco la respuesta ¿cuál es la capital de " + pais + "?");
                String respuesta = entrada.next();
                mapa.put(pais, respuesta);
            }
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = entrada.next();
        }
    }
}
