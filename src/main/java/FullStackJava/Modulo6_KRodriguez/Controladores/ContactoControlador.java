package FullStackJava.Modulo6_KRodriguez.Controladores;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.ContactoServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Contacto;


@Controller
public class ContactoControlador {
	
	@Autowired
	ContactoServicio cont_creado;
	
	//Retornamos vista de contacto.
    @RequestMapping(path = "/contacto", method = RequestMethod.GET)
    public String mostrarContacto() {
        return "crear_contacto";
    }	
    
    
    @PostMapping(value= "/contacto_enviado")
    public String mostrarContactoEnv(HttpServletRequest request) {
        
    	//Creamos objeto contacto y le asignamos los atributos según lo ingresado.
    	Contacto cont = new Contacto();
    	cont.setNombre(request.getParameter(("nombre")));
    	cont.setEmail(request.getParameter(("email")));
    	cont.setTelefono(Integer.parseInt(request.getParameter(("telefono"))));
    	cont.setMensaje(request.getParameter(("mensaje")));
    	
    	//Llamamos al método para mostrar el contacto en consola.
    	cont_creado.Ingreso_Contacto(cont);
    	
    	return "contacto_env";
    }	
}
