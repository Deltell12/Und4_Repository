package Ejs_Und7.Ejercicios_Entregar;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las palabras separadas por espacio: ");
        String palabras = sc.nextLine();

        System.out.print("Introduce la longitud del referencia: ");
        int longitud = sc.nextInt();

        int [] solucion= contarPorLongitud(palabras,longitud);

        System.out.println("Palabras de longitud igual: "+solucion[0]);
        System.out.println("Palabras de longitud menor: "+solucion[2]);
        System.out.println("Palabras de longitud mayor: "+solucion[1]);


    }

    public static int []contarPorLongitud(String palabras, int longitud) {

        int [] palabrasArray= new int[3];
        String[] palabrasArrayString = palabras.split(" ");

        for (String palabra :palabrasArrayString) {

            if (palabra.length() == longitud) {
                palabrasArray[0]= palabrasArray[0]+1;
            }
            else if (palabra.length() > longitud) {
                palabrasArray[1]= palabrasArray[1]+1;
            }
            else {
                palabrasArray[2]= palabrasArray[2]+1;
            }
        }
        return palabrasArray;
    }
}
