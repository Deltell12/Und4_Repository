package Ejs_Und6;

import java.util.Arrays;

public class Und6_Ejercicio16 {
    public static void main(String[] args) {

        int[] array = new int[55];

        int cont = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++,cont++) {
                array[cont] = i;

            }
        }
        Arrays.fill(array, cont);
        System.out.println(Arrays.toString(array));
    }
}
