package Und8_Parte2.Ejs.Ej1;

public class Avion extends Vehiculo {
    private int altitudMaxima;

    public Avion(String marca, String modelo, int velocidadMaxima, int altitudMaxima) {
        super(marca, modelo, velocidadMaxima);

        if(altitudMaxima > 12000) {
            throw new IllegalArgumentException("Error, la altitud maxima no puede exceder los 12000 metros");
        }
        else if (altitudMaxima > 0) {
            throw new IllegalArgumentException("La altitud maxima no puede ser negativa");
        }
        this.altitudMaxima = altitudMaxima;

    }
    public int getAltitudMaxima() {
        return altitudMaxima;
    }
    public void setAltitudMaxima(int altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public int aceleracion(int cantidad) {
        velocidadActual = velocidadActual + cantidad+100;
        return velocidadActual;
    }
}
