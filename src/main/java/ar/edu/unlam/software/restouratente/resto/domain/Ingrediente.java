package ar.edu.unlam.software.restouratente.resto.domain;

public class Ingrediente extends BaseObject{
    private String nombre;

    public Ingrediente(String nombre) {
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}