package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;
import java.util.List;

import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Capacitacion;

public interface ICapacitacionServicio {

	public List<Capacitacion> obtenerCapacitaciones();
	public boolean crearCapacitacion(Capacitacion cap);
}
