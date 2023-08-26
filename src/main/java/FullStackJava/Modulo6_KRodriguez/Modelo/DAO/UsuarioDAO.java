package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Administrativo;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Cliente;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Profesional;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Usuario;

@Repository
public class UsuarioDAO implements IUsuarioDAO{

	//Objeto JdbcTemplate
	@Autowired
	JdbcTemplate template; 
	
	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}
	
	//Listar Usuarios.
	@Override
	public List<Usuario> Listar() {
		// TODO Auto-generated method stub
		
		//Query.
		String sql = "select id, nombre, tipo, run, f_nac from usuarios;";
		
		//Obtenemos lista.
		List<Usuario> listaUs = template.query(sql, new UsuarioRowMapper());
		return listaUs;
	}
	
	class UsuarioRowMapper implements RowMapper<Usuario>{

		@Override
		public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method 

			//Retornamos objeto Usuario con datos de cada fila de la tabla.
			return new Usuario(rs.getInt("id"),rs.getString("nombre"),rs.getInt("run"),rs.getString("f_nac"),
					rs.getString("tipo"));
		}
		
	}
	
	public void Crear(Usuario us)
	{
			//Establecemos query de creación de usuario según su tipo.
			if (us instanceof Cliente)
			{
				Cliente cliente = (Cliente) us;
				//Query.
				String sql = "insert into usuarios(nombre,run,tipo,f_nac,rut,nombres,apellidos,telefono,afp,"
						+ "sis_salud,direccion,comuna,edad) values (?,?,?,?,?,?,?,?,?,?,?,?,?);";

				//Especificamos parámetros a ingresar. 
				template.update(sql,new Object[] {cliente.getNombre(), cliente.getRun(), cliente.getTipo(), cliente.getFecha_nac(), cliente.getRut(),
				cliente.getNombres(), cliente.getApellidos(), cliente.getTelefono(), cliente.getAfp(), cliente.getSis_salud(), cliente.getDireccion(),
				cliente.getComuna(), cliente.getEdad()});	
			}
			else if (us instanceof Administrativo)
			{
				Administrativo admin = (Administrativo) us;
				//Query
				String sql = "insert into usuarios(nombre,run,tipo,f_nac,area,exp_prev) values (?,?,?,?,?,?);";
				//Especificamos parámetros a ingresar. 
				template.update(sql,new Object[] {admin.getNombre(), admin.getRun(), admin.getTipo(), admin.getFecha_nac(),
						admin.getArea(), admin.getExp_previa()});
			}
			else if (us instanceof Profesional)
			{
				Profesional prof = (Profesional) us;
				//Query
				String sql = "insert into usuarios(nombre,run,tipo,f_nac,titulo,f_ingreso) values (?,?,?,?,?,?);";
				//Especificamos parámetros a ingresar.
				template.update(sql,new Object[] {prof.getNombre(), prof.getRun(), prof.getTipo(), prof.getFecha_nac(),
						prof.getTitulo(), prof.getFecha_ingreso()});
			}
		}	
	}

