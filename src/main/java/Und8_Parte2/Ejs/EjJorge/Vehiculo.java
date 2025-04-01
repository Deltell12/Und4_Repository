package Und8_Parte2.Ejs.EjJorge;

public abstract class Vehiculo implements Comparable<Vehiculo>{
    protected String marca;
    protected String modelo;
    protected String matricula;
    protected double precio;

    public Vehiculo(String marca, String modelo, String matricula, double precio) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Error, la marca no es correcta");
        }
        this.marca = marca;
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Error, el modelo no es correcto");
        }
        this.modelo = modelo;
        if (!validarMatricula(matricula)){
            throw new IllegalArgumentException("Error, la matricula no es correcta");
        }
        this.matricula = matricula;
        if (precio <= 0){
            throw new IllegalArgumentException("Error, el precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Error, la marca no es correcta");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Error, el modelo no es correcto");
        }
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (!validarMatricula(matricula)){
            throw new IllegalArgumentException("Error, la matricula no es correcta");
        }
        this.matricula = matricula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0){
            throw new IllegalArgumentException("Error, el precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public boolean validarMatricula(String matricula) {
        boolean valido = false;
        String matriculaValida = "^[0-9]{4}[A-Z]{3}$";
        if (matricula.matches(matriculaValida)) {
            valido = true;
        }
        return valido;
    }

    public int compareTo(Vehiculo vehiculo) {
        Vehiculo v = (Vehiculo) vehiculo;
        return Double.compare(this.precio, v.precio);
    }

    public abstract String toString();

}

