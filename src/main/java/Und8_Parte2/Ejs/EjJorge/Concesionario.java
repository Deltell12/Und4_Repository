package Und8_Parte2.Ejs.EjJorge;

import java.util.ArrayList;

public class Concesionario {
    private String nombre;
    private ArrayList<Empleado> empleado;
    private String direccion;
    public static ArrayList<Vehiculo> vehiculo;

    public Concesionario(String nombre, String direccion) {
       if (nombre == null || nombre.isEmpty()) {
           throw new IllegalArgumentException("Error, el nombre no es correcto");
       }
        this.nombre = nombre;
        this.empleado = new ArrayList<>();
        if (direccion == null || direccion.isEmpty()) {
            throw new IllegalArgumentException("Error, el nombre no es correcto");
        }
        this.direccion = direccion;
        this.vehiculo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Error, el nombre no es correcto");
        }
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isEmpty()) {
            throw new IllegalArgumentException("Error, el nombre no es correcto");
        }
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados: "+empleado);
    }

    public void mostrarVehiculos() {
        System.out.println("Vehiculos: "+vehiculo);
    }

    public void venderVehiculo(Vendedor vend, Vehiculo v) {
        vend.getVehiculosVendidos().add(v);
        vehiculo.remove(v);
    }
}
