package Und8_Parte2.Ejs.Ej8;

public class Portatil implements Dispositivo {
    private String modelo;
    private Estado estado;

    public Portatil(String modelo, Estado estado) {
        this.modelo = modelo;
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
}
