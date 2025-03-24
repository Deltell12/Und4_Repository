package Und8_Parte2.Ejs.Ej7;

public class Submarino extends VehiculosAcuaticos{
    private double profundidadMaxima;


    public Submarino(String matricula, String modelo, int eslora, double profundidadMaxima) {
        super(matricula, modelo, eslora);
        if (profundidadMaxima > 0.0) {
            throw new IllegalArgumentException("La profundidad maxima  debe ser mayor que 0.");
        }
        this.profundidadMaxima = profundidadMaxima;
    }

    public double getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public void setProfundidadMaxima(double profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }

}
