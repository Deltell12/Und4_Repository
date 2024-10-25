package org.und4;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = entrada.nextInt();
        if (numero>=0)
        {
            System.out.println("El numero es positivo");
        }
        else
        {
            System.out.println("El numero es negativo");
        }
    }
}
