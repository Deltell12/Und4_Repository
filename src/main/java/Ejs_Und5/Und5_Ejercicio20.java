package Ejs_Und5;

import java.util.Scanner;

public class Und5_Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese sus horas trabajadas: ");
        int horas = entrada.nextInt();
        System.out.print("Ingrese su tarifa por hora: ");
        int tarifa = entrada.nextInt();
        double bruto=0;
        double neto=0;
        double imp;
        if (horas <= 35) {
            bruto= tarifa * horas;
        }
        else if (horas > 35) {
            bruto = (float) ((horas - 35) * (tarifa * 1.5)+tarifa*horas);
        }
        if (bruto<=500){
            neto=bruto;
            System.out.println("Por las "+horas+" horas trabajadas,a "+nombre+" le corresponde un salario bruto de "+bruto+" y un neto de "+neto+" tras aplicar 0€ de impuestos.");
        }
        else if (bruto<=900) {
            imp= (bruto-500)*0.25;
            neto=bruto-imp;
            System.out.println("Por las "+horas+" horas trabajadas,a "+nombre+" le corresponde un salario bruto de "+bruto+" y un neto de "+neto+" tras aplicar "+imp+"€ de impuestos.");
        }
        else if (bruto>900){
            imp= (bruto-900)*0.45;
            neto=bruto-imp;
            System.out.println("Por las "+horas+" horas trabajadas,a "+nombre+" le corresponde un salario bruto de "+bruto+" y un neto de "+neto+" tras aplicar "+imp+"€ de impuestos.");
        }
    }
}

