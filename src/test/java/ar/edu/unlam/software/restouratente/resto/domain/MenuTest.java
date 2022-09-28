package ar.edu.unlam.software.restouratente.resto.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuTest extends BaseTest {

    @Test
    public void RestouranteDebeTenerMenu() {
        assertEquals(restourante.getMenu(), menu);
    }

    @Test
    public void MenuDebeTenerNombre() {
        assertEquals(menu.getNombre(), "Menu principal");
    }

    @Test
    public void MenuDebeTenerDescripcion() {
        assertEquals(menu.getDescripcion(), "Menu principal del restourante de prueba");
    }

    @Test
    public void MenuDebeTenerProductos() {
        assertEquals(menu.getProductos().size(), 2);
    }
}
