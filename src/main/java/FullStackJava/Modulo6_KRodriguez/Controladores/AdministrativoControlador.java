package FullStackJava.Modulo6_KRodriguez.Controladores;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.AdministrativoServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Administrativo;

@Controller
public class AdministrativoControlador {
	
	@Autowired
	private AdministrativoServicio admin;
	
	//Vista para editar administrativo.
    @RequestMapping(path = "/editar_admin", method = RequestMethod.GET)
    public String mostrarEditarCliente() {
        return "editar_admin";
    }
    
    @PostMapping(value= "/admin_editado")
	public String editarCliente(HttpServletRequest request) {
		
    	//Creamos objeto y le asignamos sus atributos según lo ingresado en formulario.
		Administrativo us_adm = new Administrativo();
		us_adm.setId_us(Integer.parseInt(request.getParameter("id")));
		us_adm.setNombre(request.getParameter("nombre"));
		us_adm.setRun(Integer.parseInt(request.getParameter("run")));
		us_adm.setTipo("Administrativo");
		us_adm.setFecha_nac(request.getParameter("fecha_nac"));
		us_adm.setArea(request.getParameter("area"));
		us_adm.setExp_previa(request.getParameter("exp"));
		
		//Utilizamos método editarAdmin.		
		admin.editarAdmin(us_adm);
		return "us_editado";
	}

}
