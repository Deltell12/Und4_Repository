package Repeticiones;

public class Repeticion_Ej9 {
    public static void main(String[] args) {
        int i;
        int suma=0;
        int mult=1;
        for (i = 1; i <=10; i++) {
            suma = suma + i;
        }
        for (i=mult; i<=10; i++){
            mult = mult*i;
        }
        System.out.println(suma);
        System.out.println(mult);
    }
}
