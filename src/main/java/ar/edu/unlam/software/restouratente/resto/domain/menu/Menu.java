package ar.edu.unlam.software.restouratente.resto.domain.menu;

import ar.edu.unlam.software.restouratente.resto.domain.BaseObject;
import ar.edu.unlam.software.restouratente.resto.domain.productos.Producto;

import java.util.List;

public class Menu extends BaseObject {
    private String nombre;
    private String descripcion;
    private List<Producto> productos;

    public Menu(String nombre, String descripcion, List<Producto> productos) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.productos = productos;
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

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }
}
