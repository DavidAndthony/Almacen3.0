package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedidos {
	Manzana manzanas = new Manzana();
	Lechuga lechugas = new Lechuga();
	Leche leches = new Leche();
	ArrayList<Distribuidores> distribuidores = new ArrayList<Distribuidores>();
	ArrayList<Manzana> manzanass = new ArrayList<Manzana>();
	Scanner sc = new Scanner(System.in);
	int opcion;
	
	public void crearManzana(){


		System.out.println("\n¿Cuantas manzanas quieres registrar?: ");
						opcion = sc.nextInt();

					for(int o = 0; o < opcion; o++) {
						Manzana manzana = new Manzana();
						System.out.println("\nIntroduce el código de barras de la manzana: ");
						manzana.setCodBarras(sc.nextInt());
						System.out.println("\nTipo de manzana: ");
						manzana.setTipoManzana(sc.next());
						System.out.println("Procedencia de la manzana: ");
						manzana.setProcedencia(sc.next());
						System.out.println("Color: ");
						manzana.setColor(sc.next());
						System.out.println("€/Kg: ");
						manzana.setEurosKilo(sc.nextDouble());
						System.out.println("Nombre del distribuidor: ");
						Distribuidor distribuidor = new Distribuidor();
						distribuidor.setNombre(sc.next());
						for(int d = 0; d < distribuidores.size(); d++) {
							if((distribuidores.get(d).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
								manzana.setDistribuidor(distribuidores.get(d));
							}
						}
						manzanas.add(manzana);
					}
				
	}
	public void mostarManzanas(){
		for(int m = 0; m < manzanass.size(); m++) {
			System.out.println("manzana nº" + (m + 1));
			System.out.println("<><><><><><><><><><><><><><><><><><><><>");
			System.out.println("Tipo de manzana: "+(manzanass.get(m).getTipoManzana()));
			System.out.println("Prcedencia: "+(manzanass.get(m).getProcedencia()));
			System.out.println("Color: "+(manzanass.get(m).getColor()));
			System.out.println("€/Kg: "+(manzanass.get(m).getEurosKilo()));
			Distribuidor distribuidor = manzanass.get(m).getDistribuidor();
			System.out.println("Distribuidor: ");
			System.out.println("\tNombre: "+distribuidor.getNombre());
			System.out.println("\tCIF: "+distribuidor.getCif());
			//contacto
			System.out.println("\t\tNombre: "+(distribuidor.getContacto()).getNombre());
			System.out.println("\t\tApellido: "+(distribuidor.getContacto()).getApellido());
			System.out.println("\t\tTelefono: "+(distribuidor.getContacto()).getNumTelefonico());
			//direccion
			System.out.println("\t\tCiudad: "+(distribuidor.getDireccion()).getCiudad());
			System.out.println("\t\tCódigo postal: "+(distribuidor.getDireccion()).getCodigoPostal());
			System.out.println("\t\tCalle: "+(distribuidor.getDireccion()).getCalle());
			System.out.println("\t\tNumero: "+(distribuidor.getDireccion()).getNumero());
		
		}  		
	}
	
	
}
