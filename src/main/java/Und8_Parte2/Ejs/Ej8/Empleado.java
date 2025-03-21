package Und8_Parte2.Ejs.Ej8;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    protected Dispositivo dispositivoElectronico;

    public Empleado(String nombre, double salarioBase, Dispositivo dispositivoElectronico) throws Exception{
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Error, el nombre del empleado no es correcto");
        }
        this.nombre = nombre;
        if (salarioBase<=0) {
            throw new IllegalArgumentException("Error, el salario del empleado no es correcto");
        }
        this.salarioBase = salarioBase;
        this.dispositivoElectronico = dispositivoElectronico;
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

    public Dispositivo getDispositivoElectronico() {
        return dispositivoElectronico;
    }

    public void setDispositivoElectronico(Dispositivo dispositivoElectronico) {
        this.dispositivoElectronico = dispositivoElectronico;
    }

    abstract double calcularSalario();

    public String mostrarInformacion()  {
        return nombre + " " + salarioBase + " " + dispositivoElectronico.toString();
    }

    public String toString() {
        return "Empleado: "+nombre+" / Salario: "+calcularSalario()+" euros";
    }
}