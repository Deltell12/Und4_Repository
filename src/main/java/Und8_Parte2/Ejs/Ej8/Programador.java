package Und8_Parte2.Ejs.Ej8;

public class Programador extends Empleado implements TrabajadorRemoto {
    private EstadoVPN estadoVPN;

    public Programador(String nombre, double salarioBase, Dispositivo dispositivoElectronico, EstadoVPN estadoVPN) throws Exception {
        super(nombre, salarioBase, dispositivoElectronico);
        this.estadoVPN = estadoVPN;
    }

    public EstadoVPN getEstadoVPN() {
        return estadoVPN;
    }

    public void setEstadoVPN(EstadoVPN estadoVPN) {
        this.estadoVPN = estadoVPN;
    }


    @Override
    double calcularSalario() {
        double bonoAdicional = salarioBase * 0.1;
        return salarioBase + bonoAdicional;
    }

    public String toString() {
        String valorCategoria = "Programador";
        return super.toString() + " / Categoría: " + valorCategoria+" / Estado del VPN: "+estadoVPN;
    }

    @Override
    public void conectarVPN() {
        if (estadoVPN == EstadoVPN.desconectado) {
            System.out.println("Conectando VPN...");
            estadoVPN = EstadoVPN.conectado;
        } else {
            throw new IllegalArgumentException("La VPN del programador ya esta conectada");
        }
    }

    @Override
    public void desconectarVPN() {
        if (estadoVPN == EstadoVPN.conectado) {
            System.out.println("Desconectando VPN...");
            estadoVPN = EstadoVPN.desconectado;
        } else {
            throw new IllegalArgumentException("La VPN del programador ya esta desconectada");
        }
    }

    @Override
    public EstadoVPN estadoConexionVPN() {
        if (estadoVPN == EstadoVPN.desconectado) {
            return estadoVPN;
        } else {
            return estadoVPN;
        }
    }
}
