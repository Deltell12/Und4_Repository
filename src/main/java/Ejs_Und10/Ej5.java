package Ejs_Und10;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) throws posicion2EsZero {

        int tamanio = 10;

        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            array[3] = 0;
        }

        System.out.println("Array: " + Arrays.toString(array));
        try {
            System.out.println("El resultado de la division es: " + preguntarPosiciones(array));
        }
        catch (posicion2EsZero e) {
            System.out.println(e.getMessage());
            System.out.println(0);
        }
    }

    public static double preguntarPosiciones(int[] array) throws posicion2EsZero {

        double division = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce una posicion: ");
            int posicion1 = sc.nextInt();

            System.out.print("Introduce otra posicion: ");
            int posicion2 = sc.nextInt();

            division = (double) array[posicion1 - 1] / array[posicion2 - 1];

            if (array[posicion2-1] == 0) {
                throw new posicion2EsZero("Error, no se puede dividir entre 0.");
            }

        } catch (InputMismatchException e)  {
            System.out.println("Error, debes de poner un número entero.");
            return 0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error, te has pasado del límite.");
        }
        return division;
    }
}
 class posicion2EsZero extends Exception{
    public posicion2EsZero(String mensaje) {
        super(mensaje);
    }
 }