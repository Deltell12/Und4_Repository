package org.und4;

import java.util.Scanner;

public class Repeticion_Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una nota: ");
        float nota = sc.nextFloat();
        int dieces=0;
        while (nota!=-1) {
            System.out.print("Ingresa otra nota: ");
            nota = sc.nextFloat();
            if (nota==10){
                dieces= dieces+1;
            }
            else {}
        }
        if (dieces>=1){
            System.out.println("Se ha introducido algún 10");
        }
        else {
            System.out.println("No se ha introducido ningún 10");
        }
    }
}
