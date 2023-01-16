package org.franco.model.entities;

public class Auto extends Vehiculo {

    private int asientos = 4;
    private int puertas = 2;
    private String nombre = "Auto";
    @Override
    public Vehiculo clonar() {
        return new Auto(this.asientos,this.puertas);
    }
    public Auto() {

    }

    public Auto(int asientos, int puertas) {
        super(asientos,puertas);

    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public int getPuertas() {
        return puertas;
    }
    public String toString(){
        return "Cantidad de puertas: "+ this.puertas+", cantidad de asientos: "+ this.asientos;
    }
}
