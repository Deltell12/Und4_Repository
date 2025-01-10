package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Listas_Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número para la lista: ");
            lista.add(sc.nextInt());
        }
        System.out.println("Lista original: " + lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada de menor a mayor: " + lista);
    }
}