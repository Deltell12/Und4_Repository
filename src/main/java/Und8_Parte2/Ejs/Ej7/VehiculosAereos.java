package Und8_Parte2.Ejs.Ej7;

abstract class VehiculosAereos extends Vehiculos{
    protected int numeroAsientos;

    public VehiculosAereos(String matricula, String modelo, int numeroAsientos) {
        super(matricula, modelo);
        if(numeroAsientos > 0){
            throw new IllegalArgumentException("El número de asientos debe ser mayor que 0");
        }
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    boolean validarMatricula(String matricula) {
        boolean valida = false;
        String validacion= "^[A-Z]{4}[1-9]{6}%";
        if(matricula.matches(validacion)){
            valida = true;
        }
        return valida;
    }
}
