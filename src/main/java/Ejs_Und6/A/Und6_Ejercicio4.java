package Ejs_Und6.A;

import java.util.Scanner;

public class Und6_Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[20];

        int positivo=0;
        int negativo=0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa un numero: ");
            array[i] = sc.nextInt();

            if (array[i]>=0){
                positivo=positivo+array[i];
            }
            if (array[i]<0){
                negativo=negativo+array[i];
            }
        }
        System.out.println("Suma de número positivos: "+positivo);
        System.out.println("Suma de número negativos: "+negativo);
    }
}