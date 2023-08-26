package FullStackJava.Modulo6_KRodriguez.Modelo.bean;

public class Contacto {
	
	String nombre;
	String email;
	int telefono;
	String mensaje;

	//Constructores.
	public Contacto() {
		super();
	}
	public Contacto(String nombre, String email, int telefono, String mensaje) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.mensaje = mensaje;
	}
	
	//Getters y Setters.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	//ToString	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + ", mensaje=" + mensaje
				+ "]";
	}
	

}
