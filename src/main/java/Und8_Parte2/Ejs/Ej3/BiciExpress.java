package Und8_Parte2.Ejs.Ej3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BiciExpress {
    static ArrayList<Paquete>paquetes=new ArrayList<>();
    static ArrayList<Repartidor>repartidores=new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String opcion = "";
            do {
                System.out.println("--MENSAJERÍA BICI-EXPRESS--");
                System.out.println("1.\tCrear repartidor");
                System.out.println("2.\tCrear paquete normal");
                System.out.println("3.\tCrear envío urgente");
                System.out.println("4.\tMostrar paquetes no asignados");
                System.out.println("5.\tAsignar paquete a repartidor");
                System.out.println("6.\tEntregar paquete a cliente");
                System.out.println("7.\tMostrar repartidores y paquetes asignados");
                System.out.println("8.\tMostrar paquetes retrasados");
                System.out.println("9.\tMostrar paquetes entregados");
                System.out.println("0.\tSalir");
                System.out.print("Opcion: ");
                opcion = sc.nextLine();
                System.out.println();

                switch (opcion) {
                    case "1":
                        crearRepartidor();
                        break;

                    case "2":
                        crearPaqueteNormal();
                        break;

                    case "3":
                        crearPaqueteUrgente();
                        break;

                    case "4":
                        try {
                            mostrarPaquetesNoAsignados();
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                            System.out.println();
                        }
                        break;

                    case "5":
                        try {
                            asignarPaqueteARepartidor();
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;

                    case "6":
                        try {
                            entregarPaqueteACliente();
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                }
            }
            while (opcion!="0");
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void crearRepartidor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del repartidor: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el DNI del repartidor: ");
        String dni = sc.nextLine();
        Repartidor repartidor = new Repartidor(nombre,dni, paquetes);
        repartidores.add(repartidor);
        System.out.println("--REPARTIDOR CREADO--");
        System.out.println();
    }

    public static void crearPaqueteNormal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el peso del paquete: ");
        double peso = sc.nextDouble();
        Paquete paquete = new Paquete(peso);
        paquetes.add(paquete);
        System.out.println("--PAQUETE NORMAL CREADO--");
        System.out.println();
    }

    public static void crearPaqueteUrgente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el peso del paquete: ");
        double pesoUrgente = sc.nextDouble();
        Paquete paqueteUrgente = new EnvioUrgente(pesoUrgente);
        paquetes.add(paqueteUrgente);
        System.out.println("--PAQUETE URGENTE CREADO--");
        System.out.println();
    }

    public static void mostrarPaquetesNoAsignados() {
        ArrayList <Paquete> paquetesAsignados=new ArrayList<>();
        if (paquetes.isEmpty()) {
            throw new IllegalArgumentException("No hay ningun paquete creado");
        }
        for (Repartidor repartidor : repartidores) {
           if (!repartidor.getPaquetes().isEmpty()) {
               paquetesAsignados.addAll(repartidor.getPaquetes());
           }
        }
        for (Paquete paquete : paquetes) {
            if (!paquetesAsignados.contains(paquete)) {
                System.out.println("Paquete con ID: "+paquete.getId());
            }
        }
    }

    public static void asignarPaqueteARepartidor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el id del paquete que quiere seleccionar: ");
        int id = sc.nextInt();
        for (Paquete paquete : paquetes) {
            if (paquete.getId() == id) {
                System.out.print("Introduce el dni del repartidor al que quieres asignar el paquete: ");
                String dni = sc.next();
                for (Repartidor repartidor : repartidores) {
                    if (repartidor.getDni().equals(dni)) {
                        repartidor.asignarPaquete(paquete);
                    }
                    else {
                        throw new IllegalArgumentException("No hay ningun repartidor con ese DNI");
                    }
                }
            }
            else {
                throw new IllegalArgumentException("No hay ningun paquete con ese ID");
            }
        }
    }

    public static void entregarPaqueteACliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ID del paquete: ");
        int id = sc.nextInt();

        for (Repartidor repartidor : repartidores) {
            if (repartidor.getPaquetes().contains(paquetes.get(id))) {
                repartidor.entregarPaquete(id);
                System.out.println("El paquete ha sido entregado por " + repartidor.getNombre());
            }
            else {
                throw new IllegalArgumentException("No hay ningun repartidor con ese paquete asignado");
            }
        }
    }

    public static void motrarRepartidoresYPaquetesAsignados() {
        for (Repartidor repartidor : repartidores) {
            for (Paquete paquete : repartidor.getPaquetes()) {
            System.out.println(repartidor.getNombre()+"tiene asignados los paquetes con ID: "+repartidor.getPaquetes().get(paquete.id));
            }
        }
    }
}
