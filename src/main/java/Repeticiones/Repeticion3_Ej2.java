package Repeticiones;

import java.util.Scanner;

public class Repeticion3_Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        System.out.print("Ingrese otro numero entero: ");
        int numero2 = sc.nextInt();

        if (numero >= numero2) {
            System.out.println("Error, el segundo número tiene que se mayor al primero");
        }

        for (int i=numero; i<=numero2; i+=numero) {
            System.out.print(i+"\t");
        }

        System.out.println();

        for (int i= numero2; i>=numero; i-=numero) {
            System.out.print(i+"\t");
        }
    }
}
