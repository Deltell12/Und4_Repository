package org.und4;

import java.awt.*;
import java.util.Scanner;

public class Und5_Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingresa tu género (H o M): ");
        String sexo = entrada.nextLine();
        char nom= nombre.charAt(0);
        if (sexo.equals("H")&&(nom>='N')) {
            System.out.println("Tu grupo es A");
        }
        if (sexo.equals("M")&&nom<='M'){
            System.out.println("Tu grupo es A");
        }
        else{
            System.out.println("Tu grupo es B");
        }
    }
}
