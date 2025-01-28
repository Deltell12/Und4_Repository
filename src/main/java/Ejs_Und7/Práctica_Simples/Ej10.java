package Ejs_Und7.Práctica_Simples;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un dia: ");
        int dia = sc.nextInt();

        System.out.print("Introduce un mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduce un año: ");
        int anio = sc.nextInt();

        if (fechaCorrecta(dia, mes, anio) == true) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
    }

    public static boolean fechaCorrecta(int dia, int mes, int anio) {
        if (dia <= 30) {
            if (mes <= 12) {
                return true;
            }
        }
        return false;
    }
}

