package Ejs_Und6;

import java.util.Arrays;
import java.util.Scanner;

public class Und6_Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] array = new int[100];

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (1+ Math.random()*10);
        }
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array,num));
    }
}
