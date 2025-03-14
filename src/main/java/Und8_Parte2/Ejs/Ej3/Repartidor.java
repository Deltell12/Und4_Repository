package Und8_Parte2.Ejs.Ej3;

import java.util.ArrayList;

public class Repartidor {
    protected String nombre;
    protected String dni;
    protected ArrayList<Paquete> paquetes;

    public Repartidor(String nombre, String dni, ArrayList<Paquete> paquetes) {
        this.nombre = nombre;
        this.dni = dni;
        this.paquetes = paquetes;
    }
}
