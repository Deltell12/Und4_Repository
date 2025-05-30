package Und8_Parte2.Ejs.Ej8;

public class Portatil implements Dispositivo {
    private String modelo;
    private Estado estado;

    public Portatil(String modelo, Estado estado) {
        if (modelo.isEmpty() || modelo == null) {
            throw new IllegalArgumentException("Error, el modelo del portatil no es correcto");
        }
        this.modelo = modelo.trim();
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.isEmpty() || modelo == null) {
            throw new IllegalArgumentException("Error, el modelo del movil no es correcto");
        }
        this.modelo = modelo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    @Override
    public void encender() {
        if (estado==Estado.apagado){
            System.out.println("Encendiendo...");
            estado = Estado.encendido;
        }
        else {
            System.out.println("Error, el portatil ya esta encendido");
        }
    }

    @Override
    public void apagar() {
        if (estado == Estado.encendido) {
            System.out.println("Apagando...");
            estado = Estado.apagado;
        }
        else {
            System.out.println("Error, el portatil ya esta apagado");
        }
    }

    @Override
    public Estado estadoDispositivo() {
        if (estado == Estado.encendido) {
            return estado;
        }
        else {
            return estado;
        }
    }

    @Override
    public boolean equals(Object obj){
        Portatil p = (Portatil) obj;
        return modelo.equals(p.modelo);
    }

    @Override
    public String toString() {
        return "Portatil "+modelo;
    }
}
