package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = sc.nextInt();
        System.out.print("Introduce otro numero: ");
        int num3 = sc.nextInt();

        if (mayorNumero(num,num2)>num3){
            System.out.println("El mayor número es el "+mayorNumero(num,num2));
        }
        else{
            System.out.println("El mayor número es el "+num3);
        }
    }
    public static int mayorNumero(int num, int num2) {
        if (num > num2){
            return num;
        }
        return num2;
    }
}
