package Ejs_Und10;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        int tamanio=10;

        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10);
        }

        System.out.println("Array: "+Arrays.toString(array));

        System.out.println("El resultado de la division es: "+Excepciones(array));
    }
    public static double Excepciones (int[] array) {

        double division = 0;
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Introduce una posicion: ");
            int posicion1=sc.nextInt();

            System.out.print("Introduce otra posicion: ");
            int posicion2=sc.nextInt();

            division= (double) array[posicion1] /array[posicion2];


        }
        catch(InputMismatchException | ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Error");
        }
        return division;
    }
}