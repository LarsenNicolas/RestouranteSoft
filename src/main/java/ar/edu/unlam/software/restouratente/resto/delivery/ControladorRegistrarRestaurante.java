package ar.edu.unlam.software.restouratente.resto.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorRegistrarRestaurante {
    @Autowired
    public ControladorRegistrarRestaurante(){
    }

    public ControladorRegistrarRestaurante( String nombreRestaurante){

    }

    @RequestMapping(path ="/restaurante", method = RequestMethod.GET)
    public ModelAndView irARegistrarRestaurante() {
        ModelMap modelo = new ModelMap();
        modelo.put("datosRestaurante", new DatosRestaurante());
        return new ModelAndView("restaurante", modelo);
    }

    public ModelAndView registrado() {
    }
}





}