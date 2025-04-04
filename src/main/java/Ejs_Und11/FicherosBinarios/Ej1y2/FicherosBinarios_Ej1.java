package Ejs_Und11.FicherosBinarios.Ej1y2;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class FicherosBinarios_Ej1 {
    public static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "FicherosBinarios", "Ej1y2").toString();
    public static final String nombre = "binario.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número binario: ");
        double num = sc.nextDouble();

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta+File.separator+nombre));
            oos.writeDouble(num);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }
}
