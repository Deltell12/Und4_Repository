package org.und4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una distancia en millas marinas: ");
        double millas = entrada.nextDouble();
        double metros= millas*1.852;
        System.out.println("La distancia en metros es: "+metros);
    }
}

