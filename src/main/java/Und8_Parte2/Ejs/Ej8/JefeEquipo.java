package Und8_Parte2.Ejs.Ej8;

import java.io.Serializable;
import java.text.DecimalFormat;

public class JefeEquipo extends Empleado implements TrabajadorRemoto {
    DecimalFormat df = new DecimalFormat("#.##");

    private EstadoVPN estadoVPN;

    public JefeEquipo(String nombre, double salarioBase, Dispositivo dispositivoElectronico, EstadoVPN trabajoRemoto) throws Exception {
        super(nombre, salarioBase, dispositivoElectronico);
        this.estadoVPN = trabajoRemoto;
    }

    @Override
    double calcularSalario() {
        double bonoAdicional = salarioBase*0.25;
        return salarioBase + bonoAdicional;
    }

    public String toString(){
        String valorCategoria = "Jefe de equipo";
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
