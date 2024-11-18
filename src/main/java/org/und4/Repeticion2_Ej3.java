package org.und4;

import java.util.Scanner;

public class Repeticion2_Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t\t");

            }
        }
    }
}
