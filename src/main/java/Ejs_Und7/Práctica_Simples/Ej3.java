package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor: ");
        int val1 = sc.nextInt();
        System.out.print("Introduce otro valor: ");
        int val2 = sc.nextInt();

        System.out.println("El máximo valor entre "+val1+" y "+val2+" es: "+minimo(val1, val2));
    }

    public static int minimo(int val1, int val2) {
        if (val1 > val2) {
            return val1;
        }
        return val2;
    }
}
