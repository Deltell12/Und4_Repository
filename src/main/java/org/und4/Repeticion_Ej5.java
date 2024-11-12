package org.und4;

import java.util.Scanner;

public class Repeticion_Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();
        int fact=numero;
        for (int i = numero-1; i >= 1; i--) {
            numero= numero*i;
        }
        System.out.println(fact+"!: "+numero);
    }
}

