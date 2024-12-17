package Ejs_Und6.B;

import java.util.Scanner;

public class Und6B_Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        String precio = sc.next();

        String[] array= precio.split(",");

        int euros = Integer.parseInt(array[0]);
        int centimos = Integer.parseInt(array[1]);

        System.out.println("Euros: "+euros);
        System.out.println("Centimos: "+centimos);

    }
}

