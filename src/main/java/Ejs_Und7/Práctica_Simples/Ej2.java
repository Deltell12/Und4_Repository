package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (mayoriaEdad(edad)) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("No eres mayor de edad");
        }

    }

    public static boolean mayoriaEdad(int edad) {
        return edad >= 18;
    }
}
