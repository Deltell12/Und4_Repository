package Ejs_Und6.C;

import java.util.Arrays;

public class Und6C_Ejercicio1 {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];
        int cont=1;

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++,cont++) {
                matriz[fila][columna] = cont;
            }
            System.out.println(Arrays.toString(matriz[fila]));
        }
    }
}
