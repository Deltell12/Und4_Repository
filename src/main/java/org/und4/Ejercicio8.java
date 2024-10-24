package org.und4;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        String radio;
        String altura;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio del cono: ");
        double rad= entrada.nextDouble();
        System.out.print("Ingrese el altura del cono: ");
        double alt= entrada.nextDouble();
        double V= 1/3*Math.PI*Math.pow(rad,2)*alt;
        System.out.println("El volumen del cono es: "+V);
    }
}
