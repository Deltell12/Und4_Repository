package Ejs_Und4;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese sus horas de trabajo: ");
        int horas = entrada.nextInt();
        System.out.print("Ingrese la tarifa por hora: ");
        int tarifa = entrada.nextInt();
        int bruto=tarifa*horas;
        double imp= bruto*0.15;
        double neto= bruto-imp;
        System.out.println("Tu paga en bruto es de "+bruto+"€ y en neto "+neto+"€ (retención del 15%)");
    }
}
