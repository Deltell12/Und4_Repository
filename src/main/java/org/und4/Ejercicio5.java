package org.und4;

public class Ejercicio5 {
    public static void main(String[] args) {
        int cont= 10;
        int limite=20;
        System.out.println((cont==0)&&(limite<20));
        System.out.println((limite>=0)||(cont<5));
       // System.out.println(((limite/(cont-10))>7)||(limite<20));
        System.out.println((limite<=20)||((limite/(cont-10))>7));
       // System.out.println(((limite/(cont-10)>7))&&(limite<0));
        System.out.println((limite<0)&&((limite/(cont-10))>7));

    }
}
