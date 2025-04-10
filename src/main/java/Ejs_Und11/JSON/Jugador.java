package Ejs_Und11.JSON;

public class Jugador {
    private String nombre;
    private int nivel;
    private int puntos;

    public Jugador(String nombre, int nivel, int puntos) throws Exception{
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del jugador no puede ser nulo");
        }
        this.nombre = nombre;
        if (nivel < 0) {
            throw new IllegalArgumentException("El nivel del jugador no puede ser negativo");
        }
        this.nivel = nivel;
        if (puntos < 0) {
            throw new IllegalArgumentException("Los puntos del jugador no pueden ser negativo");
        }
        this.puntos = puntos;
    }
    public Jugador(){}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del jugador no puede ser nulo");
        }
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 0) {
            throw new IllegalArgumentException("El nivel del jugador no puede ser negativo");
        }
        this.nivel = nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        if (puntos < 0) {
            throw new IllegalArgumentException("Los puntos del jugador no pueden ser negativo");
        }
        this.puntos = puntos;
    }

    public String toString() {
        return "{ Nombre: "+nombre + ", Nivel: " + nivel + ", Puntos: " + puntos + " }";
    }

}
