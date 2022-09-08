package ar.edu.unlam.software.restouratente.resto.models;

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
        assertEquals(restourante.getMesa(1).isOcupada(), true);
    }

    @Test
    public void debeDesocuparseUnaMesa() {
        restourante.desocuparMesa(1);
        assertEquals(restourante.getMesa(1).isOcupada(), false);
    }

    @Test
    public void debeAgregarUnaMesa() {
        Mesa mesa = new Mesa(4, 4, false);
        restourante.agregarMesa(mesa);
        assertEquals(restourante.getMesa(4).getNumero(), 4);
    }

    @Test
    public void debeEliminarUnaMesa() {
        restourante.eliminarMesa(1);
        assertEquals(restourante.getMesa(1), null);
    }

    @Test
    public void debeCambiarCapacidadDeUnaMesa() {
        restourante.cambiarCapacidadMesa(1, 6);
        assertEquals(restourante.getMesa(1).getCapacidad(), 6);
    }

//    @Test(expected = RuntimeException.class)
//    public void debeLanzarExcepcionAlOcuparUnaMesaQueNoExiste() {
//        restourante.ocuparMesa(4);
//    }
}
