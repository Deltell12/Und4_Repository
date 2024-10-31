package org.und4;

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
        if (horas<=35){
            int bruto= tarifa*horas;

        if (horas>35){
            float bruto2 = (float) ((float) (horas - 35) * (tarifa * 1.5)+bruto;

        if (bruto>=500||bruto2>=500){
            bruto=bruto;
            bruto2=bruto2;

        if  (bruto<=900||bruto2<=900) {
                float imp = (float) ((bruto - 400) * 0.25);
                float neto = bruto - imp;
                float imp2 = (float) ((bruto2 - 400) * 0.25);
                float neto2 = bruto2 - imp2;

        if (bruto>900||bruto2>900){
            float imp3= (float) ((bruto-900)*0.45);
            float neto3= (bruto-imp3)+neto;
            float imp4= (float) ((bruto2-900)*0.24);
            float neto4= (bruto2-imp4)+neto2;
        }
            System.out.println("Por las "+horas+" horas trabajadas, a"+nombre+);
            }
    }
}
