package clases;




public class Distribuidor {

	private String nombre, cif;
	private Direccion direccion;
	private Contacto personaContacto;

	public Distribuidor() {}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getCif() {
		return this.cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}

	public Direccion getDireccion() {
		return this.direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Contacto getContacto() {
		return this.personaContacto;
	}
	public void setContacto(Contacto contacto) {
		this.personaContacto = contacto;
	}


	

}	