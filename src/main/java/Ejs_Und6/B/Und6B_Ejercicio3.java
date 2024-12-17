package Ejs_Und6.B;

import java.util.Arrays;
import java.util.Scanner;

public class Und6B_Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            System.out.print("Introduce un nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Introduce el primer apellido: ");
            String ap1 = sc.nextLine();

            System.out.print("Introduce el segundo apellido: ");
            String ap2 = sc.nextLine();

            String cod = nombre.substring(0, 3).toUpperCase();
            String cod2 = ap1.substring(0, 3).toUpperCase();
            String cod3 = ap2.substring(0, 3).toUpperCase();

            String union=cod+cod2+cod3;

            String[] array= union.split(" ");

            System.out.println(Arrays.toString(array));
    }
}
