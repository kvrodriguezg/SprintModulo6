package FullStackJava.Modulo6_KRodriguez.Controladores;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.ChequeoServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Chequeo;

@Controller
public class ChequeoControlador {
	
	@Autowired
	ChequeoServicio auxChequeo;	
	
	//Retornamos vista para listar chequeos.
    @RequestMapping(path = "/listar_chequeos", method = RequestMethod.GET)
    public String mostrarListaChequeos(HttpServletRequest request) {
    		
		//Creamos ArrayList y le asignamos objetos mediante el método ObtenerChequeos.	    	
    	ArrayList<Chequeo> listaChequeo = new ArrayList<>(auxChequeo.obtenerChequeos().size());
    	listaChequeo.addAll(auxChequeo.obtenerChequeos());
		
		//Asignamos el atributo.
		request.setAttribute("chequeos",listaChequeo);
		
		//retornamos la vista.
        return "listar_chequeos";
    }  
}
