package org.und4;

import java.util.Scanner;

public class Repeticion2_Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        int acum=1;

        for (int cont = 1; cont <= n; cont++) {
            System.out.println();

            for (int mult = 1; mult <= n; mult++) {

                int tabla = acum * mult;
                System.out.print(tabla + "\t\t");
            }
            acum++;
        }
    }
}
