public class Direccion {
//Declaración de variables
	private String ciudad, calle;
	private int numero, piso, codPostal;
	private char letra;
//Constructor
	public Direccion() {}
//Métodos getter y setter
	public String getCiudad() {
		return this.ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return this.calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return this.piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}

	public int getCodPostal() {
		return this.codPostal;
	}
	public void setCodPostal(int cod) {
		this.codPostal = cod;
	}

	public char getLetra() {
		return this.letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
}