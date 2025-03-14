package Und8_Parte2.Ejs.Ej2;

public class JefeEquipo extends Empleado{

    public JefeEquipo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double bonoAdicional = salarioBase*0.2;
        return salarioBase + bonoAdicional;
    }

}
