package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import FullStackJava.Modulo6_KRodriguez.Modelo.DAO.ProfesionalDAO;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Profesional;

@Service
public class ProfesionalServicio implements IProfesionalServicio{

	//Objeto ProfDAO
	@Autowired
	@Qualifier("ProfDAO")
	ProfesionalDAO profDAO;
	
	@Override
	public void editarProf(Profesional us) {
		// TODO Auto-generated method stub
		
		//Utilizamos método para editar el profesional.
		profDAO.editar(us);
	}

	@Override
	public List<Profesional> obtenerProfesionales() {
		// TODO Auto-generated method stub
		//Obtenemos lista de usuarios y lo retornamos.
		List<Profesional> listaUs = profDAO.Listar();
		return listaUs;	
	}
}
