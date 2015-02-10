public class Contacto {
//Declaración de variables
	String nombre, apellido, email;
	int telefono;
//Constructor
	public Contacto() {}
//Métodos getter y setter
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return this.telefono;
	}
	public void setTelefono(int telf) {
		this.telefono = telf;
	}
}