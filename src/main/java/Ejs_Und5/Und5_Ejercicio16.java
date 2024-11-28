package Ejs_Und5;

import java.util.Scanner;

public class Und5_Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la nota (debe ser entre 0 y 10): ");
        float nota = entrada.nextFloat();
        if (nota<3) {
            System.out.println("Muy deficiente");
        }
        else if (nota<5) {
            System.out.println("Insuficiente");
        }
        else if (nota<6) {
            System.out.println("Bien");
        }
        else if (nota<9) {
            System.out.println("Notable");
        }
        else {
            System.out.println("Sobresaliente");
        }
    }

}
