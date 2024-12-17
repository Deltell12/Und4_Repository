package Ejs_Und6.B;

import java.util.Scanner;

public class Und6B_Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String palabra = entrada.nextLine();

        String[] palabras = palabra.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
}
