package Ejs_Und6.C;

import java.util.Arrays;

public class Und6C_Ejercicio8 {
    public static void main(String[] args) {

        int alturaMin = 140;
        int alturaMax = 210;
        int[] suma = new int[4];

        int media = 0,minimo = 0,maximo=0;

        int[][] matriz = new int[4][10];
        String[] paises = {"España", "México", "Brasil", "Italia"};

        for (int numeros = 0; numeros < matriz.length; numeros++) {

            if (numeros == 0)
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  MED MIN MAX");

            System.out.print(paises[numeros] + ": ");

            for (int pais = 0; pais < matriz[0].length; pais++) {
                matriz[numeros][pais] = alturaMin + (int) (Math.random() * ((alturaMax - alturaMin) + 1));
                suma[numeros] += matriz[numeros][pais];
                System.out.print(matriz[numeros][pais] + " ");
            }
            System.out.print("|");

            for (int pais = 0; pais < 4; pais++) {
                Arrays.sort(matriz[pais]);
                media = suma[numeros]/matriz[numeros].length;
                minimo=matriz[numeros][0];
                maximo=matriz[numeros][9];
            }

            System.out.print(" "+media+" "+minimo+" "+maximo);
            System.out.println();
        }
    }
}