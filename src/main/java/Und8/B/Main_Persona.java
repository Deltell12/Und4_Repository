package Und8.B;

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
            persona2.nombre = sc.nextLine();
            System.out.print("Apellido: ");
            persona2.apellido = sc.nextLine();
            System.out.print("Edad: ");
            persona2.edad = sc.nextInt();
            System.out.print("DNI: ");
            persona2.dni = sc.next();

            System.out.println(persona1.nombre + " " + persona1.apellido + " con DNI " + persona1.dni + " es mayor de edad ya que tiene " + persona1.edad + " años, y además es ");

            if (persona2.edad > 18) {
                System.out.println(persona2.nombre + " " + persona2.apellido + " con DNI " + persona2.dni + " es mayor de edad ya que tiene " + persona2.edad + " años.");
            } else {
                System.out.println(persona2.nombre + " " + persona2.apellido + " con DNI " + persona2.dni + " es menor de edad ya que tiene " + persona2.edad + " años.");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("El valor introducido no es valido");
        }
    }
}