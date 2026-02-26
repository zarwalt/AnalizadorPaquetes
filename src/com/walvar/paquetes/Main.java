package com.walvar.paquetes;

public class Main {

	public static void main(String[] args) {
		//prueba de formato a leer arrelgo String: estructura Linea correcta --> Program_X:5.2_Y:3.1_ram
						
		String[] paquetes = {"Program_X:5.2_Y:2.1_ram", "Program_X:3.2_Y:1.1_ram",
				"Program_X:6.2_Y:4.1_ram", "Trogram_X:7.2_Y:8.1_ram",
				"Program_X:1.2_Y:9.1_ram", "Program_X:4.2_Y:2.1_ramn"};
		
		// Lectura for clasico	
		for (int i = 0; i < paquetes.length; i++) {
			System.out.println("Posicion: %d, Texto: %s".formatted(i, paquetes[i]));
		}
		
		//	lectura for enhanced
		for (String paquete : paquetes) {
			try {
				var cadena = AnalizadorPaquetes.coordenadas(paquete);
				System.out.println("Las coordenadas de %s, son X: %.2f - Y: %.2f".formatted(paquete, cadena.getCoordenadaX(), cadena.getCoordenadaY()));
			} catch (IllegalArgumentException exception) {
				System.out.println("No se pudo procesar la solicitud");
				System.out.println("Motivo: %s ".formatted(exception.getMessage()));
			}
		}	
	}
}
