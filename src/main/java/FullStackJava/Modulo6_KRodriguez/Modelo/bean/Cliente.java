package FullStackJava.Modulo6_KRodriguez.Modelo.bean;
public class Cliente extends Usuario {
	
		//Declaración de atributos.
		private int rut;
		private String nombres;
		private String apellidos;
		private int telefono;
		private String afp;
		private String sis_salud;
		private String direccion;
		private String comuna;
		private int edad;
		
		//Constructor sin parametros.
		public Cliente() {}

		//Constructor con parámetros.
		public Cliente(int id_us, String nombre, int run, String fecha_nac, String tipo, int rut, String nombres, String apellidos, int telefono,
				String afp, String sis_salud, String direccion, String comuna, int edad) {
			super(id_us, nombre, run, fecha_nac, tipo);
			this.rut = rut;
			this.nombres = nombres;
			this.apellidos = apellidos;
			this.telefono = telefono;
			this.afp = afp;
			this.sis_salud = sis_salud;
			this.direccion = direccion;
			this.comuna = comuna;
			this.edad = edad;
		}
		

		//Métodos Get y Set.
		public int getRut() {
			return rut;
		}

		public void setRut(int rut) {
			this.rut = rut;
		}

		public String getNombres() {
			return nombres;
		}

		public void setNombres(String nombres) {
			this.nombres = nombres;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

		public String getAfp() {
			return afp;
		}

		public void setAfp(String afp) {
			this.afp = afp;
		}

		public String getSis_salud() {
			return sis_salud;
		}

		public void setSis_salud(String sis_salud) {
			this.sis_salud = sis_salud;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getComuna() {
			return comuna;
		}

		public void setComuna(String comuna) {
			this.comuna = comuna;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		//Método ToString. Heredamos los datos de Usuario.
		@Override
		public String toString() {
			
			return "Cliente [run "+ getRun() + ", nombre="+ getNombre() + ", rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
					+ ", afp=" + afp + ", sis_salud=" + sis_salud + ", direccion=" + direccion + ", comuna=" + comuna
					+ ", edad=" + edad + "]";
		}

}
