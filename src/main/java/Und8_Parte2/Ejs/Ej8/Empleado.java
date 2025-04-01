package Und8_Parte2.Ejs.Ej8;

public abstract class Empleado extends Object{
    protected String nombre;
    protected double salarioBase;
    protected Dispositivo dispositivoElectronico;

    public Empleado(String nombre, double salarioBase, Dispositivo dispositivoElectronico) throws Exception{
        if (nombre == null || nombre.isEmpty() || !validarNombre(nombre.trim())) {
            throw new IllegalArgumentException("Error, el nombre del empleado no es correcto");
        }
        this.nombre = nombre.trim();
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
        if (nombre == null || nombre.isEmpty() || !validarNombre(nombre.trim())) {
            throw new IllegalArgumentException("Error, el nombre del empleado no es correcto");
        }
        this.nombre = nombre.trim();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase<=0) {
            throw new IllegalArgumentException("Error, el salario del empleado no es correcto");
        }
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

    public boolean validarNombre(String nombre) {
        boolean valido = false;
        String validacion = "[A-z]{3,}$";
        if (nombre.matches(validacion)) {
            valido = true;
        }
        return valido;
    }

    public String toString() {
        return "Empleado: "+nombre.trim()+" / Salario: "+salarioBase+" euros";
    }
}