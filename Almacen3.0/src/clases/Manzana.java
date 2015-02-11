package clases;

public class Manzana extends Producto {
	
	private String tipoManzana;
	private Double eurosKilo;
	
	public Manzana(){}
	
		public String getTipoManzana() {
			return this.tipoManzana;
		}
		public void setTipoManzana(String tipo) {
			this.tipoManzana = tipo;
		}
		public Double getEurosKilo() {
			return this.eurosKilo;
		}
		public void setEurosKilo(Double euros) {
			this.eurosKilo = euros;
		}

		public void add(Manzana manzana) {
			// TODO Auto-generated method stub
			
		}

}
