package Und8_Parte2.Ejs.EjJorge;

public abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        if (nombre == null || nombre.isEmpty() || !validarNombre(nombre)){
            throw new IllegalArgumentException("Error, el nombre no es correcto");
        }
        this.nombre = nombre;
        if (salario <= 0){
            throw new IllegalArgumentException("Error, el salario no es correcto");
        }
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty() || !validarNombre(nombre)){
            throw new IllegalArgumentException("Error, el nombre no es correcto");
        }

        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0){
            throw new IllegalArgumentException("Error, el salario no es correcto");
        }
        this.salario = salario;
    }

    public boolean validarNombre(String nombre) {
        boolean valido = false;
        String nombreValido = "^[A-z]{3,}$";
        if (nombre.matches(nombreValido)) {
            valido = true;
        }
        return valido;
    }

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+" | Salario: "+getSalario();
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre+ " Salario: " + salario);
    }
}
