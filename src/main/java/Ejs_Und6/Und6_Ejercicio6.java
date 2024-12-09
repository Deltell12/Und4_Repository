package Ejs_Und6;

import java.util.Arrays;
import java.util.Scanner;

public class Und6_Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor entero: ");
        int N = sc.nextInt();

        int [] array=new int[N];

        System.out.print("Introduce otro valor entero: ");
        int M=sc.nextInt();


        Arrays.fill(array,M);

        System.out.println(Arrays.toString(array));

    }
}
