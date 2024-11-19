package org.und4;

import java.util.Scanner;

public class Repeticion2_Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();

        System.out.print("Introduce el carácter de relleno: ");
        String caracter = sc.next();

        int relleno= 1;

        for (int i = 1; i <= altura; i++) {
            System.out.print(caracter);
            System.out.println();

        }
    }
}
