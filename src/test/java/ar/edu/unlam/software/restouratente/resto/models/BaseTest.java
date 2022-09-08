package ar.edu.unlam.software.restouratente.resto.models;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class BaseTest {
    protected Restourante restourante;
    protected Menu menu;
    protected Producto bebida;
    protected Producto comida;
    protected List<Ingrediente> ingredientesPapasConCheddar = new ArrayList<>();
    protected List<Ingrediente> ingredientesGinTonic = new ArrayList<>();

    protected Mesa mesa;

    @BeforeEach
    public void setUp(){
        restourante = new Restourante("Restourante de prueba");

        ingredientesPapasConCheddar.add(new Ingrediente("Papas"));
        ingredientesPapasConCheddar.add(new Ingrediente("Cheddar"));
        ingredientesPapasConCheddar.add(new Ingrediente("Aceite"));

        ingredientesGinTonic.add(new Ingrediente("Gin"));
        ingredientesGinTonic.add(new Ingrediente("Tonica"));
        ingredientesGinTonic.add(new Ingrediente("Hielo"));
        ingredientesGinTonic.add(new Ingrediente("Limón"));

        bebida = new Bebida("Gin Tonic", "Bebida alcohólica", 100, ingredientesGinTonic, 1);
        comida = new Comida("Papas con Cheddar", "Papas fritas con queso cheddar", 150, ingredientesPapasConCheddar, 0.5);

        var comidas = new ArrayList<Producto>();
        comidas.add(comida);
        comidas.add(bebida);

        menu = new Menu("Menu principal", "Menu principal del restourante de prueba",comidas);

        restourante.setMenu(menu);

        mesa = new Mesa(1, 4, false);
        restourante.agregarMesa(mesa);
        mesa = new Mesa(2, 4, false);
        restourante.agregarMesa(mesa);
        mesa = new Mesa(3, 4, false);
        restourante.agregarMesa(mesa);
    }
}
