package ar.edu.unlam.software.restouratente.resto.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorRegistrarRestaurante {

    @Autowired
    public ControladorRegistrarRestaurante(){
    }

    public ControladorRegistrarRestaurante( String nombreRestaurante){

    }

    @RequestMapping(path = "/registrarRestaurante", method = RequestMethod.GET)
    public ModelAndView irARegistrarRestaurante() {
        ModelMap modelo = new ModelMap();
        return new ModelAndView("registrarRestaurante", modelo);
    }

    @RequestMapping(path = "/registroRestauranteExitoso/nombre/{nombreRestaurante}", method = RequestMethod.GET)
    public ModelAndView irARegistroExitosoRestaurante(@PathVariable String nombreRestaurante) {
    	ModelMap modelo = new ModelMap();
    	modelo.put("nombre", nombreRestaurante);
    	return new ModelAndView("registroRestauranteExitoso", modelo);
    }
    
   
}





