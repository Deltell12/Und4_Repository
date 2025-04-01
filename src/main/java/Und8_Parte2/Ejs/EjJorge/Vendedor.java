package Und8_Parte2.Ejs.EjJorge;

import java.util.ArrayList;
import static Und8_Parte2.Ejs.EjJorge.Concesionario.*;
public class Vendedor extends Empleado{
    private ArrayList<Vehiculo> vehiculosVendidos;
    private double comisionPorVehiculo;

    public Vendedor(String nombre, double salario, double comisionPorVehiculo) {
        super(nombre, salario);
        this.vehiculosVendidos = new ArrayList<>();
        this.comisionPorVehiculo = comisionPorVehiculo;
    }

    public ArrayList<Vehiculo> getVehiculosVendidos() {
        return vehiculosVendidos;
    }

    public void setVehiculosVendidos(ArrayList<Vehiculo> vehiculosVendidos) {
        this.vehiculosVendidos = vehiculosVendidos;
    }

    public double getComisionPorVehiculo() {
        return comisionPorVehiculo;
    }

    public void setComisionPorVehiculo(double comisionPorVehiculo) {
        this.comisionPorVehiculo = comisionPorVehiculo;
    }

    @Override
    public String toString() {
        return super.toString()+"\nComision por Vehículo: "+comisionPorVehiculo;
    }
}
