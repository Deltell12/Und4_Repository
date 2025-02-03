package Ejs_Und7.Ejercicios_Entregar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> lista= new ArrayList<>();

        int opcion = 0;

        System.out.println(menuHistorial(opcion));
    }

    public static int menuHistorial(int opcion) {
        Scanner sc = new Scanner(System.in);
            System.out.println("--- Menú Historial de Acciones ---");
            System.out.println("1. Añadir acción");
            System.out.println("2. Deshacer última acción");
            System.out.println("3. Mostrar historial");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
        return opcion;
    }

    public static List<String> aniadirAccion(int opcion, List <String> lista) {
        Scanner sc = new Scanner(System.in);

        if(opcion == 1){
            System.out.print("Introduce la accion: ");
            lista.add(sc.nextLine());
        }
        return lista;
    }

    public static List<String> deshacerAccion(int opcion, List<String> lista) {
        Scanner sc = new Scanner(System.in);

        if(opcion == 2){
            System.out.println("Se ha deshecho: "+lista.get((lista.size()-1)));
            lista.remove((lista.size()-1));
        }
        return lista;
    }

    public static List<String> mostrarHistorial(int opcion, List<String> lista) {
        Scanner sc = new Scanner(System.in);

        if(opcion == 3){
            System.out.print("Historial: "+lista);
        }
        return lista;
    }
}