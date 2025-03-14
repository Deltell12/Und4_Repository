package Und8_Parte2.Ejs.Ej3;

import java.time.LocalDate;

public class Paquete {
    private static int contadorId = 1;
    protected int id;
    protected double peso;
    protected LocalDate fechaEntrega;
    protected EstadoEnvio estado;

    public Paquete(int id, double peso, LocalDate fechaEntrega) {
        this.id = contadorId++;
        if (peso<0 || peso>20) {
            throw new IllegalArgumentException("Error, el peso es invalido.");
        }
        this.peso = peso;
        this.fechaEntrega = fechaEntrega;
        if (estaRetrasado()){
            throw new IllegalArgumentException("El paquete esta retrasado.");
        }
        this.estado = EstadoEnvio.PENDIENTE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public EstadoEnvio getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }

    public LocalDate calcularFechaEntrega() {
        LocalDate hoy = LocalDate.now();
        if (peso >= 1 || peso <=5) {
            fechaEntrega = hoy.plusDays(1);
        }
        if (peso > 5 || peso<=10) {
            fechaEntrega = hoy.plusMonths(2);
        }
        if (peso > 10 || peso<=15) {
            fechaEntrega = hoy.plusWeeks(4);
        }
        if (peso > 15 || peso<=20) {
            fechaEntrega = hoy.plusYears(5);
        }
        return fechaEntrega;
    }

    public boolean estaRetrasado() {
        boolean estadoRetrasado = false;
        if (LocalDate.now().isAfter(fechaEntrega) && estado != EstadoEnvio.ENTREGADO) {
            estadoRetrasado = true;
        }
        return estadoRetrasado;
    }

    public EstadoEnvio entregar() {
        if (estado == EstadoEnvio.ENTREGADO) {
            throw new IllegalStateException("El paquete ya ha sido entregado.");
        }
        if (estado == EstadoEnvio.PENDIENTE) {
            estado = EstadoEnvio.EN_REPARTO;
        }
        if (estado == EstadoEnvio.EN_REPARTO) {
            estado = EstadoEnvio.ENTREGADO;
        }
        return estado;
    }

}
