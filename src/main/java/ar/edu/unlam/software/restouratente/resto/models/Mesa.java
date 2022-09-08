package ar.edu.unlam.software.restouratente.resto.models;

public class Mesa extends BaseObject{
    private int numero;
    private int capacidad;
    private boolean ocupada;

    public Mesa(int numero, int capacidad, boolean ocupada) {
        super();
        this.numero = numero;
        this.capacidad = capacidad;
        this.ocupada = ocupada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
