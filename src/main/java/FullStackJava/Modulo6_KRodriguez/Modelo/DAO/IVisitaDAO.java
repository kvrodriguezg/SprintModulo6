package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;
import java.util.List;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Visita;

public interface IVisitaDAO {

	public List<Visita> Listar();	
	
	public void crear(Visita visita);
	
}
