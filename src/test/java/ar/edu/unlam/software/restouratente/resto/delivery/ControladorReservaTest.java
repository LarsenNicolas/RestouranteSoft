package ar.edu.unlam.software.restouratente.resto.delivery;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.software.restouratente.resto.SpringTest;
import ar.edu.unlam.software.restouratente.resto.domain.mesa.Mesa;
import ar.edu.unlam.software.restouratente.resto.domain.usuarios.Cliente;

public class ControladorReservaTest extends SpringTest{
	
	private boolean ocupada;
	Mesa mesa = new Mesa(1,4,ocupada);
	Cliente juan = new Cliente("juan","bringa",111);
	Set <Cliente> clientes = new HashSet<>(); 
	List <Mesa> mesas = new ArrayList<>();
	
	ControladorReserva controladorReserva = new ControladorReserva();
	
	 @Test
	    public void queSePuedaRegistrarUnRestaurante(){

	        dadoQueExisteUnCliente(juan);

			ModelAndView nav = cuandoVoyARegistrarUnaReserva(juan,4,asignarMesa());

			entoncesEncuentro(nav, "Juan");
			
	    }
	 
	 @Test
	 public void queSeIndiqueTiempoDeEsperaSiNoHayMesaDisponible() {
		 
		 dadoQueExisteUnCliente(juan);

			ModelAndView nav = cuandoBuscoLaReservaDe(juan,mesa);

			entoncesEncuentro(nav, "Juan");
		 
	 }

	private ModelAndView cuandoBuscoLaReservaDe(Cliente cliente, Mesa mesa) {
		
		return null;
	}

	private void entoncesEncuentro(ModelAndView nav, String string) {
		assertThat(nav.getModel().get("reserva")).hasToString(nav.getViewName());
	}

	private void dadoQueExisteUnCliente(Cliente cliente) {
		clientes.add(cliente);
		
	}

	private ModelAndView cuandoVoyARegistrarUnaReserva(Cliente cliente, Integer comensales, Integer numeroMesa) {
		
		return controladorReserva.irARegistrarReserva();
	}

	private Integer asignarMesa() {
		Integer mesaAsignada=0;
		
		for (Mesa mesa : mesas) {
			if(mesa.isOcupada()) {
				return mesaAsignada;
		}else {
			mesaAsignada=mesa.getNumero();
		}
		}
		return mesaAsignada;
	}

	

}
