package Und8_Parte2.Ejs.Ej7;

abstract class Vehiculos {
    protected String matricula;
    protected String modelo;

    public Vehiculos(String matricula, String modelo) {
        if (!validarMatricula(matricula)) {
            throw new IllegalArgumentException("La matricula no es correcta");
        }
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    abstract boolean validarMatricula(String matricula);
}
