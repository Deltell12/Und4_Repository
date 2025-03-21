package Und8_Parte2.Ejs.Ej8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparaSalario implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Empleado emp1 = (Empleado) o1;
        Empleado emp2 = (Empleado) o2;
        return (int)(emp1.calcularSalario() - emp2.calcularSalario());
    }


}


