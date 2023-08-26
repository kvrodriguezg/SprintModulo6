package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import FullStackJava.Modulo6_KRodriguez.Modelo.DAO.UsuarioDAO;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Usuario;

@Service
public class UsuarioServicio implements IUsuarioServicio{
	
	//Objeto UsuarioDAO
	@Autowired
	@Qualifier("UsDAO")
	UsuarioDAO auxUs;
	
	@Override
	public List<Usuario> obtenerUsuarios() {
		// TODO Auto-generated method stub
		
		//Obtenemos lista de usuarios y lo retornamos.
		List<Usuario> listaUs = auxUs.Listar();
		return listaUs;	
	}

	@Override
	public void crear(Usuario us) {
		// TODO Auto-generated method stub
		
		auxUs.Crear(us);
	}
}
