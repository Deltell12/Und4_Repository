package Ejs_Und5;

import java.util.Scanner;

public class Und5_Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        float numero = entrada.nextFloat();
        System.out.print("Ingrese otro numero: ");
        float numero2 = entrada.nextFloat();
        if (numero==numero2){
        }
        else{
            if ((numero%2==0||numero%2==1)&&(numero2%2==0||numero2%2==1)){
                System.out.println("Numeros enteros: "+numero+", "+numero2);
            }
            else if (numero%2==0||numero%2==1){
                System.out.println("Numeros enteros: "+numero);
            }
            else if (numero2%2==0||numero2%2==1){
                System.out.println("Numeros enteros: "+numero2);
            }
            else{
                System.out.println("Ningun numero es entero");
            }
        }

    }
}
