package com.walvar.paquetes;

public class Main {

	public static void main(String[] args) {
		try {
			//prueba de formato a leer: Linea correcta --> Program_X:5.2_Y:3.1_ram
			var paquete = AnalizadorPaquetes.coordenadas("Program_X:5.2_Y:3.1_ram");
			System.out.println("Las coordenas son X: %.2f , Y: %.2f ".formatted(paquete.getCoordenadaX(), paquete.getCoordenadaY()));
		} catch (IllegalArgumentException exception) {
			System.out.println("No se pudo procesar la solicitud");
			System.out.println("Motivo: %s ".formatted(exception.getMessage()));
		}
		
		
	}

}
