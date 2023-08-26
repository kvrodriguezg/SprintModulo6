package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import FullStackJava.Modulo6_KRodriguez.Modelo.DAO.ClienteDAO;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Cliente;


@Service
public class ClienteServicio implements IClienteServicio{

	//Objeto ClienteDAO
		@Autowired
		@Qualifier("ClienteDAO")
		ClienteDAO clienteDAO;
	
	
	@Override
	public List<Cliente> obtenerClientes() {

		//Obtenemos lista de usuarios y lo retornamos.
		List<Cliente> listaUs = clienteDAO.Listar();
		return listaUs;			
	}


	@Override
	public void editarCliente(Cliente us) {
		// TODO Auto-generated method stub
		
		//Utilizamos método para editar el cliente.
		clienteDAO.editar(us);
		
	}
}
