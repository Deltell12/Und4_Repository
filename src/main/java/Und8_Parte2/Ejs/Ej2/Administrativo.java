package Und8_Parte2.Ejs.Ej2;

public class Administrativo extends Empleado{

    public Administrativo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
