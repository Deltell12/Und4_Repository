package Und8_Parte2.Ejs.Ej1;

import java.util.ArrayList;
import java.util.Collections;

public class VehiculoPrincipal {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo vehiculo1 = new Coche("Seat", "Panda", 133, 4);
        Vehiculo vehiculo2 = new Moto("Kawasaki", "Ninja H2R", 380, 998);
        Vehiculo vehiculo3 = new Camion("Volvo", "FH16", 120, 20, 100 );
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);

        vehiculo1.aceleracion(50);
        vehiculo2.aceleracion(50);
        vehiculo3.aceleracion(50);

        Collections.sort(vehiculos);

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Coche) {
                ((Coche) vehiculo).getNumPuertas();
                System.out.println(((Coche) vehiculo).getMarca()+" "+vehiculo.getVelocidadActual());

            }
            if (vehiculo instanceof Moto) {
                System.out.println("Motos: ");
                System.out.println("Marca: "+vehiculo.getMarca()+" | Modelo: "+vehiculo.getModelo()+" | Velocidad: "+vehiculo.getVelocidadActual());
                System.out.println();
            }
            if (vehiculo instanceof Camion) {
                System.out.println("Camiones: ");
                System.out.println("Marca: "+vehiculo.getMarca()+" | Modelo: "+vehiculo.getModelo()+" | Velocidad: "+vehiculo.getVelocidadActual());
                System.out.println();
            }
        }



    }
}
