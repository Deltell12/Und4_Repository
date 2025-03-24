package Und8_Parte2.Ejs.Ej7;

abstract class VehiculosTerrestres extends Vehiculos{
    protected int numeroRuedas;

    public VehiculosTerrestres(String matricula, String modelo, int numeroRuedas) {
        super(matricula, modelo);
        if (numeroRuedas <= 0){
            throw new IllegalArgumentException("El numero de rueda no puede ser menor que 0");
        }
        this.numeroRuedas = numeroRuedas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    @Override
    boolean validarMatricula(String matricula) {
        boolean valida = false;
        String validacion = "^[1-9]{4}[A-Z]{3}$";
        if (matricula.matches(validacion)) {
            valida = true;
        }
        return valida;
    }
}
