package Ejs_Und5;

import java.util.Scanner;

public class Und5_Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        if (numero>=0) {
            System.out.println("El numero es positivo");
        }
        else {
            System.out.println("El numero es negativo");
        }
    }
}
