package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de un rectangulo: ");
        double altura = sc.nextDouble();

        System.out.print("Introduce el ancho del un rectangulo: ");
        double ancho = sc.nextDouble();

        System.out.println("El perímetro del rectangulo es: " + calcularPerimetro(altura, ancho));
        System.out.println("El área del rectangulo es: " + calcularArea(altura, ancho));
    }

    public static double calcularPerimetro(double altura, double ancho) {
        return (altura*2)+(ancho*2);
    }

    public static double calcularArea(double altura, double ancho) {
        return altura*ancho;
    }
}
