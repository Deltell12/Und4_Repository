package Und8_Parte2.Prueba;

public class Vehicle {
    protected String marca;
    protected String modelo;
    protected String matricula;
    protected double velocidadMaxima;
    protected int numeroPlazas;

    public Vehicle() {

    }

    public Vehicle(String marca, String modelo, String matricula, double velocidadMaxima, int numeroPlazas) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidadMaxima = velocidadMaxima;
        this.numeroPlazas = numeroPlazas;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getNumeroPlazas() {
        return numeroPlazas;
    }
    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String mostrarInfo() {
        return marca + "," + modelo + "," + matricula+","+velocidadMaxima+","+numeroPlazas;
    }
}
