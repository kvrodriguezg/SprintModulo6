package FullStackJava.Modulo6_KRodriguez.Controladores;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.ClienteServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.ProfesionalServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.VisitaServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Cliente;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Profesional;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Visita;

@Controller
public class VisitaControlador {

	@Autowired
	VisitaServicio visitaAux;
	
	@Autowired
	ClienteServicio clienteAux;
	
	@Autowired
	ProfesionalServicio profAux;
	
	//Retornamos vista para crear visita.
    @RequestMapping(path = "/crear_visita", method = RequestMethod.GET)
    public String mostrarCrearVisita(HttpServletRequest request) {
		//Creamos ArrayList y le asignamos objetos mediante el método obtenerClientes.
    	ArrayList<Cliente> listaClientes = new ArrayList<>(clienteAux.obtenerClientes().size());
    	listaClientes.addAll(clienteAux.obtenerClientes());
    	
		//Creamos ArrayList y le asignamos objetos mediante el método obtenerProfesionales.
    	ArrayList<Profesional> listaProfesionales = new ArrayList<>(profAux.obtenerProfesionales().size());
    	listaProfesionales.addAll(profAux.obtenerProfesionales());    	
		
		//Asignamos el atributo.
		request.setAttribute("clientes",listaClientes);
		request.setAttribute("profesionales",listaProfesionales);
        return "crear_visita";
    }	
    
    
	@PostMapping(value= "/visitaCreada")
    public String mostrarVisitaCreada(HttpServletRequest request) {
		
		//Obtenemos datos de creación de visita.
			
			Visita visita = new Visita();
			visita.setClienteId(Integer.parseInt(request.getParameter("cliente_id")));
			visita.setFechaVisita(request.getParameter("fecha_visita"));
			visita.setDetalle(request.getParameter("detalle_visita"));
			visita.setProfesionalId(Integer.parseInt(request.getParameter("profesional_id")));

			visitaAux.crear(visita);
		
		//retornamos la vista.
        return "visita_creada";
        
    }
    
	//Retornamos vista para listar visitas.
    @RequestMapping(path = "/listar_visitas", method = RequestMethod.GET)
    public String mostrarListaVisitas(HttpServletRequest request) {
    		
		//Creamos ArrayList y le asignamos objetos mediante el método obtenerVisitas.	    	
    	ArrayList<Visita> listaVisitas = new ArrayList<>(visitaAux.obtenerVisitas().size());
    	listaVisitas.addAll(visitaAux.obtenerVisitas());
		
		//Asignamos el atributo.
		request.setAttribute("visitas",listaVisitas);
		
		//retornamos la vista.
        return "listar_visitas";
    }  
}
	

