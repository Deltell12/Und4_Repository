package Und8.B;

public class Articulo {
    String nombreArticulo;
    double precioSinIVA;
    int IVA = 21;
    int cantidadArticulo;

    public Articulo(String nombreArticulo, int cantidadArticulo, double precioSinIVA) {
        this.nombreArticulo = nombreArticulo;
        this.cantidadArticulo = cantidadArticulo;
        this.precioSinIVA = precioSinIVA;
    }



    public static double calcularPVP(double preciosinIVA) {
        double PVP = preciosinIVA*1.21;

        if (preciosinIVA < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        return PVP;
    }

}

