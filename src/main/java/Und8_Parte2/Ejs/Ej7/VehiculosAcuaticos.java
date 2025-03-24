package Und8_Parte2.Ejs.Ej7;

abstract class VehiculosAcuaticos extends Vehiculos{
    protected int eslora;

    public VehiculosAcuaticos(String matricula, String modelo, int eslora) {
        super(matricula, modelo);
        if(eslora<=0){
            throw new IllegalArgumentException("La eslora debe ser mayor que 0");
        }
        this.eslora = eslora;
    }

    public int getEslora() {
        return eslora;
    }

    @Override
    boolean validarMatricula(String matricula) {
        boolean valida = false;
        String validacion= "^[1-9]{3,10}%";
        if(matricula.matches(validacion)){
            valida = true;
        }
        return valida;
    }
}
