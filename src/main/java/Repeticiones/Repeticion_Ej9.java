package Repeticiones;

import java.util.Scanner;

public class Repeticion_Ej9 {
    public static void main(String[] args) {
        int i;
        int suma = 0;
        int mult = 1;
        for (i = 1; i <= 10; i++) {
            suma = suma + i;
        }
        for (i = mult; i <= 10; i++) {
            mult = mult * i;
        }
        System.out.println(suma);
        System.out.println(mult);
    }

    public static class primos2 {
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
}

