package FullStackJava.Modulo6_KRodriguez.Modelo.bean;

public class Usuario {
	
		//Declaracion de atributos.
		private int id_us;
		private String nombre;
		private int run;
		private String fecha_nac;
		private String tipo;
		
		
		//Constructor sin parámetros.
		public Usuario() {};

		//Constructor con parámetros.
		public Usuario(int id_us, String nombre, int run, String fecha_nac, String tipo) {
			super();
			this.id_us = id_us;
			this.nombre = nombre;
			this.run = run;
			this.fecha_nac = fecha_nac;
			this.tipo = tipo;
		}

		//Métodos Get y Set.
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getRun() {
			return run;
		}

		public void setRun(int run) {
			this.run = run;
		}

		public String getFecha_nac() {
			return fecha_nac;
		}

		public void setFecha_nac(String fecha_nac) {
			this.fecha_nac = fecha_nac;
		}
		
		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		//Método toString.
		@Override
		public String toString() {
			return "Usuario [nombre=" + nombre + ", run=" + run + ", fecha_nac=" + fecha_nac + ", tipo=" + tipo + "]";
		}

		public int getId_us() {
			return id_us;
		}

		public void setId_us(int id_us) {
			this.id_us = id_us;
		}	
}
