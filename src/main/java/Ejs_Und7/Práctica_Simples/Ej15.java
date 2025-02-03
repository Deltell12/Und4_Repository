package Ejs_Und7.Práctica_Simples;

import java.util.Arrays;

public class Ej15 {
    public static void main(String[] args) {

        int [] array = new int [101];

        System.out.println(suma(array));
        System.out.println(media(array));

    }

    public static int suma (int [] array) {
        int suma = 0;
        for (int i = 0; i <= 100; i++){
            array[i] = i;
            suma += array[i];
        }
        return suma;
    }

    public static int media (int [] array) {
        int media = 0;
        for (int i = 0; i <= 100; i++){
            media += array[i];
        }
        return media / 100;
    }
}
