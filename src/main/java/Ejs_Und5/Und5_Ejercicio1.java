package Ejs_Und5;

import java.util.Scanner;

public class Und5_Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }
}
