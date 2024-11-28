package Und6_Pruebas_y_Ejs;

import java.util.Arrays;

public class Prueba_arrays {
    public static void main(String[] args) {

        //Rellena desde el primer número hasta el segundo (excluyendo este último) con el tercer número.
        int array[]= new int[4];
        Arrays.fill(array,0,1,1);
        System.out.println(Arrays.toString(array));

        //Te enseña en que posición esta el número que pones.
        int x[]= {1,2,3,4,5,6,7,8,9,10,11,12};
        Arrays.sort(x);
        System.out.println(Arrays.binarySearch(x,4));

        //Te ordena los numeros de menor a mayor.
        int v[]= {2,9,4,8,3,2,5,1,3,8};
        System.out.println(Arrays.toString(v));
        Arrays.sort(v);
        System.out.println(Arrays.toString(v));

        //Te dice si los valores de los arrays son iguales.
        int r[]=new int[5];
        int w[]=new int[5];

        System.out.println("r = "+Arrays.toString(r));
        System.out.println("w = "+Arrays.toString(w));
        System.out.println(Arrays.equals(r,w));
        Arrays.fill(r,-1);
        System.out.println("r = "+Arrays.toString(r));
        System.out.println(Arrays.equals(r,w));

        //Iguala los numeros del array que indicas y rellena con 0 si t has pasado.
        int z[]={2,9,4,5,1};
        int a[],b[];

        a=Arrays.copyOf(z,3);
        b=Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(z));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        //Te iguala los numeros del array que indica desde el primer numero hasta segundo(excluyendo este último).
        int y[]={21,2,9,4,34,5,1};
        int e[],i[];
        e=Arrays.copyOfRange(y,3,4);
        i=Arrays.copyOfRange(y,3,4);
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(i));

    }
}

