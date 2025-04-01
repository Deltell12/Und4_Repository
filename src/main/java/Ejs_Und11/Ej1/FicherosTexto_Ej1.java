package Ejs_Und11.Ej1;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class FicherosTexto_Ej1 {
    public static final String rutaArchivo = Paths.get("src", "main", "java", "Ejs_Und11", "Ej1").toString();
    public static final String defecto = "prueba.txt";

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre de un fichero de texto: ");
        String nombre = sc.nextLine();

            if (nombre.isEmpty()) {
                nombre = defecto;
            }

                try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo+"/"+nombre))) {
                    String linea;
                    while ((linea = br.readLine())!= null) {
                        System.out.println(linea);
                    }
                } catch (IOException e) {
                    System.out.println("Error al leer el fichero"+nombre);
                }
    }
}

