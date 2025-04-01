package Ejs_Und11.Ej2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FicherosTexto_Ej2 {
    private static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "Ej2").toString();
    private static final String archivo = "datos.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + File.separator+archivo, false))) {
            String cad = nombre + " | " + edad+" años";
            bw.write(cad);
        } catch (IOException e){
            System.out.println("Error al escribir el fichero"+nombre);
        }

    }
}
