public class Manzana {

//Declaracion de variables
	private String tipoManzana, procedencia, color;
	private Double eurosKilo;
	private Distribuidor distribuidor;
	private int codBarras;
//Constructor
	public Manzana(){}
//Métodos getter y setter
	public String getTipoManzana() {
		return this.tipoManzana;
	}
	public void setTipoManzana(String tipo) {
		this.tipoManzana = tipo;
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

	public Double getEurosKilo() {
		return this.eurosKilo;
	}
	public void setEurosKilo(Double euros) {
		this.eurosKilo = euros;
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

	public void crearManzana(){


		System.out.println("\n¿Cuantas manzanas quieres registrar?: ");
						opcion = sc.nextInt();
//crear y mostrar manzanas
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
					System.out.println("\nLas Manzanas: \n");

					for(int m = 0; m < manzanas.size(); m++) {
						System.out.println("Manzana nº" + (m + 1));
						System.out.println("*************************************************");
						System.out.println("Código de barras: "+(manzanas.get(m).getCodBarras()));
						System.out.println("Tipo de manzana: "+(manzanas.get(m).getTipoManzana()));
						System.out.println("Prcedencia: "+(manzanas.get(m).getProcedencia()));
						System.out.println("Color: "+(manzanas.get(m).getColor()));
						System.out.println("€/Kg: "+(manzanas.get(m).getEurosKilo()));
						Distribuidor distribuidor = manzanas.get(m).getDistribuidor();
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
//escribir en archivo
					File listaManzanas = new File("./listaManzanas.txt");
					System.out.println("\nCreando el archivo listaManazanas.txt...");
					try{
						if(listaManzanas.createNewFile()) {
							System.out.println("\nArchivo creado correctamente.");
						}
					}catch(Exception ioe) {
						System.out.println("Error creando el archivo: "+ioe);
					}
					try {
						System.out.println("\nEscribiendo en el fichero listaManzanas.txt...");
						FileWriter escritor = new FileWriter(listaManzanas);
						for(int a=0; a<manzanas.size(); a++) {
							escritor.append(manzanas.get(a).getTipoManzana()+";"+manzanas.get(a).getProcedencia()+";"+manzanas.get(a).getColor()+";"+manzanas.get(a).getEurosKilo()+";"+manzanas.get(a).getCodBarras()+"\n");
						}
						escritor.close();
					}catch(Exception z) {
						System.out.println("Error, no se puede escribir en el fichero: "+z);
					}
	}
}