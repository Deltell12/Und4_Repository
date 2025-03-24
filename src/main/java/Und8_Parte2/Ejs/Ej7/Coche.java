package Und8_Parte2.Ejs.Ej7;

public class Coche extends VehiculosTerrestres{
    private boolean aireAcondicionado;

    public Coche(String matricula, String modelo, int numeroRuedas, boolean aireAcondicionado) {
        super(matricula, modelo, numeroRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

}
