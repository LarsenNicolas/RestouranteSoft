package ar.edu.unlam.software.restouratente.resto.domain;

import java.util.List;

public class Bebida extends Producto {

    private double litros;

    public Bebida(String nombre, String descripcion, double precio, List<Ingrediente> ingredientes, double litros) {
        super(nombre, descripcion, precio, ingredientes);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}
