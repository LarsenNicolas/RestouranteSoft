package ar.edu.unlam.software.restouratente.resto.models;

import java.util.ArrayList;
import java.util.List;

public class Restourante extends BaseObject {
    private String nombre;
    private String direccion;
    private String telefono;
    private String descripcion;
    private String horario;
    private Menu menu;
    private List<Mesa> mesas;

    public Restourante(String nombre, String direccion, String telefono, String descripcion, String horario) {
        super();
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.horario = horario;
        mesas = new ArrayList<Mesa>();
    }

    public Restourante(String nombre) {
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public boolean agregarMesa(Mesa mesa) {
        return mesas.add(mesa);
    }

    public void ocuparMesa(int numeroMesa) {
        mesas.get(numeroMesa).setOcupada(true);
    }

    public Mesa getMesa(int numeroMesa) {
        return mesas.get(numeroMesa);
    }

    public void desocuparMesa(int numeroMesa) {
        mesas.get(numeroMesa).setOcupada(false);
    }

    public void eliminarMesa(int numeroMesa) {
        mesas.remove(numeroMesa);
    }

    public void cambiarCapacidadMesa(int numeroMesa, int nuevaCapacidad) {
        mesas.get(numeroMesa).setCapacidad(nuevaCapacidad);
    }
}
