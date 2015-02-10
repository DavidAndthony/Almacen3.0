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




public class Distribuidor {
//Declaración de variables
	private String nombre, cif;
	private Direccion direccion;
	private Contacto personaContacto;
//Constructor
	public Distribuidor() {}
//Métodos getter y setter
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getCif() {
		return this.cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}

	public Direccion getDireccion() {
		return this.direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Contacto getContacto() {
		return this.personaContacto;
	}
	public void setContacto(Contacto contacto) {
		this.personaContacto = contacto;
	}

	public void mostrarDistribuidores(){

		for(int i=0; i < distribuidores.size(); i++) {
							Direccion direc = new Direccion();
							Contacto contact = new Contacto();
							System.out.println("\nDistribuidor nº: " + (i + 1));
							System.out.println("*************************************************");
							System.out.println("Nombre: " + (distribuidores.get(i).getNombre()));
							System.out.println("Cif: " + (distribuidores.get(i).getCif()));
							direc = distribuidores.get(i).getDireccion();
							System.out.println("Direccion: ");
							System.out.println("\tCiudad: " + direc.getCiudad());
							System.out.println("\tCalle: " + direc.getCalle());
							System.out.println("\tNúmero: " + direc.getNumero());
							System.out.println("\tPiso: " + direc.getPiso());
							System.out.println("\tLetra: " + direc.getLetra());
							System.out.println("\tCod.postal: " + direc.getCodPostal());
							contact = distribuidores.get(i).getContacto();
							System.out.println("Contacto: ");
							System.out.println("\tNombre: " + contact.getNombre());
							System.out.println("\tApellido: " + contact.getApellido());
							System.out.println("\tE-mail: " + contact.getEmail());
							System.out.println("\tTeléfono: " + contact.getTelefono());
							System.out.println("*************************************************");
						}
					
	}
}