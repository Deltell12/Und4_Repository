package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una distancia en millas: ");
        int millas = sc.nextInt();

        System.out.println(millas+" millas son "+millasKm(millas)+" Kilometros");
    }
    public static double millasKm (int millas){
        return millas * 1.60934;
    }
}
