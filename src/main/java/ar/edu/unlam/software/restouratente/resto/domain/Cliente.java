package ar.edu.unlam.software.restouratente.resto.domain;

public class Cliente extends Persona {
    private final Integer id;

    public Cliente(String nombre, String apellido, Long dni, Integer id) {
        super(nombre,apellido,dni);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}