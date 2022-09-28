package ar.edu.unlam.software.restouratente.resto.domain;

public class Mozo extends Persona {
    private final Integer legajo;

    public Mozo(String nombre, String apellido, Long dni, Integer legajo) {
        super(nombre,apellido,dni);
        this.legajo =  legajo;
    }

    public Integer getLegajo() {
        return legajo;
    }
}
