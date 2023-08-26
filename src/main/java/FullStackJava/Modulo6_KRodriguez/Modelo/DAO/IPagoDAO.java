package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;

import java.util.List;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Pago;
public interface IPagoDAO {

	public List<Pago> Listar();	
	
	public void crear(Pago pago);
}
