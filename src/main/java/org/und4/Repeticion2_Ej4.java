package org.und4;

import java.util.Scanner;

public class Repeticion2_Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = sc.nextInt();
        if (numero>=0) {
            for (int i = 1; i<=numero; i++) {
                System.out.print("*");
            }
        }
        else {
            for (int i = 0; i>=numero; i--) {
                System.out.print("#");
            }
        }
    }
}
