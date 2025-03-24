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

    }

    @Override
    public void apagar() {

    }

    @Override
    public void estadoDispositivo() {

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
