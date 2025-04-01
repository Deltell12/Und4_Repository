package Und8_Parte2.Ejs.Ej8;

import java.util.*;

public class ProbarEmpresa {
    public static void main(String[] args) {
        try {

            Empresa empresa1 = new Empresa("Dominica");


            Dispositivo dispositivo1 = new Portatil("HP", Estado.apagado);
            Dispositivo dispositivo2 = new Portatil("HP", Estado.encendido);
            Dispositivo dispositivo3 = new Portatil("Mac", Estado.apagado);
            Empleado empleado1 = new JefeEquipo("Paco", 1000, dispositivo1, EstadoVPN.conectado);
            Empleado empleado2 = new Administrativo("Pedro", 1200, dispositivo2);
            Empleado empleado3 = new Programador("Maria", 2000, dispositivo1, EstadoVPN.desconectado);


            empresa1.aniadirEmpleado(empleado1);
            empresa1.aniadirEmpleado(empleado2);
            empresa1.aniadirEmpleado(empleado3);


            System.out.println(dispositivo1.equals(dispositivo2));
            System.out.println(dispositivo1.equals(dispositivo3));

            System.out.println(empleado1.mostrarInformacion());

            int cont = 1;
            empresa1.getEmpleados().sort(new ComparaSalario());

            System.out.println("RANKING POR SALARIO: ");
            System.out.println("=========================================================================");
            for (Empleado emp : empresa1.getEmpleados()) {
                    System.out.println(cont + " -> " + emp.toString());
                    cont++;
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
