package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Profesional;

@Repository
public class ProfesionalDAO implements IProfesionalDAO{

	//Objeto JdbcTemplate
	@Autowired
	JdbcTemplate template; 

	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}
	
	//Editar Profesional.
	@Override
	public void editar(Profesional prof) {
		// TODO Auto-generated method stub
		//Query
	    String sql = "update usuarios set nombre=?, run=?, f_nac=?, titulo=?, f_ingreso=? where id=?";

	    template.update(sql, new Object[] {
	            prof.getNombre(), prof.getRun(), prof.getFecha_nac(), prof.getTitulo(),
	            prof.getFecha_ingreso(), prof.getId_us()});
	}

	@Override
	public List<Profesional> Listar() {
		// TODO Auto-generated method stub
		//Query.
		String sql = "select id, nombre, tipo, run, f_nac, titulo, f_ingreso from usuarios where tipo='Profesional';";
		
		//Obtenemos lista.
		List<Profesional> listaUs = template.query(sql, new ProfesionalRowMapper());
		return listaUs;
	}
	
	class ProfesionalRowMapper implements RowMapper<Profesional>{

		@Override
		public Profesional mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method 
			
			//Retornamos objeto Profesional con datos de cada fila de la tabla.
			return new Profesional(rs.getInt("id"),rs.getString("nombre"),rs.getInt("run"),rs.getString("f_nac"),
					rs.getString("tipo"),rs.getString("titulo"),rs.getString("f_ingreso"));
		}
		
	}
}
