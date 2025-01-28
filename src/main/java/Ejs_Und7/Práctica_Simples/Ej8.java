package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        System.out.println(suma1aN(n));
        System.out.println(producto1aN(n));
    }
    public static int suma1aN (int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
    public static int producto1aN (int n) {
        int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto *= i;
        }
        return producto;
    }
}
