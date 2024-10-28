package org.und4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Und5_Ejercicio9 {
    public static void main(String[] args) {
        String clave= "thebest";
        String clave2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la contraseña: ");
        clave2 = entrada.nextLine();
        if (clave.toUpperCase().equals(clave2.toUpperCase())){
            System.out.println("La contraseña coincide");
        }
        else{
            System.out.println("La contraseña no coincide");
        }
    }
}
