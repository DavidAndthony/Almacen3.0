package clases;

public abstract class Producto {
	
	private String procedencia, color;
	private Distribuidor distribuidor;
	private int codBarras;
	
	
	public String getProcedencia() {
		return this.procedencia;
	}
	public void setProcedencia(String proce) {
		this.procedencia = proce;
	}

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	public Distribuidor getDistribuidor() {
		return this.distribuidor;
	}
	public void setDistribuidor(Distribuidor distri) {
		this.distribuidor = distri;
	}

	public int getCodBarras() {
		return this.codBarras;
	}
	public void setCodBarras(int cod) {
		this.codBarras = cod;
	}
	
}
