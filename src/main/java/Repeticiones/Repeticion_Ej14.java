package Repeticiones;

import java.util.Scanner;

public class Repeticion_Ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cantidad de dinero: ");
        int dinero = sc.nextInt();
        int b500 = 0;
        int b200 = 0;
        int b100 = 0;
        int b50 = 0;
        int b20 = 0;
        int b10 = 0;
        int b5 = 0;
        if (dinero % 5 == 0) {
            while (dinero>=500){
                dinero=dinero-500;
                b500++;
            }
            while (dinero>=200){
                dinero=dinero-200;
                b200++;
            }
            while (dinero>=100){
                dinero=dinero-100;
                b100++;
            }
            while (dinero>=50){
                dinero=dinero-50;
                b50++;
            }
            while (dinero>=20){
                dinero=dinero-20;
                b20++;
            }
            while (dinero>=10){
                dinero=dinero-10;
                b10++;
            }
            while (dinero>=5){
                dinero=dinero-5;
                b5++;
            }
            System.out.println("Para llegar a "+dinero+"€ se necesita como mínimo: "+b500+" billetes de 500, "+b200+" billetes de 200, "+b100+" billetes de 100, "+b50+" billetes de 50, "+b20+" billetes de 20, "+b10+" billetes de 10 y "+b5+" billetes de 5");
        }
        else{
            System.out.println("La cantidad debe ser multiplo de 5");
        }
    }
}
