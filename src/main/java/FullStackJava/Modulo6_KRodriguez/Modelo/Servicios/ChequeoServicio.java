package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import FullStackJava.Modulo6_KRodriguez.Modelo.DAO.ChequeoDAO;
import FullStackJava.Modulo6_KRodriguez.Modelo.DAO.IChequeoServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Chequeo;

@Service
public class ChequeoServicio implements IChequeoServicio{

	//Objeto ChequeoDAO
	@Autowired
	@Qualifier("ChequeoDAO")
	ChequeoDAO auxChequeo;
	
	@Override
	public List<Chequeo> obtenerChequeos() {
		// TODO Auto-generated method stub
				
		//Obtenemos lista de chequeos y la retornamos.
		List<Chequeo> listaChequeos = auxChequeo.Listar();
		return listaChequeos;	
	}
}
