package Ejs_Und6;

import java.util.Scanner;

public class Und6_Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int igual = 0;

        double[] array = new double[100];

        for (double i = 0; i <= 1.0; i = (double) (i + 0.01)) {
            array = new double[]{Math.random()};
        }

        System.out.print("Introduce un número real: ");
        double R = sc.nextDouble();

        if (array.equals(R)){
            igual++;
        }
        System.out.println("Hay " + igual + " numeros iguales o superiores a " + R);
    }
}
