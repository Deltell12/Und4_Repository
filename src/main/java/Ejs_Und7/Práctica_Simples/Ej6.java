package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            System.out.print("Introduce un precio: ");
            double precio = sc.nextDouble();
            System.out.println("Precio con IVA: "+IVA(precio));            System.out.println();
        }
    }
    public static double IVA (double precio) {
        double IVA = precio*0.21;
        return precio+IVA;
    }
}
