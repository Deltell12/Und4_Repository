package Und8_Parte2.Ejs.Ej1;

public class Barco extends Vehiculo {
    private int metrosEslora;

    public Barco(String marca, String modelo, int velocidadMaxima, int metrosEslora) {
        super(marca, modelo, velocidadMaxima);
        if (metrosEslora < 0){
            throw new IllegalArgumentException ("Error, los metros de eslora no es valido");
        }
        this.metrosEslora = metrosEslora;
    }
    public int getMetrosEslora() {
        return metrosEslora;
    }
    public void setMetrosEslora(int metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public boolean necesitaPermisoEspecial() {
        boolean necesitaPermiso = false;

        if (metrosEslora > 30) {
            necesitaPermiso = true;
        }
        return necesitaPermiso;
    }
}
