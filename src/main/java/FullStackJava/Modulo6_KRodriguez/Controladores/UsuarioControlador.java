package FullStackJava.Modulo6_KRodriguez.Controladores;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.UsuarioServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.*;


@Controller
public class UsuarioControlador {
	
	@Autowired
	UsuarioServicio usAux;

    @RequestMapping(path = "/crear_usuario", method = RequestMethod.GET)
    public String mostrarCrearUsuario() {
        return "crear_usuario";	
}
    
    @RequestMapping(path = "/listar_usuarios", method = RequestMethod.GET)
    public String mostrarListarUsuario(HttpServletRequest request) {
		//Creamos ArrayList y le asignamos objetos mediante el método ObtenerUsuarios.	    	
    	ArrayList<Usuario> listaUs = new ArrayList<>(usAux.obtenerUsuarios().size());
    	listaUs.addAll(usAux.obtenerUsuarios());
		
		//Asignamos el atributo.
		request.setAttribute("usuarios",listaUs);
		
		//retornamos la vista.
        return "listar_usuarios";	
}
    
	@PostMapping(value= "/usuarioCreado")
    public String mostrarUsCreado(HttpServletRequest request) {
    	
		int tipo = (Integer.parseInt(request.getParameter(("tipo"))));
		
		//Obtenemos datos de registro según tipo de usuario.
		if(tipo == 1)
		{
			Administrativo us_adm = new Administrativo();
			us_adm.setNombre(request.getParameter("nombre"));
			us_adm.setRun(Integer.parseInt(request.getParameter("run")));
			us_adm.setTipo("Administrativo");
			us_adm.setFecha_nac(request.getParameter("fecha_nac"));
			us_adm.setArea(request.getParameter("area"));
			us_adm.setExp_previa(request.getParameter("exp"));
			
			usAux.crear(us_adm);
		}
		if(tipo==2)
		{	
			
			Cliente us_cliente = new Cliente();
			us_cliente.setNombre(request.getParameter("nombre"));
			us_cliente.setRun(Integer.parseInt(request.getParameter("run")));
			us_cliente.setTipo("Cliente");
			us_cliente.setFecha_nac(request.getParameter("fecha_nac"));
			us_cliente.setRut(Integer.parseInt(request.getParameter("rut")));
			us_cliente.setNombres(request.getParameter("nombres"));
			us_cliente.setApellidos(request.getParameter("apellidos"));
			us_cliente.setTelefono(Integer.parseInt(request.getParameter("telefono")));
			us_cliente.setAfp(request.getParameter("afp"));
			us_cliente.setDireccion(request.getParameter("direccion"));
			us_cliente.setComuna(request.getParameter("comuna"));
			us_cliente.setEdad(Integer.parseInt(request.getParameter("edad")));
			us_cliente.setSis_salud(request.getParameter("sis_salud"));
			
			usAux.crear(us_cliente);
		}
		else if(tipo==3)
		{
			Profesional us_profesional = new Profesional();
			us_profesional.setNombre(request.getParameter("nombre"));
			us_profesional.setRun(Integer.parseInt(request.getParameter("run")));
			us_profesional.setTipo("Profesional");
			us_profesional.setFecha_nac(request.getParameter("fecha_nac"));
			us_profesional.setTitulo(request.getParameter("titulo"));
			us_profesional.setFecha_ingreso(request.getParameter("f_ingreso"));		
			usAux.crear(us_profesional);	
		}
    
		
		//retornamos la vista.
        return "us_creado";
        
    }
    
}
