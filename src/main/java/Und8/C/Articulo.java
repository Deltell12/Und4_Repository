package Und8.C;

public class Articulo {

    private String nombreArticulo;
    private double precioSinIVA;
    private int IVA = 21;
    private int cantidadArticulo;

    public String getNombreArticulo() {
        return nombreArticulo;
    }
    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }
    public double getPrecioSinIVA() {
        if (precioSinIVA < 0){
            throw new IllegalArgumentException("El precio no puede ser negativa");
        }
        return precioSinIVA;
    }
    public void setPrecioSinIVA(double precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }
    public int getIVA() {
        return IVA;
    }
    public int getCantidadArticulo() {
        if (cantidadArticulo < 0){
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        else {
        return cantidadArticulo;
        }
    }
    public void setCantidadArticulo(int cantidadArticulo) {
        this.cantidadArticulo = cantidadArticulo;
    }


    public Articulo(String nombreArticulo, int cantidadArticulo, double precioSinIVA) {
        this.nombreArticulo = nombreArticulo;
        this.cantidadArticulo = cantidadArticulo;
        this.precioSinIVA = precioSinIVA;
    }



    public static double calcularPVP(double preciosinIVA) {
        return Und8.A.Articulo.calcularPVP(preciosinIVA);
    }

}

