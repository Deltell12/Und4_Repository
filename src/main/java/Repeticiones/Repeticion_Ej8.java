package Repeticiones;

import java.util.Scanner;

public class Repeticion_Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = sc.nextInt();
        int pos = 0;
        int neg = 0;
        while (numero!=0){
            System.out.print("Ingresa otro numero: ");
            numero = sc.nextInt();
            if (numero >0) {
                pos = pos + 1;
            }
            else {
                neg = neg + 1;
            }
        }
        if (neg>=1) {
            System.out.println("El programa ha leído " + neg + " números negativos y " + pos + " números positivos");
        }
        else {
            System.out.println("El programa ha leido "+pos+" números positivos y ningún número negativo");
        }
    }

}
