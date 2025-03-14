package Und8_Parte2.Ejs.Ej1;

public class Vehiculo implements Comparable<Vehiculo>{
    protected String marca;
    protected String modelo;
    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        if (velocidadActual > velocidadMaxima) {
            throw new IllegalArgumentException("Error, la velocidad no puede ser mayor a la velocidad máxima");
        }
        this.velocidadActual = 0;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int aceleracion (int cantidad) {
        velocidadActual += cantidad;
        return velocidadActual;
    }

    @Override
    public int compareTo(Vehiculo vehiculo) {
        return Integer.compare(velocidadActual, vehiculo.velocidadActual);
    }
}
