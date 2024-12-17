package Ejs_Und6.A;

import java.util.Arrays;

public class Und6_Ejercicio14 {
    public static void main(String[] args) {

        int[] array=new int[55];

        int cont=0;
        for (int i=1; i<=10; i++){
            for (int j=0; j<i; j++,cont++){
                array[cont]=i;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}