package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio sin aplicar el descuento: ");
        double preciosindescuento = sc.nextDouble();

        System.out.print("Introduce el precio aplicando el descuento: ");
        double preciocondescuento = sc.nextDouble();

        System.out.println("El porcentaje es de un "+calculoDescuento(preciosindescuento,preciocondescuento)+"%");
    }
    public static double calculoDescuento(double preciosindescuento, double preciocondescuento) {
        return (preciosindescuento * preciocondescuento) / 100;
    }
}
