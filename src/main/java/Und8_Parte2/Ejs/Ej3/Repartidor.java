package Und8_Parte2.Ejs.Ej3;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Repartidor {
    protected String nombre;
    protected String dni;
    protected ArrayList<Paquete> paquetes;

    public Repartidor(String nombre, String dni, ArrayList<Paquete> paquetes) {
       if (nombre == null || nombre.isEmpty()) {
           throw new IllegalArgumentException ("Error, el nombre no es valido");
       }
        this.nombre = nombre;
       if (validarDNI(dni)){
           throw new IllegalArgumentException ("Error, el dni no es valido");
       }
        this.dni = dni;
        this.paquetes = paquetes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }


    public boolean validarDNI(String dni) {
        boolean dniValido = false;

        String validador = "^[1-9]{8}[A-Z]$";

        if (dni.matches(validador)) {
            dniValido = true;
        }
        return dniValido;
    }

    public ArrayList<Paquete> asignarPaquete(Paquete p) {

        paquetes.add(p);

        int contador = 0;

        for (Paquete paquete : paquetes) {
            contador++;
        }
        if (contador>10) {
            throw new IllegalArgumentException ("Error, se ha superado el limite de paquetes");
        }
        return paquetes;
    }

    public ArrayList<Paquete> entregarPaquete(int idPaquete) {

        for (Paquete paquete : paquetes) {
            if (idPaquete == paquete.getId()) {
                    paquetes.remove(paquete);
            }
            else {
                throw new NoSuchElementException("Error, el paquete seleccionado no existe");
            }
        }
        return paquetes;
    }
}
