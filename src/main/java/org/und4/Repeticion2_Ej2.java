package org.und4;

import java.util.Scanner;

public class Repeticion2_Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu año de nacimiento: ");
        int nacimiento = sc.nextInt();

        int cont=1;
        int anios=2023;

        for (int i=nacimiento; i<=anios; i++) {
            System.out.println("Has cumplido "+cont+" años");
            cont++;
        }
    }
}
