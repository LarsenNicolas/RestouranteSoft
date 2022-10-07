package ar.edu.unlam.software.restouratente.resto.infrastructure;

import java.util.List;

import ar.edu.unlam.software.restouratente.resto.domain.restaurante.Restaurante;

public interface RepositorioRestaurante {

	public List<Restaurante> buscarPor(Administrador administrador);
}
