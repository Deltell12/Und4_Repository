package Ejs_Und10;

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

        Excepciones(array);
    }
    public static void Excepciones (int[] array) {

        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Introduce una posicion: ");
            int posicion1=sc.nextInt();

            System.out.print("Introduce otra posicion: ");
            int posicion2=sc.nextInt();

           double division= (double) array[posicion1] /array[posicion2];
            System.out.println(posicion1+"/"+posicion2+"= "+division);

        }
        catch(InputMismatchException | ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("0");
        }
    }
}
