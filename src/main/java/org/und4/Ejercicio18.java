package org.und4;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de barras de pan frescas vendidas: ");
        int frescas = entrada.nextInt();
        System.out.print("Introduce el número de barras de pan que no son del dia: ");
        int nof = entrada.nextInt();
        double ingresos= (frescas*1.20)+(nof*0.60);
        System.out.println("El total de ingresos del dia es: "+ingresos+"€");

    }
}
