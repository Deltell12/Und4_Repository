package org.und4;

public class Repeticion_Ej11 {
    public static void main(String[] args) {
        int i;
        int par= 0;
        int impar=0;

        for (i=100; i<=200;i++){
            if (i%2==0){
                par=par+i;
            }
            else {
                impar=impar+i;
            }
        }
        System.out.println("Suma de los números pares del 100 al 200: "+par);
        System.out.println("Suma de los números impares del 100 al 200: "+impar);
    }
}
