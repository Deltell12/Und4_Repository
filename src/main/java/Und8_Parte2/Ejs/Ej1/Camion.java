package Und8_Parte2.Ejs.Ej1;

public class Camion extends Vehiculo {
    private double cargaMaxima;
    private double cargaActual;

    public Camion (String marca, String modelo, int velocidadMaxima, double cargaActual, double cargaMaxima) {
        super (marca, modelo, velocidadMaxima);
        if (cargaActual > cargaMaxima) {
            throw new IllegalArgumentException("Error, la carga máxima no puede ser excedida");
        }
        else if (cargaActual <0 ||cargaMaxima<0) {
            throw new IllegalArgumentException("La carga no puede ser negativo");
        }
        this.cargaActual = cargaActual;
        this.cargaMaxima = cargaMaxima;
    }
    public double getCargaActual() {
        return cargaActual;
    }
    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }
    public double getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public int aceleracion(int cantidad) {
        velocidadActual = velocidadActual + cantidad + 5;

        if (cargaActual > (cargaMaxima/2)) {
            velocidadActual = velocidadActual + cantidad;
        }

        return velocidadActual;


    }
}
