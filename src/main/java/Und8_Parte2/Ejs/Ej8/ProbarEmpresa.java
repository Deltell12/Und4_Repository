package Und8_Parte2.Ejs.Ej8;

import java.util.*;

public class ProbarEmpresa {
    public static void main(String[] args) {
        try {

            ArrayList<Empleado> empleados = new ArrayList<>();
            ArrayList<Dispositivo> dispositivos = new ArrayList<>();

            Dispositivo dispositivo1 = new Portatil("HP", Estado.apagado);
            Dispositivo dispositivo2 = new Portatil("HP", Estado.encendido);
            Dispositivo dispositivo3 = new Portatil("Mac", Estado.apagado);
            Empleado empleado1 = new JefeEquipo("Paco", 1600.70, dispositivo1, EstadoVPN.conectado);
            Empleado empleado2 = new Administrativo("Pedro", 1200, dispositivo2);
            Empleado empleado3 = new Programador("Maria", 1800, dispositivo1, EstadoVPN.conectado);
            empleados.add(empleado1);
            empleados.add(empleado2);
            empleados.add(empleado3);

            System.out.println(dispositivo1.equals(dispositivo2));
            System.out.println(dispositivo1.equals(dispositivo3));

            int cont = 1;
            empleados.sort(new ComparaSalario());

            System.out.println("RANKING POR SALARIO: ");
            System.out.println("=========================================================================");
            for (Empleado emp : empleados) {
                System.out.println(cont + " -> " + emp.toString());
                cont++;
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
