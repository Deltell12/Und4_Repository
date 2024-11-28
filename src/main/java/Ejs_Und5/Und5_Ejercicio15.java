package Ejs_Und5;

import java.util.Scanner;

public class Und5_Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el precio total de su pedido: ");
        float precio = entrada.nextFloat();
        if (precio>100){
            float desc = (float) (precio*(0.1));
            float total= precio-desc;
            System.out.println("El precio final del pedido es de: "+total+"€");
        }
        if (precio<50){
            float total= precio+5;
            System.out.println("El precio final del pedido es de: "+total+"€");
        }
        else if (precio>=50&&precio<=100){
            System.out.println("El precio del pedido no cambia");
        }
    }
}
