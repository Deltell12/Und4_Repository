package Und8_Parte2.Ejs.Ej2;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {

        try {
            ArrayList<Empleado> empleados = new ArrayList<>();

            Empleado empleado1 = new JefeEquipo("Pedro Javier Chico", 2000);
            Empleado empleado2 = new Programador("Juan Carlos Perez", 1700);
            Empleado empleado3 = new Administrativo("Carlos Javier Murcia", 1450);

            empleados.add(empleado1);
            empleados.add(empleado2);
            empleados.add(empleado3);

            for (Empleado empleado : empleados) {
                System.out.println(empleado.mostrarInfo());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
