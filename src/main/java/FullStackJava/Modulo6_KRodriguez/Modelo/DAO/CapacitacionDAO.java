package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Capacitacion;

@Repository
public class CapacitacionDAO implements ICapacitacionDAO {

	//Objeto JdbcTemplate
	@Autowired
	JdbcTemplate template; 
	
	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}
	
	@Override
	public List<Capacitacion> Listar() {
		// TODO Auto-generated method stub
		
		//Query.
		String sql = "SELECT * FROM prevencion_riesgos.capacitaciones";
		
		//Obtenemos lista.
		List<Capacitacion> listacap = template.query(sql, new CapacitacionRowMapper());
		
		return listacap;
	}

	public void crear(Capacitacion cap) {
		// TODO Auto-generated method stub
		
		//Query.
		String sql = "INSERT INTO `prevencion_riesgos`.`capacitaciones` (`nombre`, `rut_cliente`, "
				+ "`lugar`, `dia`, `hora`, `duracion`, `asistentes`) "
				+ "VALUES (?,?,?,?,?,?,?);";
		
		//Especificamos parámetros a ingresar. 
		template.update(sql,new Object[] {cap.getNombre(), cap.getRut(), cap.getLugar(), cap.getDia(), cap.getHora(),
				cap.getDuracion(), cap.getCant_a()});	
	}
	
	class CapacitacionRowMapper implements RowMapper<Capacitacion>{

		@Override
		public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method 

			//Retornamos objeto Capacitacion con datos de cada fila de la tabla.
			return new Capacitacion(rs.getInt("id"),rs.getInt("rut_cliente"),rs.getString("nombre"),rs.getString("dia"),
					rs.getString("hora"), rs.getString("lugar"), rs.getString("duracion"), rs.getInt("asistentes"));
		}
		
	}
}
