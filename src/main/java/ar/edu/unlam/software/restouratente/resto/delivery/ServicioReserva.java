package ar.edu.unlam.software.restouratente.resto.delivery;

import ar.edu.unlam.software.restouratente.resto.domain.Reserva;
import ar.edu.unlam.software.restouratente.resto.domain.mesa.Mesa;
import ar.edu.unlam.software.restouratente.resto.domain.usuarios.Cliente;

public interface ServicioReserva {

	Reserva consultarReserva(Cliente cliente, Mesa mesa);

}
