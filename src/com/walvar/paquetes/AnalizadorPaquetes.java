package com.walvar.paquetes;

public class AnalizadorPaquetes {

	private String texto;
	
	public AnalizadorPaquetes(String texto) {
		//Program_X:5.2_Y:3.1_ram
		if (texto != null && texto.startsWith("Program") && texto.endsWith("ram") && texto.length() >= 12) {
			this.texto = texto;
		} else {
			var mensaje = "El texto no cumple con el formato: %s ".formatted(texto);
			throw new IllegalArgumentException(mensaje);
		}
	}
	
	public Double extraerX(){
		var inicio =  this.texto.indexOf("X:") + 2 ;
		var fin = this.texto.indexOf("_Y");
		var posicionX = this.texto.substring(inicio, fin);
		return Double.parseDouble(posicionX);
	}
	
	public Double extraerY() {
		var inicio =  this.texto.indexOf("Y:") + 2 ;
		var fin = this.texto.indexOf("_ram");
		var posicionY = this.texto.substring(inicio, fin);
		return Double.parseDouble(posicionY);
	}
	
	public static AnalizadorPaquetes coordenadas(String texto) {
		return new AnalizadorPaquetes(texto);
	}
	
	public Double getCoordenadaX() { return extraerX(); }
	public Double getCoordenadaY() { return extraerY(); }
	
}
