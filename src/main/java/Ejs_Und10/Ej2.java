package Ejs_Und10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce un valor: ");
            int valor1 = sc.nextInt();

            System.out.print("Introduce otro valor: ");
            int valor2 = sc.nextInt();

            double division = (double) valor1 / valor2;

            System.out.println("El resultado de la division es: " + division);
        }

        catch (ArithmeticException e) {
            System.out.println("Error, has intentado dividir entre 0");
        }

        catch (InputMismatchException e) {
            System.out.println("Error, debes de poner numeros enteros.");
        }
    }
}