package ar.edu.unlam.software.restouratente.resto.delivery;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ControladorRegistrarRestauranteTest {

    ControladorRegistrarRestaurante controladorRegistrarRestaurante = new ControladorRegistrarRestaurante();

    @Test
    public void queSePuedaRegistrarUnRestaurante(){

        ControladorRegistrarRestaurante controladorRegistrarRestaurante = new ControladorRegistrarRestaurante("Lo de Juan");

        ModelAndView nav = controladorRegistrarRestaurante.registrado();



        assertThat((List<Restaurante>)nav.getModel().get("nombres")).hasSize(1);

    }


}