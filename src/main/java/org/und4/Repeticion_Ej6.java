package org.und4;

import java.util.Scanner;

public class Repeticion_Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero : ");
        int numero = sc.nextInt();
        int cont=1;
        int neg=0;
        if (numero<0) {
            neg= neg+1;
        }
        else {}
        for (cont=1;cont<100;cont++) {
            System.out.print("Ingresa otro numero : ");
            int num=sc.nextInt();
            if (num<0) {
                neg= neg+1;
            }
            else {}
        }
        if (neg>=1){
            System.out.println("El programa ha leído algún número negativo");
        }
        else {
            System.out.println("El programa no ha leído ningun número negativo");
        }
    }
}
