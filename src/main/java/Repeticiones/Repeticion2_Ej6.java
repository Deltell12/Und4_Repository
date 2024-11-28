package Repeticiones;

import java.util.Scanner;

public class Repeticion2_Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();
        int mults=0;
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                mults++;
            }
        }
        System.out.println("Cantidad de múltiplos de 3: " + mults);
    }
}
