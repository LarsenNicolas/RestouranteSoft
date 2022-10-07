package ar.edu.unlam.software.restouratente.resto.infrastructure;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import ar.edu.unlam.software.restouratente.resto.SpringTest;
import ar.edu.unlam.software.restouratente.resto.domain.restaurante.Restaurante;

public class RepositorioRegistroRestauranteTest extends SpringTest{
	
	@Autowired
	private RepositorioRestaurante repositorioRestaurante;
	
	@Test
	@Rollback
	@Transactional
	public void buscarRestauranteDeAdministradorTraerSoloLosDeAdministrador() {
		Administrador jose = dadoQueExisteAdministrador("Jose");
		Administrador mafalda = dadoQueExisteAdministrador("Mafalda");
		dadoQueExisteRestauranteDeAdministrador(jose);
		dadoQueExisteRestauranteDeAdministrador(mafalda);
		
		List<Restaurante> restaurantesDeMafalda = cuandoBuscoRestauranteDe(mafalda);
		entoncesEncuentro(restaurantesDeMafalda,1);
		
		
	}

	private void entoncesEncuentro(List<Restaurante> restaurantes, Integer cantidadEsperada) {
		assertThat(restaurantes).hasSize(cantidadEsperada);
	}

	private List<Restaurante> cuandoBuscoRestauranteDe(Administrador administrador) {
		
		return repositorioRestaurante.buscarPor(administrador);
	}

	private void dadoQueExisteRestauranteDeAdministrador(Administrador administrador) {
		Restaurante resto = new Restaurante();
		resto.setAdministrador(administrador);
		session().save(resto);
		
	}

	private Administrador dadoQueExisteAdministrador(String nombre) {
		Administrador administrador = new Administrador();
		administrador.setNombre(nombre);
		session().save(administrador);
		return administrador;
	}

}
