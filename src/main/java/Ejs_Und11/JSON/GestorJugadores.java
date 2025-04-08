package Ejs_Und11.JSON;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GestorJugadores {
    private static Jugador [] arrayJugadoresExistentes;
    private static List<Jugador> listaJugadores = new ArrayList<>();
    static ObjectMapper mapper = new ObjectMapper();

    private static final String Fichero = "jugadores.json";
    private static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "JSON").toString();

    static File fichero = new File(ruta+File.separator+Fichero);

    public static void main(String[] args) throws Exception {
        Jugador j1 = new Jugador("Steve", 15, 15000);
        Jugador j2 = new Jugador("Alex", 10, 12420);

        Scanner sc = new Scanner(System.in);
        System.out.println("Gestor de Jugadores - CRUD");
        System.out.println("===============================");
        int opcion = 0;
        try {


            do {
                System.out.println("1. Guardar jugador");
                System.out.println("2. Mostrar un jugador");
                System.out.println("3. Mostrar todos los jugadores");
                System.out.println("4. Actualizar puntos");
                System.out.println("5. Eliminar jugador");
                System.out.println("6. Salir");
                System.out.print("Elige una opcion: ");
                opcion = sc.nextInt();
                System.out.println();
                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el nombre del jugador: ");
                        String nombre = sc.next();
                        System.out.print("Introduce el nivel del jugador: ");
                        int nivel = sc.nextInt();
                        System.out.print("Introduce los puntos del jugador: ");
                        int puntos = sc.nextInt();
                        guardarJugador(new Jugador(nombre, nivel, puntos));
                        System.out.println();
                        break;

                    case 2:
                        System.out.print("Introduce el nombre del jugador que deseas buscar: ");
                        String nom = sc.next();
                        mostrarjugador(nom);
                        System.out.println();
                        break;


                }
            }
            while (opcion != 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void guardarJugador(Jugador jugador) throws Exception {;
        listaJugadores.add(jugador);
        escribirJSON();
    }

    public static void escribirJSON() throws Exception {
        try {

                mapper.enable(SerializationFeature.INDENT_OUTPUT);
                mapper.writeValue(fichero, listaJugadores);

        }catch (IOException e){
            System.out.println("Error al escribir el JSON");
        }
    }

    public static List<Jugador> leerJugadores() throws Exception {
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            Jugador lista = mapper.readValue(fichero, Jugador.class);
            listaJugadores.add(lista);
        }catch (IOException e){
            System.out.println("Error al leer el JSON");;
        }
        return listaJugadores;
    }

    public static boolean buscarJugador(String nombre) throws Exception {
        boolean encontrado = false;
        for (Jugador jugador : listaJugadores) {
            if (jugador.getNombre().equals(nombre)) {
                encontrado = true;
                System.out.println(jugador.toString());
            }
        }
        return encontrado;
    }

    public static void mostrarjugador(String nombre) throws Exception {
                if (!buscarJugador(nombre)) {
                    throw new Exception("El jugador no existe");
                }
    }
}
