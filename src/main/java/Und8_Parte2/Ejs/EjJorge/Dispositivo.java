package Und8_Parte2.Ejs.EjJorge;

public class Dispositivo {
    private String marca;
    private String modelo;
    private Tipo tipo;

    public Dispositivo(String marca, String modelo, Tipo tipo) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Error, la marca no es correcta");
        }
        this.marca = marca;
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Error, el modelo no es correcto");
        }
        this.modelo = modelo;
        this.tipo = tipo;
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }



}
