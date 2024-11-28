package Ejs_Und4;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String base;
        String altura;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor de la base: ");
        int bas = entrada.nextInt();
        System.out.print("Ingrese el valor de la altura: ");
        int alt = entrada.nextInt();
        System.out.println("El resultado del área del triángulo es: "+(bas*alt)/2);
    }
}
