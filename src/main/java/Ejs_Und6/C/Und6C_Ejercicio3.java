package Ejs_Und6.C;

import java.util.Scanner;

public class Und6C_Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la matriz: ");
        int altura = sc.nextInt();

        System.out.print("Introduce la longitud de la matriz: ");
        int longitud = sc.nextInt();

        int[][] matriz = new int[altura][longitud];
        int limite = 0;
        int valores = 0;

        for (valores = 0; valores < matriz[0].length; valores++) {

            for (limite = 0; limite < matriz[valores].length; limite++) {

                System.out.print("Introduce un valor: ");
                matriz[valores][limite] = sc.nextInt();

            }
        }
        System.out.print(matriz[valores][limite]);
    }
}
