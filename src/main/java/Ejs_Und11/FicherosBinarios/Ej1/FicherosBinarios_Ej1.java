package Ejs_Und11.FicherosBinarios.Ej1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.util.Scanner;

public class FicherosBinarios_Ej1 {
    public static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "FicherosBinarios", "Ej1").toString();
    public static final String nombre = "binario.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número con decimales: ");
        double num = sc.nextDouble();

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta+ File.separator+nombre));
            oos.writeObject(num);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }
}
