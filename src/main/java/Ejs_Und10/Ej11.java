package Ejs_Und10;

import java.util.*;

public class Ej11 {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> conjunto = new HashSet<>();

        rellenarHashSet(conjunto);

        System.out.println(conjunto);

        ArrayList<Integer> numeros = new ArrayList<>();
        rellenarArrayList(numeros);

        try {
            System.out.println(interseccion(numeros, conjunto));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static HashSet<Integer> rellenarHashSet(HashSet<Integer> conjunto) {

        for (int i = 0; i < 1+Math.random()*10; i++) {
            conjunto.add((int) (1+Math.random()*100));
        }
        return conjunto;
    }

    public static ArrayList<Integer> rellenarArrayList(ArrayList<Integer> numeros) {
        Scanner sc = new Scanner(System.in);

        int numero=0;

        do {
            try {
                System.out.print("Introduce un número: ");
                numero = sc.nextInt();
                numeros.add(numero);
            }
            catch (InputMismatchException e) {
                System.out.println("EL número debe ser entero");
                sc.nextLine();
            }
        }
        while (numero>=0);

        return numeros;
    }

    public static HashSet<Integer> interseccion(ArrayList<Integer> numeros, HashSet<Integer> conjunto) throws Exception{


        conjunto.retainAll(numeros);

        if (conjunto.isEmpty()) {
            throw new Exception("No hay ningún número en común.");
        }

        return conjunto;
    }
}