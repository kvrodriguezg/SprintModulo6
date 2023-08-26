package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Chequeo;

@Repository
public class ChequeoDAO implements IChequeoDAO{
	
	//Objeto JdbcTemplate
	@Autowired
	JdbcTemplate template; 
	
	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}

	@Override
	public List<Chequeo> Listar() {
		// TODO Auto-generated method stub
		//Query.
		String sql = "SELECT * FROM prevencion_riesgos.chequeos;";
		
		//Obtenemos lista.
		List<Chequeo> listaChequeos = template.query(sql, new ChequeoRowMapper());
		return listaChequeos;
	}	
	
	class ChequeoRowMapper implements RowMapper<Chequeo>{

		@Override
		public Chequeo mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method 

			//Retornamos objeto Chequeo con datos de cada fila de la tabla.
			return new Chequeo(rs.getInt("id"),rs.getInt("visita_id"),rs.getString("detalle"),rs.getString("estado"));
		}		
	}

}
