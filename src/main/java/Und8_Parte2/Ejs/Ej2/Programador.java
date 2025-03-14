package Und8_Parte2.Ejs.Ej2;

public class Programador extends Empleado{

    public Programador(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double bonoProductividad = salarioBase*0.1;
        return salarioBase + bonoProductividad;
    }
}
