package ar.edu.unlam.software.restouratente.resto.delivery;

import ar.edu.unlam.software.restouratente.resto.domain.mesa.Mesa;
import ar.edu.unlam.software.restouratente.resto.domain.usuarios.Cliente;

public class DatosReserva {
	 private Cliente cliente;
	    private Mesa mesa;
	    
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		public Mesa getMesa() {
			return mesa;
		}
		public void setMesa(Mesa mesa) {
			this.mesa = mesa;
		}
	   
}

