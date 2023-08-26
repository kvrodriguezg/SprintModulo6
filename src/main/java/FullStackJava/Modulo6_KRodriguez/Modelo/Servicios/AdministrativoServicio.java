package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import FullStackJava.Modulo6_KRodriguez.Modelo.DAO.AdministrativoDAO;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Administrativo;

@Service
public class AdministrativoServicio implements IAdministrativoServicio{

	//Objeto AdminDAO
	@Autowired
	@Qualifier("AdminDAO")
	AdministrativoDAO AdminDAO;
	
	@Override
	public void editarAdmin(Administrativo us) {
		// TODO Auto-generated method stub
		
		//Utilizamos método para editar el administrativo.
		AdminDAO.editar(us);
	}

}
