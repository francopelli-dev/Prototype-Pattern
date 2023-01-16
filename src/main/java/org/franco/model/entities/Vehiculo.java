package org.franco.model.entities;

public abstract class Vehiculo {
    private int asientos;
    private int puertas;
    private String nombre;

    public Vehiculo(int asientos, int puertas) {
        this.asientos = asientos;
        this.puertas = puertas;
    }
    public Vehiculo(){

    }

    public Vehiculo clonar(){
        return null;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
