package ar.edu.unlam.software.restouratente.resto.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductoTest extends BaseTest {

    @Test
    public void debeDevolvermeLaListaDeIngredientesDeUnProducto() {
        assertTrue(bebida.getIngredientes().equals(ingredientesGinTonic));
        assertTrue(comida.getIngredientes().equals(ingredientesPapasConCheddar));
    }

    @Test
    public void debeDevolvermeElNombreDeUnProducto() {
        assertTrue(bebida.getNombre().equals("Gin Tonic"));
        assertTrue(comida.getNombre().equals("Papas con Cheddar"));
    }

    @Test
    public void debeDevolvermeLaDescripcionDeUnProducto() {
        assertTrue(bebida.getDescripcion().equals("Bebida alcohólica"));
        assertTrue(comida.getDescripcion().equals("Papas fritas con queso cheddar"));
    }

    @Test
    public void debeDevolvermeElPrecioDeUnProducto() {
        assertTrue(bebida.getPrecio() == 100);
        assertTrue(comida.getPrecio() == 150);
    }

    @Test
    public void debeDevolvermeElTipoDeUnProducto() {
        assertTrue(Bebida.class.isInstance(bebida));
        assertTrue(Comida.class.isInstance(comida));
    }
}
