import java.util.ArrayList;

public class Cesta {

	private Cliente cliente;
	private ArrayList<Lechuga> lechugas;
	private ArrayList<Manzana> manzanas;
	private ArrayList<Leche> leches;

	public Cesta(){}

	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Lechuga> getLechugas() {
		return this.lechugas;
	}
	public void setLechugas(ArrayList<Lechuga> lechugas) {
		this.lechugas = lechugas;
	}

	public ArrayList<Manzana> getManzanas() {
		return this.manzanas;
	}
	public void setManzanas(ArrayList<Manzana> manzanas) {
		this.manzanas = manzanas;
	}

	public ArrayList<Leche> getLeches() {
		return this.leches;
	}
	public void setLeches(ArrayList<Leche> leches) {
		this.leches = leches;
	}

	public double calcular(ArrayList<Leche> leches, ArrayList<Manzana> manzanas, ArrayList<Lechuga> lechugas, Cliente cliente) {
		double lechuga = 0;
		double leche = 0;
		double manzana = 0;
		double descuento = cliente.getDto();
		double totalManzanas = 0, totalLeches = 0, totalLechugas = 0;
		for(int m = 0; m < manzanas.size(); m++) {
			totalManzanas = (manzanas.get(m).getEurosKilo())+manzana;
		}
		for(int l = 0; l < lechugas.size(); l++) {
			totalLechugas = lechugas.get(l).getEurosUnidad()+lechuga;
		}
		for(int e = 0; e < leches.size(); e++) {
			totalLeches = leches.get(e).getEurosLitro()+leche;
		}
		double subTotal = totalLeches+totalLechugas+totalManzanas;
		double totalDescuento = ((100-descuento)/100)*subTotal;
		return Math.rint(totalDescuento*100)/100;
	}
	public double calcularSinDescuento(ArrayList<Leche> leches, ArrayList<Manzana> manzanas, ArrayList<Lechuga> lechugas) {
		double lechuga = 0;
		double manzana = 0;
		double leche = 0;
		double totalManzanas = 0, totalLeches = 0, totalLechugas = 0;
		for(int m = 0; m < manzanas.size(); m++) {
			totalManzanas = (manzanas.get(m).getEurosKilo())+manzana;
		}
		for(int l = 0; l < lechugas.size(); l++) {
			totalLechugas = lechugas.get(l).getEurosUnidad()+lechuga;
		}
		for(int e = 0; e < leches.size(); e++) {
			totalLeches = leches.get(e).getEurosLitro()+leche;
		}
		double subTotal = totalLeches+totalLechugas+totalManzanas;
		return Math.rint(subTotal*100)/100;
	}

		public void cesta2(){

			Cesta cesta2 = new Cesta();
					System.out.println("\nLa cesta:");
					System.out.println("*************************************************");
					System.out.println("Manzanas:");
					System.out.println("*********");
					for(int m = 0; m < manzanas.size(); m++) {
						System.out.println("\tCod: " + manzanas.get(m).getCodBarras() + "\tNom: " + manzanas.get(m).getTipoManzana());
					}
					System.out.println("Lechugas:");
					System.out.println("*********");
					for(int l = 0; l < lechugas.size(); l++) {
						System.out.println("\tCod: " + lechugas.get(l).getCodBarras() + "\tNom: " + lechugas.get(l).getTipoLechuga());
					}
					System.out.println("Leche: ");
					System.out.println("******");
					for(int e = 0; e < leches.size(); e++) {
						System.out.println("\tCod: " + leches.get(e).getCodBarras() + "\tNom: " + leches.get(e).getTipo());
					}
					System.out.println("*************************************************");
					System.out.println("Sub-Total (sin descuento): " + cesta2.calcularSinDescuento(leches, manzanas, lechugas));
					System.out.println("*************************************************");
		}
		public void cesta3(){

			Cesta cesta = new Cesta();
					System.out.println("\nIntroduce el número de socio (1 - 4) del cliente: ");
					Double numeroSocio = sc.nextDouble();
					for(int c = 0; c < clientes.size(); c++) {
//Convertimos a int el valor de Num_socio para que no tenga que escribir decimales
						int d = (int) Math.floor(clientes.get(c).getNum_socio());
						if(d == numeroSocio) {
							cesta.setCliente(clientes.get(c));
						}
					}
					double resultado = cesta.calcular(leches, manzanas, lechugas, cesta.getCliente());
					System.out.println("\nLa cuenta: ");
					System.out.println("*****************************");
					System.out.println("Cliente: "+(cesta.getCliente()).getNombre());
					System.out.println("-----------------------------");
					System.out.println("Manzanas: ");
					for(int m = 0; m < manzanas.size(); m++) {
						System.out.println("\t"+manzanas.get(m).getTipoManzana());
					}
					System.out.println("Lechugas: ");
					for(int l = 0; l < lechugas.size(); l++) {
						System.out.println("\t"+lechugas.get(l).getTipoLechuga());
					}
					System.out.println("Leche: ");
					for(int e = 0; e < leches.size(); e++) {
						System.out.println("\t"+leches.get(e).getTipo());
					}
					System.out.println("-----------------------------");
					System.out.println("Total: "+resultado+"€");
					System.out.println("*****************************");
					leches.clear();
					manzanas.clear();
					lechugas.clear();
		}

}