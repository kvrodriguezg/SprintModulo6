package FullStackJava.Modulo6_KRodriguez.Controladores;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.ProfesionalServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Profesional;


@Controller
public class ProfesionalControlador {

	@Autowired
	private ProfesionalServicio prof;
	
	//Vista para editar profesional.
    @RequestMapping(path = "/editar_prof", method = RequestMethod.GET)
    public String mostrarEditarCliente() {
        return "editar_prof";
    }
    
    @PostMapping(value= "/prof_editado")
	public String editarCliente(HttpServletRequest request) {
		
		//Creamos objeto y le asignamos sus atributos según lo ingresado en formulario.
		Profesional us_prof = new Profesional();
		us_prof.setId_us(Integer.parseInt(request.getParameter("id")));
		us_prof.setNombre(request.getParameter("nombre"));
		us_prof.setRun(Integer.parseInt(request.getParameter("run")));
		us_prof.setTipo("Administrativo");
		us_prof.setFecha_nac(request.getParameter("fecha_nac"));
		us_prof.setTitulo(request.getParameter("titulo"));
		us_prof.setFecha_ingreso(request.getParameter("f_ingreso"));
		
		
		
		//Utilizamos método editarCliente.
		prof.editarProf(us_prof);
		
		return "us_editado";
	}
}
