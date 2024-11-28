package Ejs_Und5;

import java.util.Scanner;

public class Und5_Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        System.out.print("Ingrese otro numero: ");
        int numero2 = entrada.nextInt();
        if (numero>numero2) {
            System.out.println(numero+", "+numero2);
        }
        if (numero<numero2) {
        System.out.println(numero2+", "+numero);
        }
        else if (numero==numero2) {
            System.out.println("Ambos numeros son iguales");
        }
    }
}
