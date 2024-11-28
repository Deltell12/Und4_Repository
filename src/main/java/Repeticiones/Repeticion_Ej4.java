package Repeticiones;

import java.util.Scanner;

public class Repeticion_Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número límite: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
