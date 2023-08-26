package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Pago;;
@Repository
public class PagoDAO implements IPagoDAO{

	//Objeto JdbcTemplate
	@Autowired
	JdbcTemplate template; 
	
	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}	
	
	@Override
	public List<Pago> Listar() {
		// TODO Auto-generated method stub
		//Query.
		String sql = "SELECT * FROM prevencion_riesgos.pagos;";
		
		//Obtenemos lista.
		List<Pago> listaPagos = template.query(sql, new PagoRowMapper());
		return listaPagos;
	}

	@Override
	public void crear(Pago pago) {
		// TODO Auto-generated method stub
		//Query
		String sql = "INSERT INTO Pagos (cliente_id, fecha_pago, monto) VALUES (?,?,?);";
		
		//Especificamos parámetros a ingresar. 
		template.update(sql,new Object[] {pago.getClienteId(), pago.getFechaPago(), pago.getMonto()});	
	}

	class PagoRowMapper implements RowMapper<Pago>{

		@Override
		public Pago mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method 

			//Retornamos objeto Pago con datos de cada fila de la tabla.
			return new Pago(rs.getInt("id"),rs.getInt("cliente_id"),rs.getInt("monto"),rs.getString("fecha_pago"));
		}		
	}
}
