package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import FullStackJava.Modulo6_KRodriguez.Modelo.DAO.CapacitacionDAO;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Capacitacion;

@Service
public class CapacitacionServicio implements ICapacitacionServicio{
	
	//Objeto CapacitacionDAO
	@Autowired
	@Qualifier("CapDAO")
	CapacitacionDAO auxcap;

	@Override
	public List<Capacitacion> obtenerCapacitaciones() {
		// TODO Auto-generated method stub
				
		//Obtenemos lista de capacitaciones y lo retornamos.
		List<Capacitacion> listaCap = auxcap.Listar();
		return listaCap;	
	}

	@Override
	public boolean crearCapacitacion(Capacitacion cap) {
		// TODO Auto-generated method stub
		
		//Ingresamos objeto de tipo Capacitacion en método crear.
		auxcap.crear(cap);
		
		return true;
	}
}
