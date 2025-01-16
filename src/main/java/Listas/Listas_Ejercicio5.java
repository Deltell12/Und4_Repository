package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Listas_Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> telefonos = new ArrayList<Integer>();

        System.out.println("Agenda de Contactos:\n1. Añadir contacto\n2. Ver contacto\n3. Buscar contacto\n4. Eliminar contacto\n5. Salir");

        System.out.print("Elige una opción: ");
        String opcion = sc.next();

        if (opcion.equals("5")) {
        } else {
            do {
                switch (opcion) {
                    case "1":
                        System.out.print("Introduce el nombre: ");
                        nombres.add(sc.next());
                        System.out.print("Introduce el teléfono: ");
                        telefonos.add(Integer.valueOf(sc.next()));
                        System.out.println("Contacto añadido.");
                        System.out.println();
                        break;

                    case "2":
                        if (nombres.isEmpty()) {
                            System.out.println("No hay ningún contacto registrado.");
                        } else {
                            System.out.println();
                            System.out.println("Contactos:");
                            for (int i = 0; i < nombres.size(); i++) {
                                System.out.println("Nombre: " + nombres.get(i) + ", Teléfono: " + telefonos.get(i));
                            }
                        }
                        System.out.println();
                        break;

                    case "3":
                        System.out.print("Introduce el nombre a buscar: ");
                        String nombreBuscar = sc.next();
                        for (int i = 0; i < nombres.size(); i++) {
                            if (nombres.get(i).equalsIgnoreCase(nombreBuscar)) {
                                System.out.println("Nombre: " + nombres.get(i) + ", Telefono: " + telefonos.get(i));
                                break;
                            } else {
                                System.out.println("Ese contacto no existe.");
                                break;
                            }
                        }
                        System.out.println();
                        break;

                    case "4":
                        System.out.print("Introduce el nombre del contacto a eliminar: ");
                        String nombreEliminar = sc.next();
                        for (int i = 0; i < nombres.size(); i++) {
                            if (nombres.get(i).equalsIgnoreCase(nombreEliminar)) {
                                nombres.remove(i);
                                telefonos.remove(i);
                                System.out.println("Contacto eliminado.");
                                break;
                            } else {
                                System.out.println("Ese contacto no existe.");
                                break;
                            }
                        }
                        System.out.println();
                        break;
                }
                System.out.println();
                System.out.println("Agenda de Constactos:\n1. Añadir contacto\n2. Ver contacto\n3. Buscar contacto\n4. Eliminar contacto\n5. Salir");
                System.out.println();
                System.out.print("Elige una opción: ");
                opcion = sc.next();
            }
            while (!opcion.equals("5"));
        }
    }
}