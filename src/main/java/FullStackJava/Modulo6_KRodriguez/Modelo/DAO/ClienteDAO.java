package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Cliente;

@Repository
public class ClienteDAO implements IClienteDAO{

	//Objeto JdbcTemplate
	@Autowired
	JdbcTemplate template; 

	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}

	//Listar Usuarios Clientes.
	@Override
	public List<Cliente> Listar() {
		// TODO Auto-generated method stub
		
		//Query.
		String sql = "select id, nombre, tipo, run, f_nac, rut, nombres, apellidos, telefono, afp, sis_salud,"
				+ "direccion, comuna, edad from usuarios where tipo='Cliente';";
		
		//Obtenemos lista.
		List<Cliente> listaUs = template.query(sql, new ClienteRowMapper());
		return listaUs;
	}
	
	//Editar Cliente
	public void editar(Cliente cliente) {
		
		//Query
	    String sql = "update usuarios set nombre=?, run=?, f_nac=?, rut=?, nombres=?, apellidos=?, "
	            + "telefono=?, afp=?, sis_salud=?, direccion=?, comuna=?, edad=? where id=?";

	    template.update(sql, new Object[] {
	            cliente.getNombre(), cliente.getRun(), cliente.getFecha_nac(), cliente.getRut(),
	            cliente.getNombres(), cliente.getApellidos(), cliente.getTelefono(), cliente.getAfp(),
	            cliente.getSis_salud(), cliente.getDireccion(), cliente.getComuna(), cliente.getEdad(),
	            cliente.getId_us()});
	}
	
	
	class ClienteRowMapper implements RowMapper<Cliente>{

		@Override
		public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method 
			
			//Retornamos objeto Cliente con datos de cada fila de la tabla.
			return new Cliente(rs.getInt("id"),rs.getString("nombre"),rs.getInt("run"),rs.getString("f_nac"),
					rs.getString("tipo"),rs.getInt("rut"),rs.getString("nombres"),rs.getString("apellidos"),
					rs.getInt("telefono"),rs.getString("afp"),rs.getString("sis_salud"),rs.getString("direccion"),
					rs.getString("comuna"),rs.getInt("edad"));
		}
		
	}
}
