package org.und4;

import java.util.Scanner;

public class Und5_Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una temperatura: ");
        int temp = entrada.nextInt();
        System.out.println("Opción 1: De Celsius a Fahrenheit\nOpción 2: De Fahrenheit a Celsius\nOpción 3: De Celsius a Kelvin");
        System.out.print("¿Que opción de conversión desea, 1, 2 o 3?: ");
        int conver = entrada.nextInt();
        if (conver>3){
            System.out.println("Esa opción no existe, crack");
        }
        if (conver==1){
            float calculo1= (float) (temp*9/5)+32;
            System.out.println(calculo1);
        }
        if (conver==2){
            float calculo2= (float) (temp-32)*5/9;
            System.out.println(calculo2);
        }
        else{
            float calculo3= (float) (temp+273.15);
            System.out.println(calculo3);
        }
    }
}
