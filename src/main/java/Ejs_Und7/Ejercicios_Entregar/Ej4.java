package Ejs_Und7.Ejercicios_Entregar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lista 1 (separada por comas): ");
        String linea = sc.nextLine();
        String[] lista1 = linea.split(",");

        System.out.print("Lista 2 (separada por comas): ");
        String linea2 = sc.nextLine();
        String[] lista2 = linea2.split(",");

        System.out.println("Lista combinada: "+combinarListas(lista1,lista2));

    }

    public static List<String> combinarListas(String[] lista1, String[] lista2) {

        List<String> combinar = new ArrayList<>();

        for (int i = 0; i < lista1.length; i++) {

            combinar.add(lista1[i]);

            combinar.add(lista2[i]);


        }
        return combinar;
    }
}
