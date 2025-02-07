package Ejs_Und10;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        int intentos=3;

        for (int i=1; i<=intentos; i++) {

            try{
                Scanner sc = new Scanner(System.in);

                System.out.print("Introduce un valor: ");
                int valor = sc.nextInt();

                System.out.println("El valor introducido es: " + valor);
                break;
            }

            catch(Exception e) {
                System.out.println("Valor introducido incorrecto");
                if (i == intentos) {
                    System.out.println("--Te has quedado sin intentos--");
                } else {
                    System.out.println("--Te quedan " + (intentos - i) + " intentos--");
                }
            }
             System.out.println();
        }
    }
}
