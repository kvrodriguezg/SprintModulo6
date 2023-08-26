package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;
import java.util.List;

import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Usuario;

public interface IUsuarioDAO {

	public List<Usuario> Listar();	
	public void Crear(Usuario us);
	
}
