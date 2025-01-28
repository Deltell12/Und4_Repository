package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una distancia en Kilometros: ");
        double km = sc.nextDouble();

        System.out.println(km+" kilometros son "+kmMillas(km)+" millas");
    }
    public static double kmMillas(double km) {
        return km / 1.60934;
    }
}
