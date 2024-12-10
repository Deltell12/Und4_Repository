package Ejs_Und6;

import java.util.Arrays;

public class Und6_Ejercicio18 {
    public static void main(String[] args) {

        int[] array=new int[30];

        for (int i=0; i<array.length;i++){
            array[i]= (int) (Math.random()*10);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
