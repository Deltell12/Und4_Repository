package Ejs_Und7.Práctica_Simples;

import java.util.Arrays;
import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int tamanio = sc.nextInt();

        int[] array = new int[tamanio];

        System.out.println(Arrays.toString(rellenoArray(array)));

    }
    public static int[] rellenoArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
