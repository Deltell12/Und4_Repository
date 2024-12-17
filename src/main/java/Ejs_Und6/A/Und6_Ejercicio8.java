package Ejs_Und6.A;

import java.util.Scanner;

public class Und6_Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;

        do{
            System.out.print("Ingrese un numero entre 0.0 y 1.0: ");
            num = sc.nextDouble();
        }

        while(num < 0.0 || num > 1.0);

        double[] numeros = new double[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
        }
        int cont = 0;
        int acum=0;

        for (int i = 0; i < numeros.length; cont++) {

            if (numeros[cont] >= num) {
                acum++;
            }
        }

        System.out.println(acum+" numero son iguales que "+num);
    }
}
