package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;

import java.util.List;

import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Cliente;

public interface IClienteDAO {

	public List<Cliente> Listar();
	public void editar(Cliente cliente); 
}
