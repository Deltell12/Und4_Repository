package Ejs_Und4;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num= entrada.nextInt();
        int suma= (num*(num+1))/2;
        System.out.println("La suma de los primeros números enteros desde 1 hasta "+num+" es "+suma);
    }
}
