package org.und4;

import java.util.Scanner;

public class Repeticion2_Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas notas vas a introducir? ");
        int n = sc.nextInt();
        float media=0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Dime número "+i+": ");
            float num = sc.nextFloat();
            media += num;
        }
        media=media/n;
        System.out.println("La media de todas las notas es: "+media);
    }
}
