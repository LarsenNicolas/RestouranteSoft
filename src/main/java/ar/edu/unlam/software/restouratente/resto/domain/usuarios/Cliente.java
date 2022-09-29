package ar.edu.unlam.software.restouratente.resto.domain.usuarios;

import ar.edu.unlam.software.restouratente.resto.domain.usuarios.Usuario;

public class Cliente extends Usuario {
    public Cliente(String nombre, String apellido, Integer dni) {
        super(nombre,apellido,dni);
    }

}