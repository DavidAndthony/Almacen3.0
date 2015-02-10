public class Leche {

//Declaracion de variables
	private String tipo, procedencia;
	private Double eurosLitro;
	private Distribuidor distribuidor;
	private int codBarras;
//Constructor
	public Leche(){}
//Métodos getter y setter
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getProcedencia() {
		return this.procedencia;
	}
	public void setProcedencia(String proce) {
		this.procedencia = proce;
	}

	public Double getEurosLitro() {
		return this.eurosLitro;
	}
	public void setEurosLitro(Double euros) {
		this.eurosLitro = euros;
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

	public void crearLeche(){

		System.out.println("\n¿Cuantos tipos de leche quieres registrar?: ");
					opcion = sc.nextInt();
//crear y mostrar leches
					for(int o = 0; o < opcion; o++) {
						Leche leche = new Leche();
						System.out.println("\nIntroduce el código de barras: ");
						leche.setCodBarras(sc.nextInt());
						System.out.println("\nTipo de leche: ");
						leche.setTipo(sc.next());
						System.out.println("Procedencia de la leche: ");
						leche.setProcedencia(sc.next());
						System.out.println("€/L: ");
						leche.setEurosLitro(sc.nextDouble());
						System.out.println("Nombre del distribuidor: ");
						Distribuidor distribuidor = new Distribuidor();
						distribuidor.setNombre(sc.next());
						for(int d = 0; d < distribuidores.size(); d++) {
							if((distribuidores.get(d).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
								leche.setDistribuidor(distribuidores.get(d));
							}
						}
						leches.add(leche);
					}

					System.out.println("\nLos tipos de leche: \n");

					for(int l = 0; l < leches.size(); l++) {
						System.out.println("Leche nº" + (l + 1));
						System.out.println("*************************************************");
						System.out.println("Código de barras: "+(leches.get(l).getCodBarras()));
						System.out.println("Tipo de leche: "+(leches.get(l).getTipo()));
						System.out.println("Prcedencia: "+(leches.get(l).getProcedencia()));
						System.out.println("€/L: "+(leches.get(l).getEurosLitro()));
						Distribuidor distribuidor = leches.get(l).getDistribuidor();
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
//escribir en el fichero
					File listaLeches = new File("./listaLeches.txt");
					System.out.println("\nCreando el archivo listaLeches.txt...");
					try{
						if(listaLeches.createNewFile()) {
							System.out.println("\nArchivo creado correctamente.");
						}
					}catch(Exception ioe) {
						System.out.println("Error creando el archivo: "+ioe);
					}
					try {
						System.out.println("\nEscribiendo en el fichero listaLeches.txt...");
						FileWriter escritor = new FileWriter(listaLeches);
						for(int a=0; a<leches.size(); a++) {
							escritor.append(leches.get(a).getTipo()+";"+leches.get(a).getProcedencia()+";"+leches.get(a).getEurosLitro()+";"+leches.get(a).getCodBarras()+"\n");
						}
						escritor.close();
					}catch(Exception z) {
						System.out.println("Error, no se puede escribir en el fichero: "+z);
					}
	}

}