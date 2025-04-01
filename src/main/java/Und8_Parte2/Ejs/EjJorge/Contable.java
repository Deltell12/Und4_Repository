package Und8_Parte2.Ejs.EjJorge;

public class Contable extends Empleado{
    private Dispositivo dispositivo;

    public Contable(String nombre, double salario, Dispositivo dispositivo) {
        super(nombre, salario);
        this.dispositivo = dispositivo;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDispositivo: "+dispositivo;
    }
}
