package Mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Mapas_Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Object, String> mapa = new HashMap<Object, String>();
        mapa.put("adrian", String.valueOf(33557799));

        int intentos= 3;

        System.out.println("Por favor, introduce nombre de usuario y contraseña para acceder al área restringida (3 intentos)");

        do{
            System.out.print("Usuario: ");
            String usuario = sc.next();
            System.out.print("Contraseña: ");
            String contrasenia = sc.next();

            if(mapa.containsKey(usuario)){

                if(mapa.containsValue(contrasenia)){
                    System.out.println("Has accedido al área restringida.");
                    break;
                }

                else{
                    if(intentos!=1) {
                        System.out.println("La contraseña no es correcta.");
                        System.out.println("Quedan " + (intentos-1) + " intentos");
                    }

                    else{
                        System.out.println("Te has quedado sin intentos.");
                    }
                }
            }

            else{
                System.out.println("El usuario no es correcto");

                if(intentos!=1) {
                    System.out.println("Quedan " + (intentos-1) + " intentos");
                }

                else{
                    System.out.println("Te has quedado sin intentos");
                }
            }
            System.out.println();
            intentos--;
        }

        while(intentos>0);
    }
}