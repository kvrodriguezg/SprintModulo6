package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Visita;

@Repository
public class VisitaDAO implements IVisitaDAO{

	//Objeto JdbcTemplate
	@Autowired
	JdbcTemplate template; 
	
	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}	
	
	@Override
	public List<Visita> Listar() {
		// TODO Auto-generated method stub
		//Query.
		String sql = "SELECT * FROM prevencion_riesgos.visitas;";
		
		//Obtenemos lista.
		List<Visita> listaVisita = template.query(sql, new VisitaRowMapper());
		return listaVisita;
	}

	class VisitaRowMapper implements RowMapper<Visita>{

		@Override
		public Visita mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method 

			//Retornamos objeto Visita con datos de cada fila de la tabla.
			return new Visita(rs.getInt("id"),rs.getInt("cliente_id"),rs.getString("fecha_visita"),
					rs.getString("detalle"),rs.getInt("profesional_id"));
		}
		
	}

	@Override
	public void crear(Visita visita) {
		// TODO Auto-generated method stub
		//Query
		String sql = "INSERT INTO Visitas (cliente_id, fecha_visita, detalle, profesional_id) VALUES (?,?,?,?);";
		
		//Especificamos parámetros a ingresar. 
		template.update(sql,new Object[] {visita.getClienteId(), visita.getFechaVisita(), visita.getDetalle(), visita.getProfesionalId()});	
	}	
}
