package Und8.A;

import java.util.Scanner;

public class Main_Persona {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.nombre = "Adrián";
        persona1.apellido = "Deltell";
        persona1.edad = 20;
        persona1.dni = "20525446Q";

        System.out.println("Introduce la información siguiente: ");
        System.out.print("Nombre: ");
        persona2.nombre = sc.nextLine();
        System.out.print("Apellido: ");
        persona2.apellido = sc.nextLine();
        System.out.print("Edad: ");
        persona2.edad = sc.nextInt();
        System.out.print("DNI: ");
        persona2.dni = sc.next();



        System.out.println(persona1.nombre + " " + persona1.apellido + " con DNI " + persona1.dni+ " es mayor de edad ya que tiene "+persona1.edad+" años.");

        if (persona2.edad>18) {
            System.out.println(persona2.nombre + " " + persona2.apellido + " con DNI " + persona2.dni + " es mayor de edad ya que tiene " + persona2.edad + " años.");
        }
        else {
            System.out.println(persona2.nombre + " " + persona2.apellido + " con DNI " + persona2.dni + " es menor de edad ya que tiene " + persona2.edad + " años.");
        }
    }
}




