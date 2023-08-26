package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;
import java.util.List;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Profesional;

public interface IProfesionalServicio {

	public void editarProf(Profesional us);
	public List<Profesional> obtenerProfesionales();
}
