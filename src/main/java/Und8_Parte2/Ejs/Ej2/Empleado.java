package Und8_Parte2.Ejs.Ej2;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre del empleado es erroneo");
        }
        this.nombre = nombre;
        if (salarioBase < 0){
            throw new IllegalArgumentException("El salario del empleado no puede ser negativo");
        }
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String mostrarInfo(){
        return "Nombre: "+nombre+"\nSalario: "+calcularSalario()+"\n";
    }

}
