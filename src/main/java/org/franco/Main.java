package org.franco;

import org.franco.model.entities.Auto;
import org.franco.model.entities.Vehiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Desarrollo del patron de protoipos");
        Vehiculo auto1 = new Auto();

        Vehiculo auto2 = auto1.clonar();
        System.out.println(auto1+"    "+auto2);
    }
}