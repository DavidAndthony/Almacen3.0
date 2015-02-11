package clases;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Distribuidores extends Distribuidor {
	
	ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();

	public void leerDistribuidores(){
	
	try{

		
		FileInputStream fis = new FileInputStream("distribuidores.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF8");
		BufferedReader br = new BufferedReader(isr);

		String linea = br.readLine();
		String [] campos = null;


		while(linea != null){

			Distribuidor distribuidor = new Distribuidor();
			Direccion direccion = new Direccion();
			Contacto contacto = new Contacto();

			campos = linea.split("#");
			
			String distri = campos[0];
			String [] campos2 = distri.split(",");
			distribuidor.setNombre(campos2[0]);
			distribuidor.setCif(campos2[1]);
            //direccion 
			distri = campos[1];
			campos2 = distri.split(",");
			direccion.setCiudad(campos2[0]);
			int entero = Integer.parseInt(campos2[1]);
			direccion.setCodigoPostal(entero);
			direccion.setCalle(campos2[2]);
			entero = Integer.parseInt(campos2[3]);
			direccion.setNumero(entero);

			distribuidor.setDireccion(direccion);
			//contacto
			distri = campos[2];
			campos2 = distri.split(",");
			contacto.setNombre(campos2[0]);
			contacto.setApellido(campos2[1]);
			entero = Integer.parseInt(campos2[2]);
			contacto.setNumTelefonico(entero);
			entero = Integer.parseInt(campos2[3]);
			contacto.setEdad(entero);

			distribuidor.setContacto(contacto);

			distribuidores.add(distribuidor);
			linea = br.readLine();

		}

	}	catch(Exception ioe) {
		System.out.println("aqui hay un error: "+ioe);
		}
	}
	
	public void mostrarDistribuidores (){
		for (int i=0;i<distribuidores.size() ;i++ ) {
			
			Direccion direc = new Direccion();
			Contacto contact = new Contacto();
			
			System.out.println("\nProveedor nº: " + (i + 1));
			System.out.println("<><><><><><><><><><><><><><><><><><><><>");
			System.out.println("Nombre: " + (distribuidores.get(i).getNombre()));
			System.out.println("Cif: " + (distribuidores.get(i).getCif()));
			
			direc = distribuidores.get(i).getDireccion();
			System.out.println("\tCiudad: " + direc.getCiudad());
			System.out.println("\tCod.postal: " + direc.getCodigoPostal());
			System.out.println("\tCalle: " + direc.getCalle());
			System.out.println("\tCalle: " + direc.getNumero());
			
			contact = distribuidores.get(i).getContacto();
			System.out.println("\tNombre: " + contact.getNombre());
			System.out.println("\tApellido: " + contact.getApellido());
			System.out.println("\tnumero telefonico: " + contact.getNumTelefonico());
			System.out.println("\tedad: " + contact.getEdad());

			}
	}

}
