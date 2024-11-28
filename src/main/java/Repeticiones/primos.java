package Repeticiones;

import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primo = true;

        System.out.print("Introduce un número entero positivo y mayor 2: ");
        int numero = sc.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }
        if (primo == false) {
            System.out.println("El número " + numero + " no es primo");
        } else {
            System.out.println("El número " + numero + " es primo");
        }
    }
}
