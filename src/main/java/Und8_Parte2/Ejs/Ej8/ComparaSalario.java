package Und8_Parte2.Ejs.Ej8;

import java.util.Comparator;

public class ComparaSalario implements Comparator<Empleado> {

    @Override
    public int compare(Empleado emp1, Empleado emp2) {

        return (int)(emp1.salarioBase - emp2.salarioBase);
    }


}


