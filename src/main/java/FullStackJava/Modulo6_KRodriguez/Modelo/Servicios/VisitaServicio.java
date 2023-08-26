package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import FullStackJava.Modulo6_KRodriguez.Modelo.DAO.VisitaDAO;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Visita;

@Service
public class VisitaServicio implements IVisitaServicio{
	
	//Objeto VisitaDAO
	@Autowired
	@Qualifier("VisitaDAO")
	VisitaDAO auxVisita;

	@Override
	public List<Visita> obtenerVisitas() {
		// TODO Auto-generated method stub
		
		//Obtenemos lista de visitas y la retornamos.
		List<Visita> listaVisitas = auxVisita.Listar();
		
		return listaVisitas;
	}

	@Override
	public void crear(Visita visita) {
		// TODO Auto-generated method stub
		auxVisita.crear(visita);
	}
}
