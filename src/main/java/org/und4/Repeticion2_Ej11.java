package org.und4;

import java.util.Scanner;

public class Repeticion2_Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        int n1 = sc.nextInt();
        int cont = 1;
        int errores=0;

        for (int i = n1 ; i != 0; i++) {
            cont++;
            System.out.print("Número " + cont + ": ");
            int n2 = sc.nextInt();

            if (n2<=n1) {
                errores++;
                System.out.println("Fallo! Errores = "+errores);
                cont--;
                System.out.println("Número "+cont +": ");
            }

            else if (n2>n1){
                cont++;
            }
        }

        int validos= cont-errores;
        System.out.println("Total de números introducidos: "+cont);
        System.out.println("Total de números válidos: "+validos);
        System.out.println("Total de fallos: "+errores);
    }
}
