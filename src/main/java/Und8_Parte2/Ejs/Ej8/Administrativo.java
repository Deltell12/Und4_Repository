package Und8_Parte2.Ejs.Ej8;

public class Administrativo extends Empleado {

    public Administrativo(String nombre, double salarioBase, Dispositivo dispositivoElectronico) {
        super(nombre, salarioBase, dispositivoElectronico);
    }

    @Override
    double calcularSalario() {
        return salarioBase;
    }

    public String toString() {
        String valorCategoria = "Administrativo";
        return " / Categoría: " + valorCategoria;
    }
}
