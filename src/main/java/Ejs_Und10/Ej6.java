package Ejs_Und10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) throws SumaNumNegativo, RestaNumNegativo, MultNumNegativo,ErroresDivision {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce otro número: ");
        int numero2 = sc.nextInt();

        try{
            System.out.println("Suma: "+Suma(numero1, numero2));
            System.out.println("Resta: " +Resta(numero1,numero2));
            System.out.println("Multiplicación: " +Multiplicacion(numero1,numero2));
            System.out.println("División: " +Division(numero1,numero2));
        }
        catch(SumaNumNegativo | RestaNumNegativo | MultNumNegativo e){
            System.out.println("Uno de los parámetros es negativo");
        }

        catch (ErroresDivision e) {
            System.out.println("El divisor es negativo y por tanto no se puede realizar la división");
        }

    }

    public static int Suma (int numero1, int numero2) throws SumaNumNegativo {
        int suma = numero1 + numero2;

        if (numero1<0 || numero2<0){
            throw new SumaNumNegativo();
        }

        return suma;
    }

    public static int Resta (int numero1, int numero2) throws RestaNumNegativo {
        int resta = numero1 - numero2;

        if (numero1<0 || numero2<0){
            throw new RestaNumNegativo();
        }

        return resta;
    }

    public static int Multiplicacion (int numero1, int numero2) throws MultNumNegativo {
        int multiplicacion = numero1 * numero2;

        if (numero1<0 || numero2<0){
            throw new MultNumNegativo();
        }

        return multiplicacion;
    }

    public static int Division (int numero1, int numero2) throws ErroresDivision {

        int division = numero1/numero2;

        if (numero2==0) {
            throw new ErroresDivision();
        }


        return division;
    }

}
class SumaNumNegativo extends Exception {}
class RestaNumNegativo extends Exception {}
class MultNumNegativo extends Exception {}
class ErroresDivision extends Exception {}

