package Ejs_Und10;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {


        int tamanio= 5;
        int[] vector = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Introduce un valor: ");
                vector[i] = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Debes introducir un valor entero");
                tamanio++;
                continue;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
        mostrarVector(vector);
    }
    public static void mostrarVector(int[] vector) {

        System.out.println(Arrays.toString(vector));

    }
}
