package org.und4;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        String n1;
        String n2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
       double num1 = entrada.nextDouble();
        System.out.println("Ingrese otro numero: ");
        double num2 = entrada.nextDouble();
        double suma = num1 + num2;
        double resta = num1 - num2;
        double div = suma / resta;
        double mult= num1 * num2;
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La div de los numeros es: " + div);
        System.out.println("La mult de los numeros es: " + mult);
    }
}
