package Ejs_Und6;

import java.util.Arrays;
import java.util.Scanner;

public class Und6_Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una longitud: ");
        int longi = sc.nextInt();

        int[] array = new int[longi];

        System.out.print("Introduce un valor: ");
        int valor = sc.nextInt();

        Arrays.fill(array, valor);

        System.out.println(Arrays.toString(array));
    }
}
