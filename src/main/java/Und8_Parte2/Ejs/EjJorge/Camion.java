package Und8_Parte2.Ejs.EjJorge;

public class Camion extends Vehiculo{
    private int cargaMaxima;
    private Estado estado;

    public Camion(String marca, String modelo, String matricula, double precio, int cargaMaxima, Estado estado) {
        super(marca, modelo, matricula, precio);
        if (cargaMaxima <=0){
            throw new IllegalArgumentException("Error, la carga máxima no puede ser negativa");
        }
        this.cargaMaxima = cargaMaxima;
        this.estado = estado;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        if (cargaMaxima <=0){
            throw new IllegalArgumentException("Error, la carga máxima no puede ser negativa");
        }
        this.cargaMaxima = cargaMaxima;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "";
    }
}
