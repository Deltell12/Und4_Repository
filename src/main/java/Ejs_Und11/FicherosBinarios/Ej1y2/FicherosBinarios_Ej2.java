package Ejs_Und11.FicherosBinarios.Ej1y2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Paths;

public class FicherosBinarios_Ej2 {
    public static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "FicherosBinarios", "Ej1y2", "binario.dat").toString();
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            double num = ois.readDouble();
            System.out.println(num);
        } catch (EOFException e) {
            System.out.println("\nFin del fichero");;
        }
        catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
