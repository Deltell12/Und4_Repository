package Ejs_Und7.Ejercicios_Entregar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> lista= new ArrayList<>();
        int opcion = 0;

       menuHistorial(opcion);

    }

    public static List<String> menuHistorial(int opcion) {

        Scanner sc = new Scanner(System.in);
        List<String> lista= new ArrayList<>();
        do {
            System.out.println();
            System.out.println("--- Menú Historial de Acciones ---");
            System.out.println("1. Añadir acción");
            System.out.println("2. Deshacer última acción");
            System.out.println("3. Mostrar historial");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

                if (opcion == 1) {
                    aniadirAccion(lista);
                }
                if (opcion == 2) {
                    deshacerAccion(lista);
                }
                if (opcion == 3) {
                    mostrarHistorial(lista);
                }
            }
            while (opcion != 4);
            return lista;

    }

    public static List<String> aniadirAccion( List <String> lista) {
        Scanner sc = new Scanner(System.in);


            System.out.print("Introduce la accion: ");
            lista.add(sc.nextLine());

        return lista;
    }

    public static List<String> deshacerAccion(List<String> lista) {
        Scanner sc = new Scanner(System.in);


            System.out.println("Se ha deshecho: "+lista.get((lista.size()-1)));
            lista.remove((lista.size()-1));

        return lista;
    }

    public static List<String> mostrarHistorial(List<String> lista) {
        Scanner sc = new Scanner(System.in);


            System.out.print("Historial: "+lista);
            System.out.println();

        return lista;
    }
}