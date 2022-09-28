package ar.edu.unlam.software.restouratente.resto.domain;

import java.util.List;

public abstract class Producto extends BaseObject {
    private String nombre;
    private String descripcion;
    private double precio;
    private List<Ingrediente> ingredientes;

    public Producto(String nombre, String descripcion, double precio, List<Ingrediente> ingredientes) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes (List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
