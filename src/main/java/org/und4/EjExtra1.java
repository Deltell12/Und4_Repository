package org.und4;

import java.util.Scanner;

public class EjExtra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String L = "Sistemas Informáticos";
        String Ma = "Lenguaje de Marcas";
        String Mi = "Entornos de Desarrollo";
        String J = Mi;
        String V = "Programación";
        System.out.print("Introduce un dia: ");
        String dia = sc.nextLine();
        if (dia.charAt(0) == 'L') {
            System.out.println("A primera toca: " +L);
        }
        if (dia.charAt(0) == 'M'&&dia.charAt(1) == 'a') {
            System.out.println("A primera toca: " +Ma);
        }
        if (dia.charAt(0) == 'M'&&dia.charAt(1) == 'i') {
            System.out.println("A primera toca: " +Mi);
        }
        if (dia.charAt(0) == 'J') {
            System.out.println("A primera toca: " +J);
        }
        else if (dia.charAt(0) == 'V') {
            System.out.println("A primera toca: " +V);
        }
    }
}
