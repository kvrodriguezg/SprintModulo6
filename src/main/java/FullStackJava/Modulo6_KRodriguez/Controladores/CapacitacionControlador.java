package FullStackJava.Modulo6_KRodriguez.Controladores;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.CapacitacionServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Capacitacion;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Cliente;


@Controller
public class CapacitacionControlador {

	@Autowired
	CapacitacionServicio capAux;
	@Autowired
    RestClienteControlador clienteRest;
	
	/*Se crea una capacitación, además se utiliza el servicio Rest de clientes y se muestra la lista mediante consola*/
	@PostMapping(value= "/capCreada")
    public String mostrarCapCreada(HttpServletRequest request) {
    	
		Capacitacion cap = new Capacitacion();
		
    	//asignamos atributos ingresados.
		cap.setNombre(request.getParameter(("nombre")));
		cap.setRut(Integer.parseInt(request.getParameter(("rutcliente"))));
		cap.setDia(request.getParameter("dia"));
		cap.setDuracion(request.getParameter("duracion"));
		cap.setHora(request.getParameter("hora"));
		cap.setLugar(request.getParameter("lugar"));
		cap.setCant_a(Integer.parseInt(request.getParameter(("cant_a"))));
    	
		//Ingresamos objeto al método.
		capAux.crearCapacitacion(cap);
		
		//Se obtiene lista de clientes del servicio Rest.
		List<Cliente> clientes = clienteRest.obtenerCliente();
		
		//Se recorre la lista y se muestra por consola.
	    for (Cliente cliente : clientes) {
	        System.out.println(cliente.toString());
	    } 
		
		//retornamos la vista.
        return "cap_creada";
        
    }	
	
		
	//Retornamos vista para crear capacitación.
    @RequestMapping(path = "/crear_capacitacion", method = RequestMethod.GET)
    public String mostrarCrearCap() {
        return "crear_capacitacion";
    }	
    
	//Retornamos vista para listar capacitación.
    @RequestMapping(path = "/listar_capacitaciones", method = RequestMethod.GET)
    public String mostrarListaCap(HttpServletRequest request) {
    		
		//Creamos ArrayList y le asignamos objetos mediante el método ObtenerCapacitaciones.	    	
    	ArrayList<Capacitacion> listaCap = new ArrayList<>(capAux.obtenerCapacitaciones().size());
    	listaCap.addAll(capAux.obtenerCapacitaciones());
		
		//Asignamos el atributo.
		request.setAttribute("capacitaciones",listaCap);
		
		//retornamos la vista.
        return "listar_capacitaciones";
    }  
}
	

