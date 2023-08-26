package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;
import java.util.List;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Profesional;

public interface IProfesionalDAO {

	public List<Profesional> Listar();
	public void editar(Profesional prof); 
}
