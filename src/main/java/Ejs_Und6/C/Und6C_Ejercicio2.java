package Ejs_Und6.C;

import java.util.Arrays;

public class Und6C_Ejercicio2 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int cont=1;
        int num=1;

        for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz[fila].length; columna++,cont++) {
                    int mult= num*cont;
                    matriz[fila][columna] = mult;
                }
            cont=1;
            num++;
            System.out.println(Arrays.toString(matriz[fila]));
        }
    }
}
