package org.und4;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        String rad;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        double radio = entrada.nextDouble();
        double longitud = 2*Math.PI*radio;
        double area= (double)Math.PI*Math.pow(radio,2);
        double volumen= 4/3*Math.PI*Math.pow(radio,3);
        System.out.println("El area del radio es: "+area);
        System.out.println("El volumen del radio es: "+volumen);
        System.out.println("El longitud del radio es: "+longitud);

    }
}
