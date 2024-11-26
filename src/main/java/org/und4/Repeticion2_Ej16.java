package org.und4;

import java.util.Scanner;

public class Repeticion2_Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numDia = 0, numDia2 = 0;

        System.out.print("Introduce primer dia: ");
        String dia = sc.next();
        dia = dia.toLowerCase();

        switch (dia) {
            case "lunes":
            case "1":
                numDia = 1;
                dia = "lunes";
                break;

            case "martes":
            case "2":
                numDia = 2;
                dia = "martes";
                break;

            case "miercoles":
            case "3":
                numDia = 3;
                dia = "miercoles";
                break;

            case "jueves":
            case "4":
                numDia = 4;
                dia = "jueves";
                break;

            case "viernes":
            case "5":
                numDia = 5;
                dia = "viernes";
                break;

            case "sabado":
            case "6":
                numDia = 6;
                dia = "sabado";
                break;

            case "domingo":
            case "7":
                numDia = 7;
                dia = "domingo";
                break;
        }

        System.out.print("Introduce la hora del " + dia + ": ");
        int hora = sc.nextInt();

        if (hora >= 24 || hora < 0) {
            System.out.print("La hora debe ser menor que 24, introduzcala de nuevo: ");
            hora = sc.nextInt();
        }

        System.out.print("Introduce segundo dia: ");
        String dia2 = sc.next();
        dia2 = dia2.toLowerCase();

        if (numDia > numDia2 || dia == dia2) {
            System.out.println("El segundo dia debe ser posterior al primero");

                System.out.print("Introduce primer dia: ");
                dia = sc.next();

                switch (dia) {
                    case "lunes":
                    case "1":
                        numDia = 1;
                        dia = "lunes";
                        break;

                    case "martes":
                    case "2":
                        numDia = 2;
                        dia = "martes";
                        break;

                    case "miercoles":
                    case "3":
                        numDia = 3;
                        dia = "miercoles";
                        break;

                    case "jueves":
                    case "4":
                        numDia = 4;
                        dia = "jueves";
                        break;

                    case "viernes":
                    case "5":
                        numDia = 5;
                        dia = "viernes";
                        break;

                    case "sabado":
                    case "6":
                        numDia = 6;
                        dia = "sabado";
                        break;

                    case "domingo":
                    case "7":
                        numDia = 7;
                        dia = "domingo";
                        break;
                }

                System.out.print("Introduce la hora del " + dia + ": ");
                hora = sc.nextInt();

                System.out.print("Introduce segundo dia: ");
                dia2 = sc.next();
            }

        switch (dia2) {

            case "lunes":
            case "1":
                numDia2 = 1;
                dia2 = "lunes";
                break;

            case "martes":
            case "2":
                numDia2 = 2;
                dia2 = "martes";
                break;

            case "miercoles":
            case "3":
                numDia2 = 3;
                dia2 = "miercoles";
                break;

            case "jueves":
            case "4":
                numDia2 = 4;
                dia2 = "jueves";
                break;

            case "viernes":
            case "5":
                numDia2 = 5;
                dia2 = "viernes";
                break;

            case "sabado":
            case "6":
                numDia2 = 6;
                dia2 = "sabado";
                break;

            case "domingo":
            case "7":
                numDia2 = 7;
                dia2 = "domingo";
                break;
        }

        System.out.print("Introduce la hora del " + dia2 + ": ");
        int hora2 = sc.nextInt();

        if (hora2 >= 24 || hora2 < 0) {
            System.out.print("La hora debe ser menor que 24, introduzcala de nuevo: ");
            hora2 = sc.nextInt();
        }

        int hDia = 24;

        int horas = hDia - hora;

        int cantDias = (numDia2 - numDia) - 1;

        int hr = (hDia * cantDias) + hora2;

        int horasTotales = hr + horas;

        int cont = 0;

        horas = hDia - hora;

        cantDias = (numDia2 - numDia) - 1;

        hr = (hDia * cantDias) + hora2;

        horasTotales = hr + horas;

        System.out.println("Entre las " + hora + ":00 del " + dia + " y las " + hora2 + ":00 del dia " + dia2 + " hay " + horasTotales + " hora/s");
    }
}
