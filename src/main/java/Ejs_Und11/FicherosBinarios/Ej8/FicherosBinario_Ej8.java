package Ejs_Und11.FicherosBinarios.Ej8;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FicherosBinario_Ej8 {
    private static final String nombre = "texto.dat";
    private static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "FicherosBinarios", "Ej8").toString();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = "";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
        }catch (IOException e){

        }
    }
}
