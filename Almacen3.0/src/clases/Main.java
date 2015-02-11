package clases;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distribuidores distris = new Distribuidores();
		distris.leerDistribuidores();
		//distris.mostrarDistribuidores();
		
		
		
		Pedidos  pedidos = new Pedidos ();
		pedidos.crearManzana();
		pedidos.mostarManzanas();
	}

}
