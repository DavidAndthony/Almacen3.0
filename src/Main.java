/*Programa que en función de los productos creados, suma el 
valor de todos y nos devuelve el total aplicado el descuento del cliente.
Si no creamos productos la cuenta siempre será 0.
*/

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

public class Main {
	 public static void main(String[] args) {
	 	ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
	 	ArrayList<Leche> leches = new ArrayList<Leche>();
	 	ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
	 	ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
	 	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	 	Scanner sc = new Scanner(System.in);
	 	Cesta cesta = new Cesta();//lo utilizo en dos case diferentes
		
		String linea;
		String [] campos = null;

	 	System.out.println("\n¿Que quieres hacer?: ");
		System.out.println("\nMenu:");
		System.out.println("************************************************");
		System.out.println("Mostrar distribuidores-------------------------1");
		System.out.println("Mostrar clientes-------------------------------2");
		System.out.println("Crear y mostrar lechugas-----------------------3");
		System.out.println("Crear y mostrar manzanas-----------------------4");
		System.out.println("Crear y mostrar tipos de leche-----------------5");
		System.out.println("Leer y mostrar clientes------------------------6");
		System.out.println("Ver la cesta de la compra----------------------7");
		System.out.println("Finalizar compra-------------------------------8");
		System.out.println("Salir------------------------------------------0");
		System.out.println("************************************************");
		int op = sc.nextInt();

		Lector leo = new lector();

		leo.leer();


//while del switch para acabar con 0
		while(op != 0){
			switch(op) {
//mostrar Distribuidores
				case 1:
					
					Distribuidor distrib = new Distribuidor(); 

					distrib.mostrarDistribuidores();

				break;

				case 2:

					Cliente client = new Cliente();
					client.mostrarCliente();
					
				break;

				case 3:
						Lechuga lech = new Lechuga();
						lech.crearLechuga();

					break;

					case 4:
							
						Manzana manz = new Manzana();
						
						manz.crearManzana();	


				break;

				case 5:
						
						Leche leche = new Leche();

						leche.crearLeche();	


				break;

				case 6:

						leo.leer2();

				break;

				case 7:
/*Lee los ArrayList de productos, muestra el codBarras y el Nombre y utiliza 
el método calcularSinDescuento de la clase Cesta para mostrar el total de los
productos almacenados y su valor total sin descuentos de cliente
*/				cesta.cesta2();	
					
				break;

				case 8:
/*Introduciendo el número de socio lo busca en el ArrayList de clientes
leido al principio del programa y lo adjudica en el objeto cesta.
Utilizamos el método de la clase Cesta para calcular el total con 
descuentos aplicados, pásandole como argumentos los ArrayList de 
productos y el objeto cliente de la clase Cesta
*/
					cesta.cesta3();
				break;

				default:
					System.out.println("Eso no es una opción...");
			}
			System.out.println("\n¿Que quieres hacer?: ");
			System.out.println("\nMenu:");
			System.out.println("************************************************");
			System.out.println("Mostrar distribuidores-------------------------1");
			System.out.println("Mostrar clientes-------------------------------2");
			System.out.println("Crear y mostrar lechugas-----------------------3");
			System.out.println("Crear y mostrar manzanas-----------------------4");
			System.out.println("Crear y mostrar tipos de leche-----------------5");
			System.out.println("Leer y mostrar clientes------------------------6");
			System.out.println("Ver la cesta de la compra----------------------7");
			System.out.println("Finalizar compra-------------------------------8");
			System.out.println("Salir------------------------------------------0");
			System.out.println("************************************************");
			op = sc.nextInt();
		}
	}
}
