package FullStackJava.Modulo6_KRodriguez.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InicioControlador {
	
	//Retornamos vista de inicio.
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String mostrarInicio() {
        return "inicio";
    }
    
    @RequestMapping(path = "/inicio", method = RequestMethod.GET)
    public String mostrarInicio2() {
        return "inicio";
    }    
}
