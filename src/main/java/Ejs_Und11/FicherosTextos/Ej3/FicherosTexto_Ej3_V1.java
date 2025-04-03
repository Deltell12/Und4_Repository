package Ejs_Und11.FicherosTextos.Ej3;

import java.io.*;
import java.nio.file.Paths;

public class FicherosTexto_Ej3_V1 {
    private static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "FicherosTextos", "Ej3").toString();
    private static final String nombreArchivo = "original.txt";
    private static final String nombreCopia = "copia.txt";

    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new FileReader(ruta + File.separator + nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("Leyendo el fichero...");
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta+ File.separator+nombreCopia))){
                    bw.write(linea);
                }catch (IOException e){
                    System.out.println("Error al escribir el archivo"+nombreCopia);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo" + nombreArchivo);
        }
    }
}


