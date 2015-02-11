package clases;

public class Leche extends Producto {
	private String tipo;
	private Double eurosLitro;
	
	public Leche(){}

		public String getTipo() {
			return this.tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public Double getEurosLitro() {
			return this.eurosLitro;
		}
		public void setEurosLitro(Double euros) {
			this.eurosLitro = euros;
		}
}
