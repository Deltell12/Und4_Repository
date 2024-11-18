package org.und4;

import java.util.Scanner;

public class Repeticion2_Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();

        System.out.print("Introduce una letra: ");
        String letra = sc.nextLine();
        letra = letra.toLowerCase();

        char let=letra.charAt(0);
        int longfrase=frase.length();

        int cont=0;

        for (int i = 0; i < longfrase; i++) {
            if (frase.charAt(i) == let) {
                cont++;
            }
        }
        System.out.println("La letra '"+letra+"' aparece "+cont+" veces en la frase' "+frase);
    }
}
