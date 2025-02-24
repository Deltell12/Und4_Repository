package Und8.C;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Persona {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            Persona persona1 = new Persona("Adrian", "Deltell", 20, "20525446Q", Persona.EstadoCivil.SOLTERO);
            Persona persona2 = new Persona("Adrian", "Deltell", 20, "20525446Q", Persona.EstadoCivil.CASADO);

            System.out.println("Introduce la información siguiente: ");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            persona2.setNombre(nombre);
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            persona2.setApellido(apellido);
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            persona2.setEdad(edad);
            System.out.print("DNI: ");
            String dni = sc.next();
            persona2.setDni(dni);

            System.out.println(persona1.getNombre() + " " + persona1.getApellido() + " con DNI " + persona1.getDni() + " es mayor de edad ya que tiene " + persona1.getEdad() + " años.");

            if (persona2.getEdad() > 18) {
                System.out.println(persona2.getNombre() + " " + persona2.getApellido() + " con DNI " + persona2.getDni() + " es mayor de edad ya que tiene " + persona2.getEdad() + " años.");
            } else {
                System.out.println(persona2.getNombre() + " " + persona2.getApellido() + " con DNI " + persona2.getDni() + " es menor de edad ya que tiene " + persona2.getEdad() + " años.");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("El valor introducido no es valido");
        }
    }
}