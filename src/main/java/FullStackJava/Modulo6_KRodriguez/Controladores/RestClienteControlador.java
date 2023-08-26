package FullStackJava.Modulo6_KRodriguez.Controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.ClienteServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Cliente;

@RestController
public class RestClienteControlador {
	
	@Autowired
	private ClienteServicio us;
	
	@RequestMapping(value="/api/clientes", headers = "Accept=application/json")
	public List<Cliente> obtenerCliente(){
		
		//retornamos lista de clientes.
		return us.obtenerClientes();
	}	
}
