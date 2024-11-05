package org.und4;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el dividendo (entero): ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el divisor (entero): ");
        int num2 = entrada.nextInt();
        int c= num1/num2;
        int r= num1%num2;
        System.out.println(num1+" entre "+num2+" da un cociente de "+c+" y un resto de "+r);

    }
}
