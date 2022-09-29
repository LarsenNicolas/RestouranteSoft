package ar.edu.unlam.software.restouratente.resto.domain;

import ar.edu.unlam.software.restouratente.resto.domain.mesa.Mesa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestouranteTest extends BaseTest {
    @Test
    public void restouranteDebeTenerNombre() {
        assertEquals(restourante.getNombre(), "Restourante de prueba");
    }

    @Test
    public void debeOcuparseUnaMesa() {
        restourante.ocuparMesa(1);
        assertEquals(restourante.getMesaPorNumero(1).isOcupada(), true);
    }

    @Test
    public void debeDesocuparseUnaMesa() {
        restourante.desocuparMesa(1);
        assertEquals(restourante.getMesaPorNumero(1).isOcupada(), false);
    }

    @Test
    public void debeAgregarUnaMesa() {
        Mesa mesa = new Mesa(4, 4, false);
        assertEquals(restourante.getMesas().size(), 3);
        restourante.agregarMesa(mesa);
        assertEquals(restourante.getMesas().size(), 4);
    }

    @Test
    public void debeEliminarUnaMesa() {
        assertEquals(restourante.getMesas().size(), 3);
        restourante.eliminarMesa(1);
        assertEquals(restourante.getMesas().size(), 2);
    }

    @Test
    public void debeCambiarCapacidadDeUnaMesa() {
        restourante.cambiarCapacidadMesa(1, 6);
        assertEquals(6, restourante.getMesaPorNumero(1).getCapacidad());
    }

}
