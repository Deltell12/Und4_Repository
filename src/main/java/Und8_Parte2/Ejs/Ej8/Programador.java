package Und8_Parte2.Ejs.Ej8;

import java.io.Serializable;

public class Programador extends Empleado implements TrabajadorRemoto {
    private EstadoVPN estadoVPN;

    public Programador(String nombre, double salarioBase, Dispositivo dispositivoElectronico, EstadoVPN estadoVPN) throws Exception {
        super(nombre, salarioBase, dispositivoElectronico);
        this.estadoVPN = estadoVPN;
    }

    @Override
    double calcularSalario() {
        double bonoAdicional = salarioBase*0.1;
        return salarioBase+bonoAdicional;
    }

    public String toString(){
        String valorCategoria = "Programador";
        return super.toString()+" / Categoría: "+valorCategoria;
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
