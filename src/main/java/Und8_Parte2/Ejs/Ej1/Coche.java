package Und8_Parte2.Ejs.Ej1;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int velocidadMaxima, int numPuertas) {
        super (marca, modelo, velocidadMaxima);
        if (numPuertas < 2 || numPuertas > 5) {
            throw new IllegalArgumentException("El numero de puertas es inválido");
        }
        this.numPuertas = numPuertas;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public int aceleracion(int cantidad) {
        velocidadActual = velocidadActual + cantidad + 15;
        return velocidadActual;
    }
}
