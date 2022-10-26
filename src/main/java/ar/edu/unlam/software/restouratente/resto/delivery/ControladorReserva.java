package ar.edu.unlam.software.restouratente.resto.delivery;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.software.restouratente.resto.domain.Reserva;
import ar.edu.unlam.software.restouratente.resto.domain.usuarios.Cliente;

@Controller
public class ControladorReserva {
	
	private ServicioReserva servicioReserva;
	
	 @Autowired
	    public ControladorReserva(){
	    }
	 
	 public ControladorReserva(ServicioReserva servicioReserva){
		 this.servicioReserva = servicioReserva;
	    }

	    public ControladorReserva( Cliente cliente){

	    }

	    @RequestMapping(path = "/registrarReserva", method = RequestMethod.GET)
	    public ModelAndView irARegistrarReserva() {
	        ModelMap modelo = new ModelMap();
	        ModelAndView nav= new ModelAndView("reserva", modelo);
	        
	       return nav;
	    }
	    
	    @RequestMapping(path = "/reservaExitosa", method = RequestMethod.POST)
	    public ModelAndView mostrarResera(@ModelAttribute("datosReserva") DatosReserva datosReserva, HttpServletRequest request) {
	        ModelMap model = new ModelMap();
	        
	        Reserva reservaBuscada = servicioReserva.consultarReserva(datosReserva.getCliente(), datosReserva.getMesa());
	        if(reservaBuscada != null) {
	        	request.getSession().setAttribute("ROL", reservaBuscada.getId());
	        	 return new ModelAndView("reservaExitosa", model);
	        }else {
		        model.put("error", "Usuario o clave incorrecta");

	        }
	         
	        return new ModelAndView("reserva",model);
	    }
	   
}
