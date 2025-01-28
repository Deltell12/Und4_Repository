package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();


        for (int i = 1; i <= 10; i++) {
            int solt= tablaN(n)*i;
            System.out.println(n+"*"+i+"= "+solt);
        }
    }
    public static int tablaN (int n) {
        return n;

    }
}
