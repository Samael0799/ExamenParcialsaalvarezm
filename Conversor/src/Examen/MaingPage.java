package Examen;

import java.util.Scanner;

public class MaingPage {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		byte opciones;
		double Bytes, Kilobytes;
		boolean salir = false;
		
		while (!salir) {
			
		System.out.println("Ingrese la opcion deseada");
		
		System.out.println("1. De Bytes a Kilobytes");
		System.out.println("2. De Kilobytes a Bytes");
		System.out.println("3. Salir");
		
opciones = datos.nextByte();
		
		switch(opciones) {
		case 1: 
		System.out.println("Ingrese la cantidad a convertir");
		Bytes = datos.nextDouble();
		Kilobytes = Bytes*1024;
		System.out.println(Bytes+" Bytes equivalen a "+Kilobytes+" Kilobytes.");
		break;
		case 2: 
		System.out.println("Ingrese la cantidad a convertir");
		Kilobytes = datos.nextDouble();
		Bytes = Kilobytes/1024;
		System.out.println(Kilobytes+ " Kilobytes equivalen a "+Bytes+" Bytes");
		break;
		case 3:
			 salir=true;
				break;
				default:
					System.out.println("Ingrese una opcion valida");

	}
	}

	}
}
