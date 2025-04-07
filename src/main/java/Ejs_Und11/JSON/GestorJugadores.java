package Ejs_Und11.JSON;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GestorJugadores {
    private static Jugador [] arrayJugadoresExistentes;
    private static List<Jugador> listaJugadores;

    private static final String Fichero = "jugadores.json";
    private static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "JSON").toString();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gestor de Jugadores - CRUD");
        System.out.println("===============================");
        int opcion = 0;
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


            }
        }
        while (opcion != 6);
    }
    public static void escribirJSON() throws Exception {
        Jugador j1 = new Jugador("Steve", 15, 15000);
        Jugador j2 = new Jugador("Alex", 10, 12420);
        listaJugadores = Arrays.asList(j1, j2);
    }
}
