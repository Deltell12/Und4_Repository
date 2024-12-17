package Ejs_Und6.A;

import java.util.Arrays;
import java.util.Scanner;

public class Und6_Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[100];
        int[] array2 = new int[100];

        for (int i = 1; i <=array1.length; i++) {
            array1[i-1] = i;
        }


        int long1=array1.length;
        for (int i = 1; i <=array2.length; i++) {
            array2[i-1] = array1[long1-1];
            long1--;
        }


        System.out.println(Arrays.toString(array1));
        System.out.println();
        System.out.println(Arrays.toString(array2));
    }
}
