package ar.edu.unlam.software.restouratente.resto.domain;

import ar.edu.unlam.software.restouratente.resto.domain.mesa.Mesa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestauranteTest extends BaseTest {
	
    @Test
    public void restouranteDebeTenerNombre() {
        assertEquals(restaurante.getNombre(), "Restourante de prueba");
    }

    @Test
    public void debeOcuparseUnaMesa() {
        restaurante.ocuparMesa(1);
        assertEquals(restaurante.getMesaPorNumero(1).isOcupada(), true);
    }

    @Test
    public void debeDesocuparseUnaMesa() {
        restaurante.desocuparMesa(1);
        assertEquals(restaurante.getMesaPorNumero(1).isOcupada(), false);
    }

    @Test
    public void debeAgregarUnaMesa() {
        Mesa mesa = new Mesa(4, 4, false);
        assertEquals(restaurante.getMesas().size(), 3);
        restaurante.agregarMesa(mesa);
        assertEquals(restaurante.getMesas().size(), 4);
    }

    @Test
    public void debeEliminarUnaMesa() {
        assertEquals(restaurante.getMesas().size(), 3);
        restaurante.eliminarMesa(1);
        assertEquals(restaurante.getMesas().size(), 2);
    }

    @Test
    public void debeCambiarCapacidadDeUnaMesa() {
        restaurante.cambiarCapacidadMesa(1, 6);
        assertEquals(6, restaurante.getMesaPorNumero(1).getCapacidad());
    }


}
