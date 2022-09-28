package ar.edu.unlam.software.restouratente.resto.domain;

public class Persona {
    private final String nombre;
    private final String apellido;
    private final Long dni;

    public Persona(String nombre, String apellido, Long dni) {
        this.nombre     = nombre;
        this.apellido   = apellido;
        this.dni        = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Long getDni() {
        return dni;
    }

}
