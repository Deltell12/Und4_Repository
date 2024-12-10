package Ejs_Und6;

import java.util.Arrays;
import java.util.Scanner;

public class Und6_Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un valor: ");
            int valor= sc.nextInt();
            array1[i] = valor;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un valor: ");
            int valor= sc.nextInt();
            array2[i] = valor;
        }

        if (Arrays.equals(array1,array2)) {
            System.out.println("Ambos arrays son iguales");
        }

        else {
            System.out.println("Ambos arrays son diferentes");
        }
    }
}