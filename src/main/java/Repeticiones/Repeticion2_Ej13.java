package Repeticiones;

import java.util.Scanner;

public class Repeticion2_Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();

        System.out.print("Introduce el carácter de relleno: ");
        String caracter = sc.next();

        int espacio;
        int cant=0;

        for (int i = 1; i <= altura; cant=0, i++) {
            for (espacio=1; espacio<= altura-i; espacio++) {
                System.out.print(" ");

            }
            while (cant!= (2*i-1)){
                System.out.print(caracter);
                cant++;
            }
            System.out.println();
        }
    }
}
