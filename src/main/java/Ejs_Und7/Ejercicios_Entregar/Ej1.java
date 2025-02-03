package Ejs_Und7.Ejercicios_Entregar;

import java.util.*;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce los números separados por espacios: ");
        String numeros = sc.nextLine();

        System.out.print("Introduce el divisor: ");
        int divisor = sc.nextInt();

        String[] numerosArray = numeros.split(",");

        System.out.println(reorganizarPorMultiplos(numerosArray, divisor));
    }

    public static List<Integer> reorganizarPorMultiplos(String[] numerosArray, int divisor) {

        List<Integer> Multiplos = new ArrayList<>();
        List<Integer> noMultiplos = new ArrayList<>();

        for (String s : numerosArray) {
            int numero = Integer.parseInt(s);
            if (numero % divisor == 0) {
                Multiplos.add(numero);
            } else {
                noMultiplos.add(numero);
            }

        }
        Multiplos.addAll(noMultiplos);
        return Multiplos;
    }

    }
