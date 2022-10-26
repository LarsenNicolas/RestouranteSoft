package ar.edu.unlam.software.restouratente.resto.domain;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unlam.software.restouratente.resto.domain.mesa.Mesa;
import ar.edu.unlam.software.restouratente.resto.domain.usuarios.Cliente;

public class Reserva extends BaseObject{
	
	private Map <Cliente,Mesa>reservas;

	public Reserva() {
		
	}
	
	public Reserva(Cliente cliente, Mesa mesa) {
		
		reservas = new HashMap<Cliente,Mesa>();
		reservas.put(cliente,mesa);
	}

}
