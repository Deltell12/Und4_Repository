package Repeticiones;

import java.util.Scanner;

public class Repeticion2_Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce otro numero: ");
        int n2 = sc.nextInt();
        int par=0;
        while (n1>=n2) {
            System.out.print("El número 2 debe ser mayor que el número 1, vuelve a introducirlo: ");
            n2 = sc.nextInt();
        }
        for (int i = n1; i <= n2; i++) {
            if (i==n2){
                System.out.println(i);
            }
            else {
                System.out.print(i + " - ");
            }


            if (i%2==0){
                par++;
            }
            else{}
        }
        System.out.println();
        System.out.println("La cantidad de numeros pares es: "+par);
    }
}
