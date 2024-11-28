package Repeticiones;

import java.util.Scanner;

public class Repeticion2_Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acum=0;
        for (int i = 1; i <= 5; i++) {
            int mult=i * i;
            acum=acum+mult;
        }
        System.out.println("La suma de los cuadrados es "+acum);
    }
}
