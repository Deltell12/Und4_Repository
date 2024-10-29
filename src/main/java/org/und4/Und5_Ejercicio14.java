package org.und4;

import java.util.Scanner;

public class Und5_Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa  tu renta anual: ");
        float renta = entrada.nextFloat();
        if (renta==0){
            System.out.println("La renta tiene que ser superior a 0");
        }
        else if (renta<10000){
            System.out.println("Le corresponde el tipo impositivo de 5%");
        }
        else if (renta<20000){
            System.out.println("Le corresponde el tipo impositivo de 15%");
        }
        else if (renta<35000){
            System.out.println("Le corresponde el tipo impositivo de 20%");
        }
        else if (renta<60000){
            System.out.println("Le corresponde el tipo impositivo de 30%");
        }
        else{
            System.out.println("Le corresponde el tipo impositivo de 45%");
        }
    }
}
