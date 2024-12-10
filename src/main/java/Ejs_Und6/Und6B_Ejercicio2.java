package Ejs_Und6;

import java.util.Arrays;
import java.util.Scanner;

public class Und6B_Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        frase = frase.toUpperCase();

        System.out.print("Introduce otra frase: ");
        String frase2 = sc.nextLine();
        frase2 = frase2.toUpperCase();

        String[] array = frase.split(" ");
        String[] array2 = frase2.split(" ");

        if(Arrays.equals(array, array2)){
            System.out.println("Ambas frases son iguales");
        }
    }
}
