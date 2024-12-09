package Ejs_Und6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Und6_Ejercicio5 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);

        int[] array=new int[20];

        double suma=0;

        for (int i=0; i<20; i++){
            System.out.print("Introduce un numero: ");
            array[i]=sc.nextInt();

            suma=suma+array[i];
        }
        double media=suma/20;
        System.out.println("La media del array es: "+df.format(media));
    }
}
