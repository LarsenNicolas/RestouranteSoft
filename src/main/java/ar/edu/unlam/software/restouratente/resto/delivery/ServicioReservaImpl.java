package ar.edu.unlam.software.restouratente.resto.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.software.restouratente.resto.domain.Reserva;
import ar.edu.unlam.software.restouratente.resto.domain.mesa.Mesa;
import ar.edu.unlam.software.restouratente.resto.domain.usuarios.Cliente;

@Service("servicioReserva")
@Transactional
public class ServicioReservaImpl implements ServicioReserva{

	@Override
	public Reserva consultarReserva(Cliente cliente, Mesa mesa) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
