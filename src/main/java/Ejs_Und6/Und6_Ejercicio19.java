package Ejs_Und6;

import java.util.Arrays;
import java.util.Scanner;

public class Und6_Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
        System.out.print("Introduce tu puntuación: ");
        int puntuacion = sc.nextInt();

            array[i] = puntuacion;
        }
        Arrays.sort(array);
        for (int i = 7; i >=0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
