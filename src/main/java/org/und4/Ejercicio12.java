package org.und4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el precio original del producto: ");
        double precio = entrada.nextDouble();
        System.out.print("Ingrese el precio con la rebaja: ");
        double rebaja = entrada.nextDouble();
        double descuento=(precio-rebaja)/precio*100;
        System.out.println("Descuento: "+df.format(descuento));


    }
}
