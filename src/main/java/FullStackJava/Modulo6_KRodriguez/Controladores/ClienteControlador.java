package FullStackJava.Modulo6_KRodriguez.Controladores;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.ClienteServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Cliente;

@Controller
public class ClienteControlador {

	@Autowired
	private ClienteServicio cliente;
	
	
    @RequestMapping(path = "/editar_cliente", method = RequestMethod.GET)
    public String mostrarEditarCliente() {
        return "editar_cliente";
    }
	
	@PostMapping(value= "/cliente_editado")
	public String editarCliente(HttpServletRequest request) {
		
		//Creamos objeto y le asignamos sus atributos según lo ingresado en formulario.
		Cliente us_cliente = new Cliente();
		us_cliente.setId_us(Integer.parseInt(request.getParameter("id")));
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
		
		//Utilizamos método editarCliente.
		cliente.editarCliente(us_cliente);
		
		return "us_editado";
	}
}
