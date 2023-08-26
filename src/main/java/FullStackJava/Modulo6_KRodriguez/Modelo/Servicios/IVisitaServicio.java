package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;
import java.util.List;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Visita;

public interface IVisitaServicio {

	public List<Visita> obtenerVisitas();
	
	public void crear(Visita visita); 

}
