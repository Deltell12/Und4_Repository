package Ejs_Und4;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el numero de empanadillas a enviar: ");
        int emp = entrada.nextInt();
        System.out.print("Introduce el numero de napolitanas a enviar: ");
        int nap = entrada.nextInt();
        double PesEmp= nap*0.112;
        double PesNap= nap*0.075;
        double peso=PesEmp+PesNap;
        System.out.println("El peso total del paquete es "+peso+" Kg");
    }
}
