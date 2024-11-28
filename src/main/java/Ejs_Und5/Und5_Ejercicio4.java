package Ejs_Und5;

import java.util.Scanner;

public class Und5_Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        System.out.print("Ingrese otro numero: ");
        int numero2 = entrada.nextInt();
        System.out.print("Ingrese otro numero: ");
        int numero3 = entrada.nextInt();
        if (numero == numero2 || numero == numero3 || numero2 == numero3) {
            System.out.println("Los numeros tienen que ser distintos");
        }
        else {
            if (numero > numero2 && numero > numero3) {
                System.out.println("El numero " + numero + " es el mayor");
            }

            if (numero < numero2 && numero3 < numero2) {
                System.out.println("El numero " + numero2 + " es el mayor");
            }
            else if (numero > numero2 && numero < numero3 || numero < numero2 && numero3 > numero2) {
                System.out.println("El numero " + numero3 + " es el mayor");
            }
        }
    }
}
