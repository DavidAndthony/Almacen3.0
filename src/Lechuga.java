import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;


public class Lechuga {

//Declaracion de variables
	private String tipoLechuga, procedencia, color;
	private Double eurosUnidad;
	private Distribuidor distribuidor;
	private int codBarras;
//Constructor
	public Lechuga(){}
//Métodos getter y setter
	public String getTipoLechuga() {
		return this.tipoLechuga;
	}
	public void setTipoLechuga(String tipo) {
		this.tipoLechuga = tipo;
	}

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

	public Double getEurosUnidad() {
		return this.eurosUnidad;
	}
	public void setEurosUnidad(Double euros) {
		this.eurosUnidad = euros;
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

	public void crearLechuga(){

			System.out.println("\n¿Cuantas lechugas quieres registrar?: ");
					int opcion = sc.nextInt();
//crear lechugas y mostrarlas
					for(int o = 0; o < opcion; o++) {
						Lechuga lechuga = new Lechuga();
						System.out.println("\nIntroduce el código de barras de la lechuga: ");
						lechuga.setCodBarras(sc.nextInt());
						System.out.println("\nTipo de lechuga: ");
						lechuga.setTipoLechuga(sc.next());
						System.out.println("Procedencia de la lechuga: ");
						lechuga.setProcedencia(sc.next());
						System.out.println("Color: ");
						lechuga.setColor(sc.next());
						System.out.println("€/Uni: ");
						lechuga.setEurosUnidad(sc.nextDouble());
						System.out.println("Nombre del distribuidor: ");
						Distribuidor distribuidor = new Distribuidor();
						distribuidor.setNombre(sc.next());
						for(int d = 0; d < distribuidores.size(); d++) {
							if((distribuidores.get(d).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
								lechuga.setDistribuidor(distribuidores.get(d));
							}
						}
						lechugas.add(lechuga);
					}
					System.out.println("\nLas Lechugas: \n");

					for(int m = 0; m < lechugas.size(); m++) {
						System.out.println("Lechuga nº" + (m + 1));
						System.out.println("*************************************************");
						System.out.println("Código de barras: "+(lechugas.get(m).getCodBarras()));
						System.out.println("Tipo de lechuga: "+(lechugas.get(m).getTipoLechuga()));
						System.out.println("Prcedencia: "+(lechugas.get(m).getProcedencia()));
						System.out.println("Color: "+(lechugas.get(m).getColor()));
						System.out.println("€/Kg: "+(lechugas.get(m).getEurosUnidad()));
						Distribuidor distribuidor = lechugas.get(m).getDistribuidor();
						System.out.println("Distribuidor: ");
						System.out.println("\tNombre: "+distribuidor.getNombre());
						System.out.println("\tCIF: "+distribuidor.getCif());
						System.out.println("\tContacto: ");
						System.out.println("\t\tNombre: "+(distribuidor.getContacto()).getNombre());
						System.out.println("\t\tApellido: "+(distribuidor.getContacto()).getApellido());
						System.out.println("\t\tE-mail: "+(distribuidor.getContacto()).getEmail());
						System.out.println("\t\tTelefono: "+(distribuidor.getContacto()).getTelefono());
						System.out.println("\tDirección: ");
						System.out.println("\t\tCiudad: "+(distribuidor.getDireccion()).getCiudad());
						System.out.println("\t\tCalle: "+(distribuidor.getDireccion()).getCalle());
						System.out.println("\t\tNumero: "+(distribuidor.getDireccion()).getNumero());
						System.out.println("\t\tPiso: "+(distribuidor.getDireccion()).getPiso());
						System.out.println("\t\tLetra: "+(distribuidor.getDireccion()).getLetra());
						System.out.println("\t\tCódigo postal: "+(distribuidor.getDireccion()).getCodPostal());
						System.out.println("*************************************************");
					}
//escribir en fichero
					File listaLechugas = new File("./lechugas.txt");
					System.out.println("\nCreando el archivo lechugas.txt...");
					try{
						if(listaLechugas.createNewFile()) {
							System.out.println("\nArchivo creado correctamente.");
						}
					}catch(Exception ioe) {
						System.out.println("Error creando el archivo: "+ioe);
					}
					try {
						System.out.println("\nEscribiendo en el fichero listaLechugas.txt...");
						FileWriter escritor = new FileWriter(listaLechugas);
						for(int a=0; a<lechugas.size(); a++) {
							escritor.append(lechugas.get(a).getTipoLechuga()+";"+lechugas.get(a).getProcedencia()+";"+lechugas.get(a).getColor()+";"+lechugas.get(a).getEurosUnidad()+";"+lechugas.get(a).getCodBarras()+"\n");
						}
						escritor.close();
					}catch(Exception z) {
						System.out.println("Error, no se puede escribir en el fichero: "+z);
					}
	}
}