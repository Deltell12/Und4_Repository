package Und8_Parte2.Ejs.Ej8;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Error, el nombre no es válido");
        }

        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Error, el nombre no es válido");
        }

        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void aniadirEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

}
