package ar.edu.unlam.software.restouratente.resto.domain.productos;

import java.util.List;

public class Comida extends Producto {

    private double peso;

    //TODO agregar atributos

    public Comida (String nombre, String descripcion, double precio, List<Ingrediente> ingredientes, double peso) {
        super(nombre, descripcion, precio, ingredientes);
        this.peso = peso;
    }


}
