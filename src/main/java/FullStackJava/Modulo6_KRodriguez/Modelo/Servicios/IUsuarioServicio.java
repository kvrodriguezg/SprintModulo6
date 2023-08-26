package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;

import java.util.List;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Usuario;

public interface IUsuarioServicio {

	public List<Usuario> obtenerUsuarios();
	
	public void crear(Usuario us);

}
