package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;
import java.util.List;

import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Capacitacion;

public interface ICapacitacionDAO {

	public List<Capacitacion> Listar();	
	public void crear(Capacitacion cap);
}
