package org.und4;

import java.util.Scanner;

public class Und5_Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero con decimales: ");
        float num = entrada.nextFloat();
        int numero = (int) num;
        System.out.println(numero);
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
}
