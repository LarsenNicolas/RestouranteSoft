package ar.edu.unlam.software.restouratente.resto.delivery;

import ar.edu.unlam.software.restouratente.resto.domain.usuarios.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ControladorRestaurante {

    @Autowired
    public ControladorRestaurante(){
    }

    @RequestMapping(path ="/restaurante", method = RequestMethod.GET)
    public ModelAndView irARestaurante() {
        ModelMap modelo = new ModelMap();
        modelo.put("datosRestaurante", new DatosRestaurante());
        return new ModelAndView("restaurante", modelo);
    }




}