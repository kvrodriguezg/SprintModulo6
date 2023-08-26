package FullStackJava.Modulo6_KRodriguez.Modelo.Servicios;

import org.springframework.stereotype.Service;

import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Contacto;

@Service
public class ContactoServicio implements IContactoServicio{

	@Override
	public void Ingreso_Contacto(Contacto cont) {
		// TODO Auto-generated method stub
		
		//Se muestra información en consola.
		System.out.println(cont.toString());
	}

}
