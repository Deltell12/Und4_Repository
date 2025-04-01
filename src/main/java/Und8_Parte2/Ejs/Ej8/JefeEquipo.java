package Und8_Parte2.Ejs.Ej8;

import java.text.DecimalFormat;

public class JefeEquipo extends Empleado implements TrabajadorRemoto {
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

    public EstadoVPN getEstadoVPN() {
        return estadoVPN;
    }

    public void setEstadoVPN(EstadoVPN estadoVPN) {
        this.estadoVPN = estadoVPN;
    }


    @Override
    public void conectarVPN() {
        if (estadoVPN == EstadoVPN.desconectado){
            System.out.println("Conectando VPN...");
            estadoVPN = EstadoVPN.conectado;
        }
        else {
            throw new IllegalArgumentException("La VPN del Jefe de Equipo ya esta conectada");
        }
    }

    @Override
    public void desconectarVPN() {
        if (estadoVPN == EstadoVPN.conectado){
            System.out.println("Desconectando VPN...");
            estadoVPN = EstadoVPN.desconectado;
        }
        else {
            throw new IllegalArgumentException("La VPN del Jefe de Equipo ya esta desconectada");
        }
    }

    @Override
    public EstadoVPN estadoConexionVPN() {
        if (estadoVPN == EstadoVPN.desconectado){
            return estadoVPN;
        }
        else {
            return estadoVPN;
        }
    }
}
