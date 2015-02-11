package clases;

public class Lechuga extends Producto {
	private String tipoLechuga;
	private Double eurosUnidad;
	
	public Lechuga(){}
	
		public String getTipoLechuga() {
			return this.tipoLechuga;
		}
		public void setTipoLechuga(String tipo) {
			this.tipoLechuga = tipo;
		}
		public Double getEurosUnidad() {
			return this.eurosUnidad;
		}
		public void setEurosUnidad(Double euros) {
			this.eurosUnidad = euros;
		}

}
