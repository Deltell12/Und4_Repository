package Ejs_Und6.B;

import java.util.Scanner;

public class Und6B_Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;

        String[] frases = new String[frase.length()];

        for (int num = 0; num < frase.length(); num++) {
            String vocales= frase.substring(i, i + 1);

            switch (vocales){
                case "a":
                    a++;
                    break;
                case "e":
                    e++;
                    break;
                case "i":
                    i++;
                    break;
                case "o":
                    o++;
                    break;
                case "u":
                    u++;
                    break;
            }
        }
        System.out.println("El número de 'a' es: " + a);
        System.out.println("El número de 'e' es: " + e);
        System.out.println("El número de 'i' es: " + i);
        System.out.println("El número de 'o' es: " + o);
        System.out.println("El número de 'u' es: " + u);
    }
}
