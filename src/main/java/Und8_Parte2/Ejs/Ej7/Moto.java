package Und8_Parte2.Ejs.Ej7;

public class Moto extends VehiculosTerrestres{
    private String color;

    public Moto(String matricula, String modelo, int numeroRuedas, String color) {
        super(matricula, modelo, numeroRuedas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
