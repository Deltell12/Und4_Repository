package Und8.B;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Articulo {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        try {
            Scanner sc = new Scanner(System.in);
            Articulo articulo1 = new Articulo("si", 15, 15);

            System.out.print("Artículo comprado: ");
            articulo1.nombreArticulo = sc.nextLine();
            System.out.print("Precio: ");
            articulo1.precioSinIVA = sc.nextDouble();


            System.out.println("Artículo: " + articulo1.nombreArticulo + " | Precio:" + df.format(articulo1.precioSinIVA) + "€ | IVA:" + articulo1.IVA + "% | PVP:" + df.format(Articulo.calcularPVP(articulo1.precioSinIVA)) + "€");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("El valor debe ser válido.");
        }
    }
}
