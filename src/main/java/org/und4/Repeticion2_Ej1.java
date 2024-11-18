package org.und4;

import java.util.Scanner;

public class Repeticion2_Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un palabra: ");
        String palabra = sc.nextLine();

        int longitud = palabra.length();

        longitud=Math.divideExact(longitud, 2);

        for (int i = 0; i<longitud; i++) {
            System.out.println(palabra);
        }
    }
}
