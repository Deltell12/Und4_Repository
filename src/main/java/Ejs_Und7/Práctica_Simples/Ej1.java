package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double a = sc.nextDouble();

        System.out.print("Introduce otro número: ");
        double b = sc.nextDouble();

        System.out.println(multiplicacion(a, b));
    }

    public static double multiplicacion (double a, double b) {
        return a * b;

    }
}
