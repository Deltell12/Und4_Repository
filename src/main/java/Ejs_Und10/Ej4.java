package Ejs_Und10;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int a = 0;
        do {

            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduce un valor (si introduce el 0 se cierra el programa): ");
                a = sc.nextInt();
                if (a>0){
                    System.out.println("El valor es positivo");
                }
                else {
                    System.out.println("El valor es negativo");
                }
            }

            catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
        while (a != 0);
    }

    public static void imprimePositivo (int p){

    }
}
