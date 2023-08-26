package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import FullStackJava.Modulo6_KRodriguez.Modelo.DAO.PagoDAO;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Pago;

@Service
public class PagoServicio implements IPagoServicio{

	//Objeto VisitaDAO
	@Autowired
	@Qualifier("PagoDAO")
	PagoDAO auxPago;
	
	@Override
	public List<Pago> obtenerPagos() {
		// TODO Auto-generated method stub
		//Retornamos lista de pagos.
		return auxPago.Listar();
	}

	@Override
	public void crear(Pago pago) {
		// TODO Auto-generated method stub
		//Implementamos método para crear pago.
		auxPago.crear(pago);
	}

}
