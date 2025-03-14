package Und8_Parte2.Prueba;

public class Coche extends Vehicle {
    private int numRuedas;
    private double cilindrada;

    public Coche(String marca, String modelo, String matricula, double velocidadMaxima, int numeroPlazas, int numRuedas, double cilindrada) {
        super(marca, modelo, matricula, velocidadMaxima, numeroPlazas);
        this.numRuedas = numRuedas;
        this.cilindrada = cilindrada;
    }

    public Coche(int numRuedas, double cilindrada) {
        this.numRuedas = numRuedas;
        this.cilindrada = cilindrada;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String mostrarInfo() {
        return super.mostrarInfo() + numRuedas + cilindrada;
    }

}
