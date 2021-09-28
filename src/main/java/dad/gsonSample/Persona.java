package dad.gsonSample;

public class Persona {

		public String Nombre;
		public String Apellido;
		public int Edad;
		
		public Persona(String nombre,String apellido,int edad) {
			this.Nombre=nombre;
			this.Apellido=apellido;
			this.Edad=edad;
			
		}
		public Persona() {
			
		}

		public String getNombre() {
			return Nombre;
		}

		

		public String getApellido() {
			return Apellido;
		}

		

		public int getEdad() {
			return Edad;
		}

		

}
