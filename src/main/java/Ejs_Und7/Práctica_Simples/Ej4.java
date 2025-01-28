package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int valor = sc.nextInt();

        if (negativo_positivo(valor)==-1){
            System.out.println("El número es negativo");
        }
        if (negativo_positivo(valor)==1){
            System.out.println("El número es positivo");
        }
        if (negativo_positivo(valor)==0) {
            System.out.println("El número es un cero");
        }

    }

    public static int negativo_positivo(int valor) {
        if (valor < 0) {
            return -1;
        }
        else if (valor > 0){
            return 1;
        }
        return 0;
    }
}
