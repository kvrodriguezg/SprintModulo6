package FullStackJava.Modulo6_KRodriguez.Modelo.bean;
public class Profesional extends Usuario{
	
		//Declaracion de atributos.
		private String titulo;
		private String fecha_ingreso;
		
		//Constructor con parámetros.
		public Profesional(int id_us, String nombre, int run, String fecha_nac, String tipo, String titulo, String fecha_ingreso) {
			super(id_us, nombre, run, fecha_nac, tipo);
			this.titulo = titulo;
			this.fecha_ingreso = fecha_ingreso;
		}

		//Constructor sin parámetros.
		public Profesional() {};

		//Métodos Get y Set.
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getFecha_ingreso() {
			return fecha_ingreso;
		}

		public void setFecha_ingreso(String fecha_ingreso) {
			this.fecha_ingreso = fecha_ingreso;
		}

		//Método ToString. Heredamos los datos de Usuario.
		@Override
		public String toString() {
			return "Profesional [run "+ getRun() + ", nombre="+ getNombre() +", titulo=" + titulo + ", fecha_ingreso=" + fecha_ingreso + "]";
		}

}
