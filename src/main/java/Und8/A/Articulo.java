package Und8.A;

import java.util.InputMismatchException;

public class Articulo {
    String nombreArticulo;
    double precioSinIVA;
    int IVA = 21;
    int cantidadArticulo;

    public static double calcularPVP(double preciosinIVA) {
        double PVP = preciosinIVA*1.21;

        if (preciosinIVA < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        return PVP;
    }

}

