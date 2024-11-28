package Ejs_Und5;

import java.util.Scanner;

public class Und5_Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        System.out.print("Ingrese otro numero: ");
        int numero2 = entrada.nextInt();
        if (numero == numero2) {
            System.out.println("Ambos numeros son iguales");
        }
        if (numero > numero2) {
            System.out.println("El numero "+numero+" es el mayor");
        }
        else if (numero < numero2) {
            System.out.println("El numero "+numero2+" es el mayor");
        }
    }
}
