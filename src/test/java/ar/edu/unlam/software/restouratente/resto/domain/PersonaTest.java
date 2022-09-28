package ar.edu.unlam.software.restouratente.resto.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {
    @Test
    public void queSeCreeLaPersonaElClienteYelMozoCorrectamente(){
        // Preparacion
        Persona mozo;
        Persona cliente;
        final String NOMBRE_ESPERADO_MOZO = "Laura" , APELLIDO_ESPERADO_MOZO = "Gomez";
        final String NOMBRE_ESPERADO_CLIENTE = "Marta", APELLIDO_ESPERADO_CLIENTE = "Rios" ;
        final Long DNI_ESPERADO_MOZO  = 32475698L, DNI_ESPERADO_CLIENTE = 33845907L;
        final Integer LEGAJO_ESPERADO = 12345, ID_ESPERADO = 1000;


        //Ejecucion
        mozo    = new Mozo(NOMBRE_ESPERADO_MOZO, APELLIDO_ESPERADO_MOZO, DNI_ESPERADO_MOZO,LEGAJO_ESPERADO);
        cliente = new Cliente (NOMBRE_ESPERADO_CLIENTE, APELLIDO_ESPERADO_CLIENTE, DNI_ESPERADO_CLIENTE,ID_ESPERADO);

        //validacion
        assertEquals(cliente.getNombre(), NOMBRE_ESPERADO_CLIENTE);
        assertEquals(cliente.getApellido(), APELLIDO_ESPERADO_CLIENTE);
        assertEquals(cliente.getDni(), DNI_ESPERADO_CLIENTE);
        assertEquals(((Cliente) cliente).getId(), ID_ESPERADO);

        assertEquals(mozo.getNombre(), NOMBRE_ESPERADO_MOZO);
        assertEquals(mozo.getApellido(), APELLIDO_ESPERADO_MOZO);
        assertEquals(mozo.getDni(), DNI_ESPERADO_MOZO);
        assertEquals(((Mozo) mozo).getLegajo(), LEGAJO_ESPERADO);

    }
}