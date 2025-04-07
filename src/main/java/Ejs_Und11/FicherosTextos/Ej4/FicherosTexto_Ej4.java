package Ejs_Und11.FicherosTextos.Ej4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.io. *;

public class FicherosTexto_Ej4 {
    public static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "FicherosTextos", "Ej4", "carta.txt").toString();

    public static void main(String[] args) {

        int numLineas = 0;
        int numPalabras = 0;
        int numCaracteres = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                numLineas++;
                numCaracteres += linea.length() + 1;
                String[] palabras = linea.trim().split(" ");
                numPalabras += palabras.length;
            }
            System.out.println("Lineas: "+numLineas+" | Caracteres: "+numCaracteres+" | Palabras: "+numPalabras);
        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
        }
    }
}

