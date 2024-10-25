package org.und4;

public class Conversiones {
    public static void main(String[] args) {
        //de int a char
        char a = (char) 500;
        System.out.println(a);

        //de float a char
        char b = (char) 2000.53f;
        System.out.println(b);

        //de float a int
        int c= (int) 14.67565f;
        System.out.println(c);

        //Formas de convertir variables a String
        String v1= ""+'a'; //v1 es a
        String v2= ""+845; //v2 es 845
        String v3= ""+23.78f; //v3 es 23.78
        boolean encontrado = true;
        String v4= ""+encontrado; //v4 es "TRUE"
        System.out.printf("%s / %s / %s / %s%n", v1, v2,v3,v4);

        //Fromas de converitr variables a String (función valueOf)
        String v5= String.valueOf('a'); //v5 es a
        String v6= String.valueOf(865); //v6 es 865
        String v7= String.valueOf(23.78f); //v7 es 23.78
        String v8= String.valueOf(encontrado); //v8 es "TRUE"
        System.out.printf("%s / %s / %s / %s%n", v5, v6,v7,v8);

        //No se puede convertir String a Char, pero sí extraer caracteres de
        //determinada posición
        String v10= "Hola como estás";
        System.out.println("LENGTH VAR10: "+v10.length());
        char v= "Viernes".charAt(0); //v es V
        char l= "Lunes".charAt(4); //l es S
        System.out.println("Ejemplo de charAt: "+v+""+l);

        //parseInt() y parseFloat()
        String n1= "213";
        int n11= Integer.parseInt(n1); //n11 es 213

        String n2= "23.78";
        float n22= Float.parseFloat(n2); // n22 es 23.78
        System.out.println("Ejemplo parseInt: "+n11+" y parseFloat: "+n22);
    }
}
