package ar.edu.unlam.software.restouratente.resto.delivery;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.software.restouratente.resto.SpringTest;
import ar.edu.unlam.software.restouratente.resto.domain.restaurante.Restaurante;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ControladorRegistrarRestauranteTest extends SpringTest{

    ControladorRegistrarRestaurante controladorRegistrarRestaurante = new ControladorRegistrarRestaurante();

    @Test
    public void queSePuedaRegistrarUnRestaurante(){

        dadoQueExisteUnControldaroRestaurante("Mi Resto");

		ModelAndView nav = cuandoVoyARegistrarUnRestaurante();

		entoncesEncuentro(nav, "Mi Resto");
		
    }
    
    private void entoncesEncuentro(ModelAndView nav, String nombre) {
    	assertThat(nav.getModel().get("restaurantes")).hasToString(nav.getViewName());//as("Mi Resto");
    }

	private ModelAndView cuandoVoyARegistrarUnRestaurante() {
		return controladorRegistrarRestaurante.irARegistrarRestaurante();
	}

	private void dadoQueExisteUnControldaroRestaurante(String nombre) {
		ControladorRegistrarRestaurante controladorRegistrarRestaurante = new ControladorRegistrarRestaurante("Mi Resto");
	}


}