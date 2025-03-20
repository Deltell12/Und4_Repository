package Und8_Parte2.Ejs.Ej8;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

}
