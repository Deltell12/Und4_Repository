package Ejs_Und5;

import java.util.Scanner;

public class Und5_Ejecicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        if (edad<4) {
            System.out.println("La entrada es gratis");
        }
        else if (edad<18) {
            System.out.println("La entrada cuesta 5€");
        }
        else{
            System.out.println("La entrada cuesta 10€");
        }
    }
}
