package Ejs_Und6.A;

import java.util.Arrays;
import java.util.Scanner;

public class Und6_Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un numero: ");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        System.out.println("Máximo: "+array[9]);
        System.out.println("Mínimo: "+array [0]);
    }
}