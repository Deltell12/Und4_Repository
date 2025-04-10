package Ejs_Und11.FicherosBinarios.Ej8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FicherosBinario_Ej8 {
    private static final String nombre = "texto.dat";
    private static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "FicherosBinarios", "Ej8").toString();

    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        String texto = "";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta+File.separator+nombre))) {
            System.out.print("Introduce una linea de texto: ");
            texto = sc.nextLine();
            while (!texto.trim().isEmpty()) {
                oos.writeObject(texto);
                System.out.print("Introduce una linea de texto: ");
                texto = sc.nextLine();
            }
            System.out.println();
        } catch (IOException e) {
        }

        try (ObjectInputStream ois = new ObjectInputStream((new FileInputStream(ruta+File.separator+nombre)))){
            while(true) {
                texto = (String) ois.readObject();
                System.out.print(texto+" ");
            }
        } catch (EOFException e) {
            if (texto.trim().isEmpty()) {
                System.out.println("No se ha encontrado ningún texto");
            }
            System.out.println();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

