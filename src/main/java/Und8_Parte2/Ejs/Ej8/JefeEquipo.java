package Und8_Parte2.Ejs.Ej8;

import java.io.Serializable;

public class JefeEquipo extends Empleado implements TrabajadorRemoto {
    private EstadoVPN estadoVPN;

    public JefeEquipo(String nombre, double salarioBase, Dispositivo dispositivoElectronico, EstadoVPN trabajoRemoto) {
        super(nombre, salarioBase, dispositivoElectronico);
        this.estadoVPN = trabajoRemoto;
    }

    @Override
    double calcularSalario() {
        double bonoAdicional = salarioBase*0.25;
        return salarioBase + bonoAdicional;
    }

    public String toString() {
        String valorCategoria = "Jefe de Equipo";
        return " / Categoría: " + valorCategoria;
    }

    @Override
    public void conectarVPN() {

    }

    @Override
    public void desconectarVPN() {

    }

    @Override
    public void estadoConexionVPN() {

    }
}
