package Ejs_Und6;

import java.util.Arrays;
import java.util.Scanner;

public class Und6_Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        String letra;
        do {
            System.out.print("a. Mostrar valores.\nb. Introducir valor.\nc. Salir.\nIntroduce una letra: ");
            letra = sc.next();

            switch (letra) {
                case "a":
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (int) (1 + Math.random() * 100);
                    }
                    System.out.println(Arrays.toString(array));
                    break;

                case "b":
                    System.out.print("Introduce un valor: ");
                    int valor = sc.nextInt();
                    System.out.print("Introduce una posicion: ");
                    int posicion = sc.nextInt();
                    Arrays.fill(array, posicion, posicion + 1, valor);
                    System.out.println(Arrays.toString(array));
                    break;

                case "c":
                    break;
            }
        }
            while (letra.equals("a") || letra.equals("b")) ;
    }
}



