package Ejs_Und11.Ej3;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class FicherosTexto_Ej3_V2 {
    private static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "Ej3").toString();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo: ");
        String nombre = sc.nextLine();

        String nombreCopia = "copia_de_"+nombre;

        try(BufferedReader br = new BufferedReader(new FileReader(ruta + File.separator + nombre))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("Leyendo el fichero...");
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + File.separator +nombreCopia))) {
                    bw.write(linea);
                }catch (IOException e){
                    System.out.println("Error al escribir el fichero"+nombreCopia);
                }

            }

        }catch (IOException e){
            System.out.println("Error al leer el archivo"+nombre);
        }
    }
}
