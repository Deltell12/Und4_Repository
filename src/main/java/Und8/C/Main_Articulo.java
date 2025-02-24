package Und8.C;

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
            String nombreArticulo = sc.nextLine();
            articulo1.setNombreArticulo(nombreArticulo);
            System.out.print("Precio: ");
            double preciosinIVA = sc.nextDouble();
            articulo1.setPrecioSinIVA(preciosinIVA);;


            System.out.println("Artículo: " + articulo1.getNombreArticulo() + " | Precio:" + df.format(articulo1.getPrecioSinIVA()) + "€ | IVA:" + articulo1.getIVA() + "% | PVP:" + df.format(Articulo.calcularPVP(articulo1.getPrecioSinIVA())) + "€");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("El valor debe ser válido.");
        }
    }
}
