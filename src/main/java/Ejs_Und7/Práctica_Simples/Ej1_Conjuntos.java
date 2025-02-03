package Ejs_Und7.Práctica_Simples;

import java.util.*;

public class Ej1_Conjuntos {
    public static void main(String[] args) {

        ArrayList<String> lista= new ArrayList<>();
        lista.add("Alberto");
        lista.add("Ana");
        lista.add("Juan");
        lista.add("Michelle");
        lista.add("Jose");
        lista.add("Paulo");
        lista.add("Ana");

        System.out.println(eliminaRepeticiones(lista));
    }

    public static TreeSet<String> eliminaRepeticiones(List<String> lista){
        TreeSet<String> listasinrepetir = new TreeSet<>(lista);
        return listasinrepetir;
    }
}
