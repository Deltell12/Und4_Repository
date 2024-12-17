package Ejs_Und6.B;

import java.util.Scanner;

public class Und6B_Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.next();
        frase = frase.toLowerCase();

       char [] array = frase.toCharArray();

        String alreves="";

        for (int i = frase.length(); i > 0; i--) {
            alreves= new String(array);
        }

        boolean comparacion;
        comparacion = frase.equals(alreves);

        if (comparacion) {
            System.out.println("La frase es palíndromo");
        }
        else {
            System.out.println("La frase no es palindromo");
        }
    }
}
