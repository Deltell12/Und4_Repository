package Und8_Parte2.Ejs.Ej3;

import java.time.LocalDate;

public class EnvioUrgente extends Paquete{

    public EnvioUrgente(double peso) {
        super(peso);
        if (fechaEntrega.isAfter(calcularFechaEntrega())){
            throw new IllegalArgumentException("La fecha de entrega no es correcta");
        }
        else {
            fechaEntrega = calcularFechaEntrega();
        }


    }

    public LocalDate calcularFechaEntrega() {
        fechaEntrega = LocalDate.now().plusDays(2);
        return fechaEntrega;
    }

    @Override
    public boolean estaRetrasado() {
        boolean estadoRetrasado = false;
        if (!LocalDate.now().isEqual(fechaEntrega) && estado != EstadoEnvio.ENTREGADO) {
            estadoRetrasado = true;
        }
        return estadoRetrasado;
    }

    @Override
    public String toString() {
        return "[URGENTE]";
    }
}
