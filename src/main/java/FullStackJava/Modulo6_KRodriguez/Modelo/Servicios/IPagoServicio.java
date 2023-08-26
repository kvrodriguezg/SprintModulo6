package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;
import java.util.List;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Pago;

public interface IPagoServicio {

	public List<Pago> obtenerPagos();
	
	public void crear(Pago pago); 
}
