package Repeticiones;

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

    public static class primos {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean primo = true;

            System.out.print("Introduce un número entero positivo y mayor 2: ");
            int numero = sc.nextInt();

            for (int i=2; i<numero; i++){
                if (numero%i == 0){
                    primo = false;
                }
            }
            if (primo==false){
                System.out.println("El número "+numero+" no es primo");
            }
            else {
                System.out.println("El número "+numero+" es primo");
            }
        }
    }
}
