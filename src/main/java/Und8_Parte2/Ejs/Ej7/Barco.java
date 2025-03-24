package Und8_Parte2.Ejs.Ej7;

public class Barco extends VehiculosAcuaticos {
    private boolean motor;

    public Barco(String matricula, String modelo, int eslora, boolean motor) {
        super(matricula, modelo, eslora);
        this.motor = motor;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }
}
