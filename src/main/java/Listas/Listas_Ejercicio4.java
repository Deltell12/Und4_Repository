package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Listas_Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce una palabra para la lista: ");
            lista.add(sc.next());
        }
        System.out.println("Lista original: " + lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada de menor a mayor: " + lista);
    }
}