package Ejs_Und4;

public class prueba_bucles {
    public static void main(String[] args) {
        System.out.println("TABLAS DE MULTIPLICAR");
        for (int i = 1; i <=5; i++) {
            System.out.println("Tabla del "+i+":");
            for (int j = 1; j <=10; j++) {
                int tabla=i*j;
                if (tabla%2==0)
                System.out.print(tabla+" ");
                else {}
            }
            System.out.println();
        }
    }
}
