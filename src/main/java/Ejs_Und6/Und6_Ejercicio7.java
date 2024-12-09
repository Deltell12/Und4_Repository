package Ejs_Und6;

import javax.naming.PartialResultException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Und6_Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor: ");
        int P = sc.nextInt();

        System.out.print("Introduce otro valor: ");
        int Q = sc.nextInt();

        int[] array = new int[0];

        if (P < Q) {
            array = new int[Q - P+1];

            for (int i = P; i <= Q; i++) {
                array[i - P] = i;
            }
            System.out.println(Arrays.toString(array));
        }

        else {
            array = new int[P - Q+1];

            for (int i = P; i >= Q; i--) {
                array[i-Q] = i;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
