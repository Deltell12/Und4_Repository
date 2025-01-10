package Ejs_Und6.C;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Und6C_Ejercicio4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][5];
        int[] suma = new int[4];

        for (int alumno = 0; alumno < matriz.length; alumno++) {
            System.out.println("Notas del alumno "+(alumno+1));

            for (int nota = 0; nota < matriz[alumno].length; nota++) {
                System.out.print("Introduce la nota "+(nota+1)+": ");
                matriz[alumno][nota] = sc.nextInt();

                if (matriz[alumno][nota] > 10||matriz[alumno][nota] < 0) {
                    System.out.println("La nota debe estar entre 0 y 10.");
                    System.exit(0);
                }

                else {
                    suma[alumno] += matriz[alumno][nota];
                }
            }
            System.out.println();
        }
        for (int alumno = 0; alumno<4; alumno++) {

            Arrays.sort(matriz[alumno]);
            int media= suma[alumno]/5;
            int minimo= matriz[alumno][0];
            int maximo= matriz[alumno][4];

            System.out.println("Nota media del alumno "+(alumno+1)+": "+media);
            System.out.println("Nota mínima del alumno "+(alumno+1)+": "+minimo);
            System.out.println("Nota máxima del alumno "+(alumno+1)+": "+maximo);
            System.out.println();
        }

    }
}
