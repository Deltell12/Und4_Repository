package Ejs_Und5;

import java.util.Scanner;

public class Und5_Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = entrada.nextInt();
        System.out.print("Introduce tus ingresos mensuales: ");
        int ingresos = entrada.nextInt();
        if (edad>16&&ingresos>=1000){
            System.out.println("Tienes que tributar, chaval");
        }
        else{
            System.out.println("No tienes que tributar");
        }
    }
}
