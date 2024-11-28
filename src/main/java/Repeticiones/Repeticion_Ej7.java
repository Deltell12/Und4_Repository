package Repeticiones;

import java.util.Scanner;

public class Repeticion_Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        int cont=1;
        int pos=0;
        int neg=0;
        if (numero>=0) {
            pos= pos+1;
        }
        else {
            neg= neg+1;
        }
        for (cont=1;cont<10;cont++) {
            System.out.print("Ingresa otro numero : ");
            int num=sc.nextInt();
            if (num>=0) {
                pos= pos+1;
            }
            else {
                neg= neg+1;
            }
        }
        System.out.println("El programa ha leído "+pos+" números positivos y "+neg+" números negativos");
    }
}
