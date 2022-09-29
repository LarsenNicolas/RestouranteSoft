package ar.edu.unlam.software.restouratente.resto.domain.usuarios;

import ar.edu.unlam.software.restouratente.resto.domain.usuarios.Usuario;

public class Mozo extends Usuario {
    private final Integer legajo;

    public Mozo(String nombre, String apellido, Integer dni, Integer legajo) {
        super(nombre,apellido,dni);
        this.legajo =  legajo;
    }

    public Integer getLegajo() {
        return legajo;
    }
}
