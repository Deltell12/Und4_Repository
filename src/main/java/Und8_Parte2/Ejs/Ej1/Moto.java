package Und8_Parte2.Ejs.Ej1;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto (String marca, String modelo, int velocidadMaxima, int cilindrada) {
        super (marca, modelo, velocidadMaxima);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public int aceleracion(int cantidad) {
        velocidadActual = velocidadActual + cantidad + 20;
        return velocidadActual;
    }
}

