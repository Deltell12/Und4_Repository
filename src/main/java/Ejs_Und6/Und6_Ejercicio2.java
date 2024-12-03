package Ejs_Und6;

import java.util.Arrays;
import java.util.Scanner;

public class Und6_Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.print("Ingresa un numero: ");
            array[i] = sc.nextInt();

            num = num + array[i];

        }

        System.out.println(num);
    }
}
