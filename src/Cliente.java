public class Cliente {

	private String nombre, apellidos, dni;
	private Direccion direccion;
	private Double num_socio, dto;

	public Cliente (){}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nom) {
		this.nombre = nom; 
	}

	public String getApellidos() {
		return this.apellidos;
	}
	public void setApellidos(String ape) {
		this.apellidos = ape;
	}

	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public Direccion getDireccion() {
		return this.direccion;
	}
	public void setDireccion(Direccion dire) {
		this.direccion = dire;
	}

	public Double getNum_socio() {
		return this.num_socio;
	}
	public void setNum_socio(Double num) {
		this.num_socio = num;
	}

	public Double getDto() {
		return this.dto;
	}
	public void setDto(Double dto) {
		this.dto = dto;
	}

}