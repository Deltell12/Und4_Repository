package Ejs_Und6.A;

import java.util.Arrays;
import java.util.Scanner;

public class Und6_Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la longitud del array: ");
        int longi = sc.nextInt();

        int[] array = new int[longi];

        System.out.print("Introduce el valor inicial: ");
        int valor = sc.nextInt();

        System.out.print("Introduce la incrementación: ");
        int incrementacion = sc.nextInt();

        int suma = valor;

        for (int i = 0; i < longi; i++) {
            array[i] = suma;
            suma= suma+incrementacion;
        }
        System.out.println(Arrays.toString(array));
    }
}
