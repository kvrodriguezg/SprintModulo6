package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;

import java.util.List;

import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Cliente;


public interface IClienteServicio {

	public List<Cliente> obtenerClientes();
	public void editarCliente(Cliente us);
	
}
