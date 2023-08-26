package FullStackJava.Modulo6_KRodriguez.Modelo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Administrativo;

@Repository
public class AdministrativoDAO {

	//Objeto JdbcTemplate
	@Autowired
	JdbcTemplate template; 

	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}
	
	//Editar Administrativo
	public void editar(Administrativo admin) {
		
		//Query
	    String sql = "update usuarios set nombre=?, run=?, f_nac=?, area=?, exp_prev=? where id=?";

	    template.update(sql, new Object[] {
	    		admin.getNombre(), admin.getRun(), admin.getFecha_nac(), admin.getArea(),
	    		admin.getExp_previa(), admin.getId_us()});
	}
	
}
