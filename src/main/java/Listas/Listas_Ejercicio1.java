package Listas;

import java.util.ArrayList;
import java.util.Iterator;

public class Listas_Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        int cont=1;

        lista.add("Josemi");
        lista.add("Fran");
        lista.add("Toni");
        lista.add("Juanma");
        lista.add("Unai");
        lista.add("Yago");

        Iterator<String> it = lista.iterator();

        for (Iterator<String> i = lista.iterator(); i.hasNext();) {
            System.out.println("Compañero " + cont+" : "+i.next());
            cont++;
        }
    }
}
