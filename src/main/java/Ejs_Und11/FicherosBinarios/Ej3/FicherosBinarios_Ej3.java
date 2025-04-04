package Ejs_Und11.FicherosBinarios.Ej3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FicherosBinarios_Ej3 {
    public static final String ruta = Paths.get("src", "main", "java", "Ejs_Und11", "FicherosBinarios", "Ej3", "binario.dat").toString();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
                System.out.print("Introduce un número positivo: ");
                int numero = sc.nextInt();
                while (numero>0) {
                    oos.writeInt(numero);
                    System.out.print("Introduce otro número positivo: ");
                    numero = sc.nextInt();
                }
            }catch (IOException e){
                System.out.println("Error al escribir el archivo");
            }


        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
            while(true) {
                int num = ois.readInt();
                System.out.print(num);
            }
        }catch (EOFException e){
            System.out.println("\nFin del fichero");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
