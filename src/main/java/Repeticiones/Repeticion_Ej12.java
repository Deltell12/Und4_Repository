package Repeticiones;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Repeticion_Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Ingrese un numero: ");
        float num = sc.nextFloat();
        System.out.print("Ingrese una potencia: ");
        float potent = sc.nextFloat();
        float cont, result=1;
        for (cont=1; cont<=potent; cont++) {
            result = result * num;
        }
        System.out.println(df.format(num)+" ^ "+df.format(potent)+": "+df.format(result));
    }
}
