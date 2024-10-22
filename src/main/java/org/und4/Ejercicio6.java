package org.und4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String lado;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la medida de un lado: ");
        int lad = entrada.nextInt();
        System.out.println("El área del cuadrado es: "+lad*lad);


    }
}
